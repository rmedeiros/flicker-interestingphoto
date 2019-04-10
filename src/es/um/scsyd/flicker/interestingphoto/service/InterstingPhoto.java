package es.um.scsyd.flicker.interestingphoto.service;

import java.net.URI;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import es.um.scsyd.flicker.interestingphoto.flicker.FlickrAPI;
import es.um.scsyd.flicker.interestingphoto.flicker.FlickrAPI.flickr_interestingness_getList;
import es.um.scsyd.flicker.interestingphoto.flicker.FlickrAPI.flickr_photos_getInfo;
import es.um.scsyd.flicker.interestingphoto.flicker.jsonUtils.ObjPath;

@Path("/interestingPhoto")
public class InterstingPhoto {

	private final String FLICKER_KEY = "9a0554259914a86fb9e7eb014e4e5d52";

	@GET
	@Path("/{tag}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getInterstingPhoto(@PathParam("tag") String tag) {
		String photoId = findInterestingPhotoByTag(tag);
		// Return an 404 error if there is not photo with the requiered tag.
		if ("".equals(photoId) || photoId == null) {
			return Response.status(Response.Status.NOT_FOUND).entity("No interesting photo found for the tag: " + tag)
					.build();
		}
		FlickrAPI.flickr_photos_getSizes sizes = new FlickrAPI.flickr_photos_getSizes();
		sizes.set_api_key(FLICKER_KEY);
		sizes.set_photo_id(photoId);
		Map<String, Object> response = sizes.call();
		String url = findOriginalSize(response);
		return Response.temporaryRedirect(URI.create(url)).build();

	}

	@SuppressWarnings("unchecked")
	private String findOriginalSize(Map<String, Object> response) {
		int size = ((List<Object>) ObjPath.in(response).o("sizes").o("size").value()).size();
		String url = "";
		for (int i = 0; i < size; i++) {
			if ("Original"
					.equalsIgnoreCase((String) ObjPath.in(response).o("sizes").o("size").a(i).o("label").value())) {
				url = (String) ObjPath.in(response).o("sizes").o("size").a(i).o("source").value();
			}
		}
		// If the image has not an url to its original size, return the last size of the
		// array
		if (url.equals("")) {
			url = (String) ObjPath.in(response).o("sizes").o("size").a(size - 1).o("source").value();
		}
		return url;
	}

	@SuppressWarnings("unchecked")
	private String findInterestingPhotoByTag(String tag) {
		flickr_interestingness_getList interests = new FlickrAPI.flickr_interestingness_getList();
		interests.set_api_key("9a0554259914a86fb9e7eb014e4e5d52");
		Map<String, Object> response = interests.call();
		flickr_photos_getInfo photoInfo = new flickr_photos_getInfo();
		photoInfo.set_api_key("9a0554259914a86fb9e7eb014e4e5d52");
		Map<String, Object> photo;
		int pages = (int) ObjPath.in(response).o("photos").o("pages").value();
		String tagName;
		for (int i = 0; i < pages; i++) {
			interests.set_page(String.valueOf(i));
			response = interests.call();
			int perPage = ((List<Object>) ObjPath.in(response).o("photos").o("photo").value()).size();
			for (int j = 0; j < perPage; j++) {
				photoInfo.set_photo_id(ObjPath.in(response).o("photos").o("photo").a(j).o("id").value().toString());
				photo = photoInfo.call();
				int tagsSize = ((List<Object>) ObjPath.in(photo).o("photo").o("tags").o("tag").value()).size();
				for (int k = 0; k < tagsSize; k++) {
					tagName = (String) ObjPath.in(photo).o("photo").o("tags").o("tag").a(k).o("raw").value();
					if (tag.equalsIgnoreCase(tagName)) {
						return ObjPath.in(response).o("photos").o("photo").a(j).o("id").value().toString();
					}
				}
			}
		}
		return "";
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return " Hello Jersey ";
	}

}
