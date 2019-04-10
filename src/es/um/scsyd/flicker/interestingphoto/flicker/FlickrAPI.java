package es.um.scsyd.flicker.interestingphoto.flicker;


public class FlickrAPI {

public static class flickr_photos_notes_edit extends FlickrMethod {
    private String apiMethod="flickr.photos.notes.edit";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_note_id(){
      return parameters.get("note_id");
    }
    public void set_note_id(    String note_id){
      parameters.put("note_id",note_id);
    }
    public String get_note_x(){
      return parameters.get("note_x");
    }
    public void set_note_x(    String note_x){
      parameters.put("note_x",note_x);
    }
    public String get_note_y(){
      return parameters.get("note_y");
    }
    public void set_note_y(    String note_y){
      parameters.put("note_y",note_y);
    }
    public String get_note_w(){
      return parameters.get("note_w");
    }
    public void set_note_w(    String note_w){
      parameters.put("note_w",note_w);
    }
    public String get_note_h(){
      return parameters.get("note_h");
    }
    public void set_note_h(    String note_h){
      parameters.put("note_h",note_h);
    }
    public String get_note_text(){
      return parameters.get("note_text");
    }
    public void set_note_text(    String note_text){
      parameters.put("note_text",note_text);
    }
  }
public static class flickr_galleries_editMeta extends FlickrMethod {
    private String apiMethod="flickr.galleries.editMeta";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_gallery_id(){
      return parameters.get("gallery_id");
    }
    public void set_gallery_id(    String gallery_id){
      parameters.put("gallery_id",gallery_id);
    }
    public String get_title(){
      return parameters.get("title");
    }
    public void set_title(    String title){
      parameters.put("title",title);
    }
    public String get_description(){
      return parameters.get("description");
    }
    public void set_description(    String description){
      parameters.put("description",description);
    }
  }
public static class flickr_photos_comments_addComment extends FlickrMethod {
    private String apiMethod="flickr.photos.comments.addComment";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_comment_text(){
      return parameters.get("comment_text");
    }
    public void set_comment_text(    String comment_text){
      parameters.put("comment_text",comment_text);
    }
  }
public static class flickr_urls_getGroup extends FlickrMethod {
    private String apiMethod="flickr.urls.getGroup";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
  }
public static class flickr_photosets_getContext extends FlickrMethod {
    private String apiMethod="flickr.photosets.getContext";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
  }
public static class flickr_tags_getRelated extends FlickrMethod {
    private String apiMethod="flickr.tags.getRelated";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_tag(){
      return parameters.get("tag");
    }
    public void set_tag(    String tag){
      parameters.put("tag",tag);
    }
  }
public static class flickr_test_echo extends FlickrMethod {
    private String apiMethod="flickr.test.echo";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_photos_comments_getRecentForContacts extends FlickrMethod {
    private String apiMethod="flickr.photos.comments.getRecentForContacts";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date_lastcomment(){
      return parameters.get("date_lastcomment");
    }
    public void set_date_lastcomment(    String date_lastcomment){
      parameters.put("date_lastcomment",date_lastcomment);
    }
    public String get_contacts_filter(){
      return parameters.get("contacts_filter");
    }
    public void set_contacts_filter(    String contacts_filter){
      parameters.put("contacts_filter",contacts_filter);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_push_subscribe extends FlickrMethod {
    private String apiMethod="flickr.push.subscribe";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_topic(){
      return parameters.get("topic");
    }
    public void set_topic(    String topic){
      parameters.put("topic",topic);
    }
    public String get_callback(){
      return parameters.get("callback");
    }
    public void set_callback(    String callback){
      parameters.put("callback",callback);
    }
    public String get_verify(){
      return parameters.get("verify");
    }
    public void set_verify(    String verify){
      parameters.put("verify",verify);
    }
    public String get_verify_token(){
      return parameters.get("verify_token");
    }
    public void set_verify_token(    String verify_token){
      parameters.put("verify_token",verify_token);
    }
    public String get_lease_seconds(){
      return parameters.get("lease_seconds");
    }
    public void set_lease_seconds(    String lease_seconds){
      parameters.put("lease_seconds",lease_seconds);
    }
    public String get_woe_ids(){
      return parameters.get("woe_ids");
    }
    public void set_woe_ids(    String woe_ids){
      parameters.put("woe_ids",woe_ids);
    }
    public String get_place_ids(){
      return parameters.get("place_ids");
    }
    public void set_place_ids(    String place_ids){
      parameters.put("place_ids",place_ids);
    }
    public String get_lat(){
      return parameters.get("lat");
    }
    public void set_lat(    String lat){
      parameters.put("lat",lat);
    }
    public String get_lon(){
      return parameters.get("lon");
    }
    public void set_lon(    String lon){
      parameters.put("lon",lon);
    }
    public String get_radius(){
      return parameters.get("radius");
    }
    public void set_radius(    String radius){
      parameters.put("radius",radius);
    }
    public String get_radius_units(){
      return parameters.get("radius_units");
    }
    public void set_radius_units(    String radius_units){
      parameters.put("radius_units",radius_units);
    }
    public String get_accuracy(){
      return parameters.get("accuracy");
    }
    public void set_accuracy(    String accuracy){
      parameters.put("accuracy",accuracy);
    }
    public String get_nsids(){
      return parameters.get("nsids");
    }
    public void set_nsids(    String nsids){
      parameters.put("nsids",nsids);
    }
    public String get_tags(){
      return parameters.get("tags");
    }
    public void set_tags(    String tags){
      parameters.put("tags",tags);
    }
  }
public static class flickr_urls_lookupUser extends FlickrMethod {
    private String apiMethod="flickr.urls.lookupUser";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_url(){
      return parameters.get("url");
    }
    public void set_url(    String url){
      parameters.put("url",url);
    }
  }
public static class flickr_favorites_getList extends FlickrMethod {
    private String apiMethod="flickr.favorites.getList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_min_fave_date(){
      return parameters.get("min_fave_date");
    }
    public void set_min_fave_date(    String min_fave_date){
      parameters.put("min_fave_date",min_fave_date);
    }
    public String get_max_fave_date(){
      return parameters.get("max_fave_date");
    }
    public void set_max_fave_date(    String max_fave_date){
      parameters.put("max_fave_date",max_fave_date);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_people_getPublicPhotos extends FlickrMethod {
    private String apiMethod="flickr.people.getPublicPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_safe_search(){
      return parameters.get("safe_search");
    }
    public void set_safe_search(    String safe_search){
      parameters.put("safe_search",safe_search);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_blogs_getServices extends FlickrMethod {
    private String apiMethod="flickr.blogs.getServices";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_people_getPublicGroups extends FlickrMethod {
    private String apiMethod="flickr.people.getPublicGroups";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_invitation_only(){
      return parameters.get("invitation_only");
    }
    public void set_invitation_only(    String invitation_only){
      parameters.put("invitation_only",invitation_only);
    }
  }
public static class flickr_contacts_getListRecentlyUploaded extends FlickrMethod {
    private String apiMethod="flickr.contacts.getListRecentlyUploaded";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date_lastupload(){
      return parameters.get("date_lastupload");
    }
    public void set_date_lastupload(    String date_lastupload){
      parameters.put("date_lastupload",date_lastupload);
    }
    public String get_filter(){
      return parameters.get("filter");
    }
    public void set_filter(    String filter){
      parameters.put("filter",filter);
    }
  }
public static class flickr_prefs_getHidden extends FlickrMethod {
    private String apiMethod="flickr.prefs.getHidden";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_tags_getListUserRaw extends FlickrMethod {
    private String apiMethod="flickr.tags.getListUserRaw";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_tag(){
      return parameters.get("tag");
    }
    public void set_tag(    String tag){
      parameters.put("tag",tag);
    }
  }
public static class flickr_stats_getCollectionDomains extends FlickrMethod {
    private String apiMethod="flickr.stats.getCollectionDomains";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
    public String get_collection_id(){
      return parameters.get("collection_id");
    }
    public void set_collection_id(    String collection_id){
      parameters.put("collection_id",collection_id);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_urls_lookupGallery extends FlickrMethod {
    private String apiMethod="flickr.urls.lookupGallery";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_url(){
      return parameters.get("url");
    }
    public void set_url(    String url){
      parameters.put("url",url);
    }
  }
public static class flickr_auth_getFullToken extends FlickrMethod {
    private String apiMethod="flickr.auth.getFullToken";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_mini_token(){
      return parameters.get("mini_token");
    }
    public void set_mini_token(    String mini_token){
      parameters.put("mini_token",mini_token);
    }
  }
public static class flickr_photos_getContactsPhotos extends FlickrMethod {
    private String apiMethod="flickr.photos.getContactsPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_count(){
      return parameters.get("count");
    }
    public void set_count(    String count){
      parameters.put("count",count);
    }
    public String get_just_friends(){
      return parameters.get("just_friends");
    }
    public void set_just_friends(    String just_friends){
      parameters.put("just_friends",just_friends);
    }
    public String get_single_photo(){
      return parameters.get("single_photo");
    }
    public void set_single_photo(    String single_photo){
      parameters.put("single_photo",single_photo);
    }
    public String get_include_self(){
      return parameters.get("include_self");
    }
    public void set_include_self(    String include_self){
      parameters.put("include_self",include_self);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
  }
public static class flickr_places_getInfo extends FlickrMethod {
    private String apiMethod="flickr.places.getInfo";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_place_id(){
      return parameters.get("place_id");
    }
    public void set_place_id(    String place_id){
      parameters.put("place_id",place_id);
    }
    public String get_woe_id(){
      return parameters.get("woe_id");
    }
    public void set_woe_id(    String woe_id){
      parameters.put("woe_id",woe_id);
    }
  }
public static class flickr_collections_getTree extends FlickrMethod {
    private String apiMethod="flickr.collections.getTree";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_collection_id(){
      return parameters.get("collection_id");
    }
    public void set_collection_id(    String collection_id){
      parameters.put("collection_id",collection_id);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
  }
public static class flickr_places_resolvePlaceId extends FlickrMethod {
    private String apiMethod="flickr.places.resolvePlaceId";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_place_id(){
      return parameters.get("place_id");
    }
    public void set_place_id(    String place_id){
      parameters.put("place_id",place_id);
    }
  }
public static class flickr_places_getInfoByUrl extends FlickrMethod {
    private String apiMethod="flickr.places.getInfoByUrl";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_url(){
      return parameters.get("url");
    }
    public void set_url(    String url){
      parameters.put("url",url);
    }
  }
public static class flickr_stats_getPhotostreamStats extends FlickrMethod {
    private String apiMethod="flickr.stats.getPhotostreamStats";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
  }
public static class flickr_places_getTopPlacesList extends FlickrMethod {
    private String apiMethod="flickr.places.getTopPlacesList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_place_type_id(){
      return parameters.get("place_type_id");
    }
    public void set_place_type_id(    String place_type_id){
      parameters.put("place_type_id",place_type_id);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
    public String get_woe_id(){
      return parameters.get("woe_id");
    }
    public void set_woe_id(    String woe_id){
      parameters.put("woe_id",woe_id);
    }
    public String get_place_id(){
      return parameters.get("place_id");
    }
    public void set_place_id(    String place_id){
      parameters.put("place_id",place_id);
    }
  }
public static class flickr_photos_people_add extends FlickrMethod {
    private String apiMethod="flickr.photos.people.add";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_person_x(){
      return parameters.get("person_x");
    }
    public void set_person_x(    String person_x){
      parameters.put("person_x",person_x);
    }
    public String get_person_y(){
      return parameters.get("person_y");
    }
    public void set_person_y(    String person_y){
      parameters.put("person_y",person_y);
    }
    public String get_person_w(){
      return parameters.get("person_w");
    }
    public void set_person_w(    String person_w){
      parameters.put("person_w",person_w);
    }
    public String get_person_h(){
      return parameters.get("person_h");
    }
    public void set_person_h(    String person_h){
      parameters.put("person_h",person_h);
    }
  }
public static class flickr_groups_discuss_topics_getInfo extends FlickrMethod {
    private String apiMethod="flickr.groups.discuss.topics.getInfo";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_topic_id(){
      return parameters.get("topic_id");
    }
    public void set_topic_id(    String topic_id){
      parameters.put("topic_id",topic_id);
    }
  }
public static class flickr_prefs_getContentType extends FlickrMethod {
    private String apiMethod="flickr.prefs.getContentType";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_galleries_editPhoto extends FlickrMethod {
    private String apiMethod="flickr.galleries.editPhoto";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_gallery_id(){
      return parameters.get("gallery_id");
    }
    public void set_gallery_id(    String gallery_id){
      parameters.put("gallery_id",gallery_id);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_comment(){
      return parameters.get("comment");
    }
    public void set_comment(    String comment){
      parameters.put("comment",comment);
    }
  }
public static class flickr_photosets_getPhotos extends FlickrMethod {
    private String apiMethod="flickr.photosets.getPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
    public String get_privacy_filter(){
      return parameters.get("privacy_filter");
    }
    public void set_privacy_filter(    String privacy_filter){
      parameters.put("privacy_filter",privacy_filter);
    }
    public String get_media(){
      return parameters.get("media");
    }
    public void set_media(    String media){
      parameters.put("media",media);
    }
  }
public static class flickr_photos_getCounts extends FlickrMethod {
    private String apiMethod="flickr.photos.getCounts";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_dates(){
      return parameters.get("dates");
    }
    public void set_dates(    String dates){
      parameters.put("dates",dates);
    }
    public String get_taken_dates(){
      return parameters.get("taken_dates");
    }
    public void set_taken_dates(    String taken_dates){
      parameters.put("taken_dates",taken_dates);
    }
  }
public static class flickr_photosets_editMeta extends FlickrMethod {
    private String apiMethod="flickr.photosets.editMeta";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
    public String get_title(){
      return parameters.get("title");
    }
    public void set_title(    String title){
      parameters.put("title",title);
    }
    public String get_description(){
      return parameters.get("description");
    }
    public void set_description(    String description){
      parameters.put("description",description);
    }
  }
public static class flickr_photosets_create extends FlickrMethod {
    private String apiMethod="flickr.photosets.create";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_title(){
      return parameters.get("title");
    }
    public void set_title(    String title){
      parameters.put("title",title);
    }
    public String get_description(){
      return parameters.get("description");
    }
    public void set_description(    String description){
      parameters.put("description",description);
    }
    public String get_primary_photo_id(){
      return parameters.get("primary_photo_id");
    }
    public void set_primary_photo_id(    String primary_photo_id){
      parameters.put("primary_photo_id",primary_photo_id);
    }
  }
public static class flickr_contacts_getPublicList extends FlickrMethod {
    private String apiMethod="flickr.contacts.getPublicList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
  }
public static class flickr_groups_joinRequest extends FlickrMethod {
    private String apiMethod="flickr.groups.joinRequest";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_message(){
      return parameters.get("message");
    }
    public void set_message(    String message){
      parameters.put("message",message);
    }
    public String get_accept_rules(){
      return parameters.get("accept_rules");
    }
    public void set_accept_rules(    String accept_rules){
      parameters.put("accept_rules",accept_rules);
    }
  }
public static class flickr_photosets_removePhoto extends FlickrMethod {
    private String apiMethod="flickr.photosets.removePhoto";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_photos_geo_photosForLocation extends FlickrMethod {
    private String apiMethod="flickr.photos.geo.photosForLocation";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_lat(){
      return parameters.get("lat");
    }
    public void set_lat(    String lat){
      parameters.put("lat",lat);
    }
    public String get_lon(){
      return parameters.get("lon");
    }
    public void set_lon(    String lon){
      parameters.put("lon",lon);
    }
    public String get_accuracy(){
      return parameters.get("accuracy");
    }
    public void set_accuracy(    String accuracy){
      parameters.put("accuracy",accuracy);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_tags_getListPhoto extends FlickrMethod {
    private String apiMethod="flickr.tags.getListPhoto";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_photosets_setPrimaryPhoto extends FlickrMethod {
    private String apiMethod="flickr.photosets.setPrimaryPhoto";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_groups_discuss_topics_getList extends FlickrMethod {
    private String apiMethod="flickr.groups.discuss.topics.getList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_push_getTopics extends FlickrMethod {
    private String apiMethod="flickr.push.getTopics";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_tags_getHotList extends FlickrMethod {
    private String apiMethod="flickr.tags.getHotList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_period(){
      return parameters.get("period");
    }
    public void set_period(    String period){
      parameters.put("period",period);
    }
    public String get_count(){
      return parameters.get("count");
    }
    public void set_count(    String count){
      parameters.put("count",count);
    }
  }
public static class flickr_photos_getSizes extends FlickrMethod {
    private String apiMethod="flickr.photos.getSizes";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_photos_getWithGeoData extends FlickrMethod {
    private String apiMethod="flickr.photos.getWithGeoData";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_min_upload_date(){
      return parameters.get("min_upload_date");
    }
    public void set_min_upload_date(    String min_upload_date){
      parameters.put("min_upload_date",min_upload_date);
    }
    public String get_max_upload_date(){
      return parameters.get("max_upload_date");
    }
    public void set_max_upload_date(    String max_upload_date){
      parameters.put("max_upload_date",max_upload_date);
    }
    public String get_min_taken_date(){
      return parameters.get("min_taken_date");
    }
    public void set_min_taken_date(    String min_taken_date){
      parameters.put("min_taken_date",min_taken_date);
    }
    public String get_max_taken_date(){
      return parameters.get("max_taken_date");
    }
    public void set_max_taken_date(    String max_taken_date){
      parameters.put("max_taken_date",max_taken_date);
    }
    public String get_privacy_filter(){
      return parameters.get("privacy_filter");
    }
    public void set_privacy_filter(    String privacy_filter){
      parameters.put("privacy_filter",privacy_filter);
    }
    public String get_sort(){
      return parameters.get("sort");
    }
    public void set_sort(    String sort){
      parameters.put("sort",sort);
    }
    public String get_media(){
      return parameters.get("media");
    }
    public void set_media(    String media){
      parameters.put("media",media);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photos_suggestions_approveSuggestion extends FlickrMethod {
    private String apiMethod="flickr.photos.suggestions.approveSuggestion";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_suggestion_id(){
      return parameters.get("suggestion_id");
    }
    public void set_suggestion_id(    String suggestion_id){
      parameters.put("suggestion_id",suggestion_id);
    }
  }
public static class flickr_groups_pools_getPhotos extends FlickrMethod {
    private String apiMethod="flickr.groups.pools.getPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_tags(){
      return parameters.get("tags");
    }
    public void set_tags(    String tags){
      parameters.put("tags",tags);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photos_notes_delete extends FlickrMethod {
    private String apiMethod="flickr.photos.notes.delete";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_note_id(){
      return parameters.get("note_id");
    }
    public void set_note_id(    String note_id){
      parameters.put("note_id",note_id);
    }
  }
public static class flickr_photos_getRecent extends FlickrMethod {
    private String apiMethod="flickr.photos.getRecent";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_tags_getListUser extends FlickrMethod {
    private String apiMethod="flickr.tags.getListUser";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
  }
public static class flickr_groups_search extends FlickrMethod {
    private String apiMethod="flickr.groups.search";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_text(){
      return parameters.get("text");
    }
    public void set_text(    String text){
      parameters.put("text",text);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photos_setDates extends FlickrMethod {
    private String apiMethod="flickr.photos.setDates";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_date_posted(){
      return parameters.get("date_posted");
    }
    public void set_date_posted(    String date_posted){
      parameters.put("date_posted",date_posted);
    }
    public String get_date_taken(){
      return parameters.get("date_taken");
    }
    public void set_date_taken(    String date_taken){
      parameters.put("date_taken",date_taken);
    }
    public String get_date_taken_granularity(){
      return parameters.get("date_taken_granularity");
    }
    public void set_date_taken_granularity(    String date_taken_granularity){
      parameters.put("date_taken_granularity",date_taken_granularity);
    }
  }
public static class flickr_people_getLimits extends FlickrMethod {
    private String apiMethod="flickr.people.getLimits";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_photos_getExif extends FlickrMethod {
    private String apiMethod="flickr.photos.getExif";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_secret(){
      return parameters.get("secret");
    }
    public void set_secret(    String secret){
      parameters.put("secret",secret);
    }
  }
public static class flickr_commons_getInstitutions extends FlickrMethod {
    private String apiMethod="flickr.commons.getInstitutions";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_reflection_getMethods extends FlickrMethod {
    private String apiMethod="flickr.reflection.getMethods";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_stats_getPhotosetReferrers extends FlickrMethod {
    private String apiMethod="flickr.stats.getPhotosetReferrers";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
    public String get_domain(){
      return parameters.get("domain");
    }
    public void set_domain(    String domain){
      parameters.put("domain",domain);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_galleries_editPhotos extends FlickrMethod {
    private String apiMethod="flickr.galleries.editPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_gallery_id(){
      return parameters.get("gallery_id");
    }
    public void set_gallery_id(    String gallery_id){
      parameters.put("gallery_id",gallery_id);
    }
    public String get_primary_photo_id(){
      return parameters.get("primary_photo_id");
    }
    public void set_primary_photo_id(    String primary_photo_id){
      parameters.put("primary_photo_id",primary_photo_id);
    }
    public String get_photo_ids(){
      return parameters.get("photo_ids");
    }
    public void set_photo_ids(    String photo_ids){
      parameters.put("photo_ids",photo_ids);
    }
  }
public static class flickr_places_findByLatLon extends FlickrMethod {
    private String apiMethod="flickr.places.findByLatLon";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_lat(){
      return parameters.get("lat");
    }
    public void set_lat(    String lat){
      parameters.put("lat",lat);
    }
    public String get_lon(){
      return parameters.get("lon");
    }
    public void set_lon(    String lon){
      parameters.put("lon",lon);
    }
    public String get_accuracy(){
      return parameters.get("accuracy");
    }
    public void set_accuracy(    String accuracy){
      parameters.put("accuracy",accuracy);
    }
  }
public static class flickr_photos_geo_setContext extends FlickrMethod {
    private String apiMethod="flickr.photos.geo.setContext";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_context(){
      return parameters.get("context");
    }
    public void set_context(    String context){
      parameters.put("context",context);
    }
  }
public static class flickr_interestingness_getList extends FlickrMethod {
    private String apiMethod="flickr.interestingness.getList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photos_removeTag extends FlickrMethod {
    private String apiMethod="flickr.photos.removeTag";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_tag_id(){
      return parameters.get("tag_id");
    }
    public void set_tag_id(    String tag_id){
      parameters.put("tag_id",tag_id);
    }
  }
public static class flickr_photos_comments_editComment extends FlickrMethod {
    private String apiMethod="flickr.photos.comments.editComment";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_comment_id(){
      return parameters.get("comment_id");
    }
    public void set_comment_id(    String comment_id){
      parameters.put("comment_id",comment_id);
    }
    public String get_comment_text(){
      return parameters.get("comment_text");
    }
    public void set_comment_text(    String comment_text){
      parameters.put("comment_text",comment_text);
    }
  }
public static class flickr_activity_userPhotos extends FlickrMethod {
    private String apiMethod="flickr.activity.userPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_timeframe(){
      return parameters.get("timeframe");
    }
    public void set_timeframe(    String timeframe){
      parameters.put("timeframe",timeframe);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_people_getPhotos extends FlickrMethod {
    private String apiMethod="flickr.people.getPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_safe_search(){
      return parameters.get("safe_search");
    }
    public void set_safe_search(    String safe_search){
      parameters.put("safe_search",safe_search);
    }
    public String get_min_upload_date(){
      return parameters.get("min_upload_date");
    }
    public void set_min_upload_date(    String min_upload_date){
      parameters.put("min_upload_date",min_upload_date);
    }
    public String get_max_upload_date(){
      return parameters.get("max_upload_date");
    }
    public void set_max_upload_date(    String max_upload_date){
      parameters.put("max_upload_date",max_upload_date);
    }
    public String get_min_taken_date(){
      return parameters.get("min_taken_date");
    }
    public void set_min_taken_date(    String min_taken_date){
      parameters.put("min_taken_date",min_taken_date);
    }
    public String get_max_taken_date(){
      return parameters.get("max_taken_date");
    }
    public void set_max_taken_date(    String max_taken_date){
      parameters.put("max_taken_date",max_taken_date);
    }
    public String get_content_type(){
      return parameters.get("content_type");
    }
    public void set_content_type(    String content_type){
      parameters.put("content_type",content_type);
    }
    public String get_privacy_filter(){
      return parameters.get("privacy_filter");
    }
    public void set_privacy_filter(    String privacy_filter){
      parameters.put("privacy_filter",privacy_filter);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_favorites_getContext extends FlickrMethod {
    private String apiMethod="flickr.favorites.getContext";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
  }
public static class flickr_stats_getCollectionStats extends FlickrMethod {
    private String apiMethod="flickr.stats.getCollectionStats";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
    public String get_collection_id(){
      return parameters.get("collection_id");
    }
    public void set_collection_id(    String collection_id){
      parameters.put("collection_id",collection_id);
    }
  }
public static class flickr_photos_addTags extends FlickrMethod {
    private String apiMethod="flickr.photos.addTags";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_tags(){
      return parameters.get("tags");
    }
    public void set_tags(    String tags){
      parameters.put("tags",tags);
    }
  }
public static class flickr_blogs_postPhoto extends FlickrMethod {
    private String apiMethod="flickr.blogs.postPhoto";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_blog_id(){
      return parameters.get("blog_id");
    }
    public void set_blog_id(    String blog_id){
      parameters.put("blog_id",blog_id);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_title(){
      return parameters.get("title");
    }
    public void set_title(    String title){
      parameters.put("title",title);
    }
    public String get_description(){
      return parameters.get("description");
    }
    public void set_description(    String description){
      parameters.put("description",description);
    }
    public String get_blog_password(){
      return parameters.get("blog_password");
    }
    public void set_blog_password(    String blog_password){
      parameters.put("blog_password",blog_password);
    }
    public String get_service(){
      return parameters.get("service");
    }
    public void set_service(    String service){
      parameters.put("service",service);
    }
  }
public static class flickr_photos_geo_batchCorrectLocation extends FlickrMethod {
    private String apiMethod="flickr.photos.geo.batchCorrectLocation";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_lat(){
      return parameters.get("lat");
    }
    public void set_lat(    String lat){
      parameters.put("lat",lat);
    }
    public String get_lon(){
      return parameters.get("lon");
    }
    public void set_lon(    String lon){
      parameters.put("lon",lon);
    }
    public String get_accuracy(){
      return parameters.get("accuracy");
    }
    public void set_accuracy(    String accuracy){
      parameters.put("accuracy",accuracy);
    }
    public String get_place_id(){
      return parameters.get("place_id");
    }
    public void set_place_id(    String place_id){
      parameters.put("place_id",place_id);
    }
    public String get_woe_id(){
      return parameters.get("woe_id");
    }
    public void set_woe_id(    String woe_id){
      parameters.put("woe_id",woe_id);
    }
  }
public static class flickr_tags_getClusters extends FlickrMethod {
    private String apiMethod="flickr.tags.getClusters";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_tag(){
      return parameters.get("tag");
    }
    public void set_tag(    String tag){
      parameters.put("tag",tag);
    }
  }
public static class flickr_groups_discuss_topics_add extends FlickrMethod {
    private String apiMethod="flickr.groups.discuss.topics.add";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_subject(){
      return parameters.get("subject");
    }
    public void set_subject(    String subject){
      parameters.put("subject",subject);
    }
    public String get_message(){
      return parameters.get("message");
    }
    public void set_message(    String message){
      parameters.put("message",message);
    }
  }
public static class flickr_push_unsubscribe extends FlickrMethod {
    private String apiMethod="flickr.push.unsubscribe";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_topic(){
      return parameters.get("topic");
    }
    public void set_topic(    String topic){
      parameters.put("topic",topic);
    }
    public String get_callback(){
      return parameters.get("callback");
    }
    public void set_callback(    String callback){
      parameters.put("callback",callback);
    }
    public String get_verify(){
      return parameters.get("verify");
    }
    public void set_verify(    String verify){
      parameters.put("verify",verify);
    }
    public String get_verify_token(){
      return parameters.get("verify_token");
    }
    public void set_verify_token(    String verify_token){
      parameters.put("verify_token",verify_token);
    }
  }
public static class flickr_blogs_getList extends FlickrMethod {
    private String apiMethod="flickr.blogs.getList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_service(){
      return parameters.get("service");
    }
    public void set_service(    String service){
      parameters.put("service",service);
    }
  }
public static class flickr_machinetags_getPairs extends FlickrMethod {
    private String apiMethod="flickr.machinetags.getPairs";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_namespace(){
      return parameters.get("namespace");
    }
    public void set_namespace(    String namespace){
      parameters.put("namespace",namespace);
    }
    public String get_predicate(){
      return parameters.get("predicate");
    }
    public void set_predicate(    String predicate){
      parameters.put("predicate",predicate);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photosets_reorderPhotos extends FlickrMethod {
    private String apiMethod="flickr.photosets.reorderPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
    public String get_photo_ids(){
      return parameters.get("photo_ids");
    }
    public void set_photo_ids(    String photo_ids){
      parameters.put("photo_ids",photo_ids);
    }
  }
public static class flickr_places_getShapeHistory extends FlickrMethod {
    private String apiMethod="flickr.places.getShapeHistory";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_place_id(){
      return parameters.get("place_id");
    }
    public void set_place_id(    String place_id){
      parameters.put("place_id",place_id);
    }
    public String get_woe_id(){
      return parameters.get("woe_id");
    }
    public void set_woe_id(    String woe_id){
      parameters.put("woe_id",woe_id);
    }
  }
public static class flickr_favorites_getPublicList extends FlickrMethod {
    private String apiMethod="flickr.favorites.getPublicList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_min_fave_date(){
      return parameters.get("min_fave_date");
    }
    public void set_min_fave_date(    String min_fave_date){
      parameters.put("min_fave_date",min_fave_date);
    }
    public String get_max_fave_date(){
      return parameters.get("max_fave_date");
    }
    public void set_max_fave_date(    String max_fave_date){
      parameters.put("max_fave_date",max_fave_date);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_stats_getPhotoReferrers extends FlickrMethod {
    private String apiMethod="flickr.stats.getPhotoReferrers";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
    public String get_domain(){
      return parameters.get("domain");
    }
    public void set_domain(    String domain){
      parameters.put("domain",domain);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photos_setPerms extends FlickrMethod {
    private String apiMethod="flickr.photos.setPerms";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_is_public(){
      return parameters.get("is_public");
    }
    public void set_is_public(    String is_public){
      parameters.put("is_public",is_public);
    }
    public String get_is_friend(){
      return parameters.get("is_friend");
    }
    public void set_is_friend(    String is_friend){
      parameters.put("is_friend",is_friend);
    }
    public String get_is_family(){
      return parameters.get("is_family");
    }
    public void set_is_family(    String is_family){
      parameters.put("is_family",is_family);
    }
    public String get_perm_comment(){
      return parameters.get("perm_comment");
    }
    public void set_perm_comment(    String perm_comment){
      parameters.put("perm_comment",perm_comment);
    }
    public String get_perm_addmeta(){
      return parameters.get("perm_addmeta");
    }
    public void set_perm_addmeta(    String perm_addmeta){
      parameters.put("perm_addmeta",perm_addmeta);
    }
  }
public static class flickr_people_getGroups extends FlickrMethod {
    private String apiMethod="flickr.people.getGroups";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
  }
public static class flickr_push_getSubscriptions extends FlickrMethod {
    private String apiMethod="flickr.push.getSubscriptions";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_machinetags_getValues extends FlickrMethod {
    private String apiMethod="flickr.machinetags.getValues";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_namespace(){
      return parameters.get("namespace");
    }
    public void set_namespace(    String namespace){
      parameters.put("namespace",namespace);
    }
    public String get_predicate(){
      return parameters.get("predicate");
    }
    public void set_predicate(    String predicate){
      parameters.put("predicate",predicate);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photos_people_editCoords extends FlickrMethod {
    private String apiMethod="flickr.photos.people.editCoords";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_person_x(){
      return parameters.get("person_x");
    }
    public void set_person_x(    String person_x){
      parameters.put("person_x",person_x);
    }
    public String get_person_y(){
      return parameters.get("person_y");
    }
    public void set_person_y(    String person_y){
      parameters.put("person_y",person_y);
    }
    public String get_person_w(){
      return parameters.get("person_w");
    }
    public void set_person_w(    String person_w){
      parameters.put("person_w",person_w);
    }
    public String get_person_h(){
      return parameters.get("person_h");
    }
    public void set_person_h(    String person_h){
      parameters.put("person_h",person_h);
    }
  }
public static class flickr_favorites_add extends FlickrMethod {
    private String apiMethod="flickr.favorites.add";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_photos_licenses_getInfo extends FlickrMethod {
    private String apiMethod="flickr.photos.licenses.getInfo";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_photos_getWithoutGeoData extends FlickrMethod {
    private String apiMethod="flickr.photos.getWithoutGeoData";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_max_upload_date(){
      return parameters.get("max_upload_date");
    }
    public void set_max_upload_date(    String max_upload_date){
      parameters.put("max_upload_date",max_upload_date);
    }
    public String get_min_taken_date(){
      return parameters.get("min_taken_date");
    }
    public void set_min_taken_date(    String min_taken_date){
      parameters.put("min_taken_date",min_taken_date);
    }
    public String get_max_taken_date(){
      return parameters.get("max_taken_date");
    }
    public void set_max_taken_date(    String max_taken_date){
      parameters.put("max_taken_date",max_taken_date);
    }
    public String get_privacy_filter(){
      return parameters.get("privacy_filter");
    }
    public void set_privacy_filter(    String privacy_filter){
      parameters.put("privacy_filter",privacy_filter);
    }
    public String get_sort(){
      return parameters.get("sort");
    }
    public void set_sort(    String sort){
      parameters.put("sort",sort);
    }
    public String get_media(){
      return parameters.get("media");
    }
    public void set_media(    String media){
      parameters.put("media",media);
    }
    public String get_min_upload_date(){
      return parameters.get("min_upload_date");
    }
    public void set_min_upload_date(    String min_upload_date){
      parameters.put("min_upload_date",min_upload_date);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_tags_getListUserPopular extends FlickrMethod {
    private String apiMethod="flickr.tags.getListUserPopular";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_count(){
      return parameters.get("count");
    }
    public void set_count(    String count){
      parameters.put("count",count);
    }
  }
public static class flickr_photos_notes_add extends FlickrMethod {
    private String apiMethod="flickr.photos.notes.add";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_note_x(){
      return parameters.get("note_x");
    }
    public void set_note_x(    String note_x){
      parameters.put("note_x",note_x);
    }
    public String get_note_y(){
      return parameters.get("note_y");
    }
    public void set_note_y(    String note_y){
      parameters.put("note_y",note_y);
    }
    public String get_note_w(){
      return parameters.get("note_w");
    }
    public void set_note_w(    String note_w){
      parameters.put("note_w",note_w);
    }
    public String get_note_h(){
      return parameters.get("note_h");
    }
    public void set_note_h(    String note_h){
      parameters.put("note_h",note_h);
    }
    public String get_note_text(){
      return parameters.get("note_text");
    }
    public void set_note_text(    String note_text){
      parameters.put("note_text",note_text);
    }
  }
public static class flickr_stats_getPhotoDomains extends FlickrMethod {
    private String apiMethod="flickr.stats.getPhotoDomains";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_places_getChildrenWithPhotosPublic extends FlickrMethod {
    private String apiMethod="flickr.places.getChildrenWithPhotosPublic";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_place_id(){
      return parameters.get("place_id");
    }
    public void set_place_id(    String place_id){
      parameters.put("place_id",place_id);
    }
    public String get_woe_id(){
      return parameters.get("woe_id");
    }
    public void set_woe_id(    String woe_id){
      parameters.put("woe_id",woe_id);
    }
  }
public static class flickr_test_login extends FlickrMethod {
    private String apiMethod="flickr.test.login";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_people_getUploadStatus extends FlickrMethod {
    private String apiMethod="flickr.people.getUploadStatus";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_photos_suggestions_removeSuggestion extends FlickrMethod {
    private String apiMethod="flickr.photos.suggestions.removeSuggestion";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_suggestion_id(){
      return parameters.get("suggestion_id");
    }
    public void set_suggestion_id(    String suggestion_id){
      parameters.put("suggestion_id",suggestion_id);
    }
  }
public static class flickr_places_getPlaceTypes extends FlickrMethod {
    private String apiMethod="flickr.places.getPlaceTypes";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_groups_browse extends FlickrMethod {
    private String apiMethod="flickr.groups.browse";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_cat_id(){
      return parameters.get("cat_id");
    }
    public void set_cat_id(    String cat_id){
      parameters.put("cat_id",cat_id);
    }
  }
public static class flickr_cameras_getBrands extends FlickrMethod {
    private String apiMethod="flickr.cameras.getBrands";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_contacts_getTaggingSuggestions extends FlickrMethod {
    private String apiMethod="flickr.contacts.getTaggingSuggestions";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_stats_getTotalViews extends FlickrMethod {
    private String apiMethod="flickr.stats.getTotalViews";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
  }
public static class flickr_groups_pools_add extends FlickrMethod {
    private String apiMethod="flickr.groups.pools.add";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
  }
public static class flickr_photos_getAllContexts extends FlickrMethod {
    private String apiMethod="flickr.photos.getAllContexts";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_places_placesForUser extends FlickrMethod {
    private String apiMethod="flickr.places.placesForUser";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_place_type_id(){
      return parameters.get("place_type_id");
    }
    public void set_place_type_id(    String place_type_id){
      parameters.put("place_type_id",place_type_id);
    }
    public String get_place_type(){
      return parameters.get("place_type");
    }
    public void set_place_type(    String place_type){
      parameters.put("place_type",place_type);
    }
    public String get_woe_id(){
      return parameters.get("woe_id");
    }
    public void set_woe_id(    String woe_id){
      parameters.put("woe_id",woe_id);
    }
    public String get_place_id(){
      return parameters.get("place_id");
    }
    public void set_place_id(    String place_id){
      parameters.put("place_id",place_id);
    }
    public String get_threshold(){
      return parameters.get("threshold");
    }
    public void set_threshold(    String threshold){
      parameters.put("threshold",threshold);
    }
    public String get_min_upload_date(){
      return parameters.get("min_upload_date");
    }
    public void set_min_upload_date(    String min_upload_date){
      parameters.put("min_upload_date",min_upload_date);
    }
    public String get_max_upload_date(){
      return parameters.get("max_upload_date");
    }
    public void set_max_upload_date(    String max_upload_date){
      parameters.put("max_upload_date",max_upload_date);
    }
    public String get_min_taken_date(){
      return parameters.get("min_taken_date");
    }
    public void set_min_taken_date(    String min_taken_date){
      parameters.put("min_taken_date",min_taken_date);
    }
    public String get_max_taken_date(){
      return parameters.get("max_taken_date");
    }
    public void set_max_taken_date(    String max_taken_date){
      parameters.put("max_taken_date",max_taken_date);
    }
  }
public static class flickr_groups_pools_remove extends FlickrMethod {
    private String apiMethod="flickr.groups.pools.remove";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
  }
public static class flickr_stats_getCollectionReferrers extends FlickrMethod {
    private String apiMethod="flickr.stats.getCollectionReferrers";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
    public String get_domain(){
      return parameters.get("domain");
    }
    public void set_domain(    String domain){
      parameters.put("domain",domain);
    }
    public String get_collection_id(){
      return parameters.get("collection_id");
    }
    public void set_collection_id(    String collection_id){
      parameters.put("collection_id",collection_id);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_groups_members_getList extends FlickrMethod {
    private String apiMethod="flickr.groups.members.getList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_membertypes(){
      return parameters.get("membertypes");
    }
    public void set_membertypes(    String membertypes){
      parameters.put("membertypes",membertypes);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_stats_getPopularPhotos extends FlickrMethod {
    private String apiMethod="flickr.stats.getPopularPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
    public String get_sort(){
      return parameters.get("sort");
    }
    public void set_sort(    String sort){
      parameters.put("sort",sort);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_contacts_getList extends FlickrMethod {
    private String apiMethod="flickr.contacts.getList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_filter(){
      return parameters.get("filter");
    }
    public void set_filter(    String filter){
      parameters.put("filter",filter);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_sort(){
      return parameters.get("sort");
    }
    public void set_sort(    String sort){
      parameters.put("sort",sort);
    }
  }
public static class flickr_groups_discuss_replies_add extends FlickrMethod {
    private String apiMethod="flickr.groups.discuss.replies.add";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_topic_id(){
      return parameters.get("topic_id");
    }
    public void set_topic_id(    String topic_id){
      parameters.put("topic_id",topic_id);
    }
    public String get_message(){
      return parameters.get("message");
    }
    public void set_message(    String message){
      parameters.put("message",message);
    }
  }
public static class flickr_people_getPhotosOf extends FlickrMethod {
    private String apiMethod="flickr.people.getPhotosOf";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_owner_id(){
      return parameters.get("owner_id");
    }
    public void set_owner_id(    String owner_id){
      parameters.put("owner_id",owner_id);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photos_setContentType extends FlickrMethod {
    private String apiMethod="flickr.photos.setContentType";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_content_type(){
      return parameters.get("content_type");
    }
    public void set_content_type(    String content_type){
      parameters.put("content_type",content_type);
    }
  }
public static class flickr_galleries_getPhotos extends FlickrMethod {
    private String apiMethod="flickr.galleries.getPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_gallery_id(){
      return parameters.get("gallery_id");
    }
    public void set_gallery_id(    String gallery_id){
      parameters.put("gallery_id",gallery_id);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photos_suggestions_suggestLocation extends FlickrMethod {
    private String apiMethod="flickr.photos.suggestions.suggestLocation";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_lat(){
      return parameters.get("lat");
    }
    public void set_lat(    String lat){
      parameters.put("lat",lat);
    }
    public String get_lon(){
      return parameters.get("lon");
    }
    public void set_lon(    String lon){
      parameters.put("lon",lon);
    }
    public String get_accuracy(){
      return parameters.get("accuracy");
    }
    public void set_accuracy(    String accuracy){
      parameters.put("accuracy",accuracy);
    }
    public String get_woe_id(){
      return parameters.get("woe_id");
    }
    public void set_woe_id(    String woe_id){
      parameters.put("woe_id",woe_id);
    }
    public String get_place_id(){
      return parameters.get("place_id");
    }
    public void set_place_id(    String place_id){
      parameters.put("place_id",place_id);
    }
    public String get_note(){
      return parameters.get("note");
    }
    public void set_note(    String note){
      parameters.put("note",note);
    }
  }
public static class flickr_panda_getList extends FlickrMethod {
    private String apiMethod="flickr.panda.getList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_groups_pools_getGroups extends FlickrMethod {
    private String apiMethod="flickr.groups.pools.getGroups";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
  }
public static class flickr_photos_suggestions_rejectSuggestion extends FlickrMethod {
    private String apiMethod="flickr.photos.suggestions.rejectSuggestion";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_suggestion_id(){
      return parameters.get("suggestion_id");
    }
    public void set_suggestion_id(    String suggestion_id){
      parameters.put("suggestion_id",suggestion_id);
    }
  }
public static class flickr_auth_oauth_checkToken extends FlickrMethod {
    private String apiMethod="flickr.auth.oauth.checkToken";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_oauth_token(){
      return parameters.get("oauth_token");
    }
    public void set_oauth_token(    String oauth_token){
      parameters.put("oauth_token",oauth_token);
    }
  }
public static class flickr_groups_discuss_replies_edit extends FlickrMethod {
    private String apiMethod="flickr.groups.discuss.replies.edit";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_topic_id(){
      return parameters.get("topic_id");
    }
    public void set_topic_id(    String topic_id){
      parameters.put("topic_id",topic_id);
    }
    public String get_reply_id(){
      return parameters.get("reply_id");
    }
    public void set_reply_id(    String reply_id){
      parameters.put("reply_id",reply_id);
    }
    public String get_message(){
      return parameters.get("message");
    }
    public void set_message(    String message){
      parameters.put("message",message);
    }
  }
public static class flickr_photos_geo_getPerms extends FlickrMethod {
    private String apiMethod="flickr.photos.geo.getPerms";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_people_findByUsername extends FlickrMethod {
    private String apiMethod="flickr.people.findByUsername";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_username(){
      return parameters.get("username");
    }
    public void set_username(    String username){
      parameters.put("username",username);
    }
  }
public static class flickr_photosets_getInfo extends FlickrMethod {
    private String apiMethod="flickr.photosets.getInfo";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
  }
public static class flickr_groups_discuss_replies_delete extends FlickrMethod {
    private String apiMethod="flickr.groups.discuss.replies.delete";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_topic_id(){
      return parameters.get("topic_id");
    }
    public void set_topic_id(    String topic_id){
      parameters.put("topic_id",topic_id);
    }
    public String get_reply_id(){
      return parameters.get("reply_id");
    }
    public void set_reply_id(    String reply_id){
      parameters.put("reply_id",reply_id);
    }
  }
public static class flickr_photos_setMeta extends FlickrMethod {
    private String apiMethod="flickr.photos.setMeta";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_title(){
      return parameters.get("title");
    }
    public void set_title(    String title){
      parameters.put("title",title);
    }
    public String get_description(){
      return parameters.get("description");
    }
    public void set_description(    String description){
      parameters.put("description",description);
    }
  }
public static class flickr_prefs_getGeoPerms extends FlickrMethod {
    private String apiMethod="flickr.prefs.getGeoPerms";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_collections_getInfo extends FlickrMethod {
    private String apiMethod="flickr.collections.getInfo";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_collection_id(){
      return parameters.get("collection_id");
    }
    public void set_collection_id(    String collection_id){
      parameters.put("collection_id",collection_id);
    }
  }
public static class flickr_photosets_getList extends FlickrMethod {
    private String apiMethod="flickr.photosets.getList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_primary_photo_extras(){
      return parameters.get("primary_photo_extras");
    }
    public void set_primary_photo_extras(    String primary_photo_extras){
      parameters.put("primary_photo_extras",primary_photo_extras);
    }
  }
public static class flickr_tags_getClusterPhotos extends FlickrMethod {
    private String apiMethod="flickr.tags.getClusterPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_tag(){
      return parameters.get("tag");
    }
    public void set_tag(    String tag){
      parameters.put("tag",tag);
    }
    public String get_cluster_id(){
      return parameters.get("cluster_id");
    }
    public void set_cluster_id(    String cluster_id){
      parameters.put("cluster_id",cluster_id);
    }
  }
public static class flickr_machinetags_getNamespaces extends FlickrMethod {
    private String apiMethod="flickr.machinetags.getNamespaces";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_predicate(){
      return parameters.get("predicate");
    }
    public void set_predicate(    String predicate){
      parameters.put("predicate",predicate);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photos_setTags extends FlickrMethod {
    private String apiMethod="flickr.photos.setTags";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_tags(){
      return parameters.get("tags");
    }
    public void set_tags(    String tags){
      parameters.put("tags",tags);
    }
  }
public static class flickr_photos_comments_deleteComment extends FlickrMethod {
    private String apiMethod="flickr.photos.comments.deleteComment";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_comment_id(){
      return parameters.get("comment_id");
    }
    public void set_comment_id(    String comment_id){
      parameters.put("comment_id",comment_id);
    }
  }
public static class flickr_stats_getPhotostreamDomains extends FlickrMethod {
    private String apiMethod="flickr.stats.getPhotostreamDomains";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_urls_lookupGroup extends FlickrMethod {
    private String apiMethod="flickr.urls.lookupGroup";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_url(){
      return parameters.get("url");
    }
    public void set_url(    String url){
      parameters.put("url",url);
    }
  }
public static class flickr_photos_delete extends FlickrMethod {
    private String apiMethod="flickr.photos.delete";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_galleries_addPhoto extends FlickrMethod {
    private String apiMethod="flickr.galleries.addPhoto";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_gallery_id(){
      return parameters.get("gallery_id");
    }
    public void set_gallery_id(    String gallery_id){
      parameters.put("gallery_id",gallery_id);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_comment(){
      return parameters.get("comment");
    }
    public void set_comment(    String comment){
      parameters.put("comment",comment);
    }
  }
public static class flickr_urls_getUserPhotos extends FlickrMethod {
    private String apiMethod="flickr.urls.getUserPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
  }
public static class flickr_photos_getContext extends FlickrMethod {
    private String apiMethod="flickr.photos.getContext";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_stats_getCSVFiles extends FlickrMethod {
    private String apiMethod="flickr.stats.getCSVFiles";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_tags_getMostFrequentlyUsed extends FlickrMethod {
    private String apiMethod="flickr.tags.getMostFrequentlyUsed";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_photos_comments_getList extends FlickrMethod {
    private String apiMethod="flickr.photos.comments.getList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_min_comment_date(){
      return parameters.get("min_comment_date");
    }
    public void set_min_comment_date(    String min_comment_date){
      parameters.put("min_comment_date",min_comment_date);
    }
    public String get_max_comment_date(){
      return parameters.get("max_comment_date");
    }
    public void set_max_comment_date(    String max_comment_date){
      parameters.put("max_comment_date",max_comment_date);
    }
  }
public static class flickr_places_find extends FlickrMethod {
    private String apiMethod="flickr.places.find";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_query(){
      return parameters.get("query");
    }
    public void set_query(    String query){
      parameters.put("query",query);
    }
  }
public static class flickr_groups_join extends FlickrMethod {
    private String apiMethod="flickr.groups.join";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_accept_rules(){
      return parameters.get("accept_rules");
    }
    public void set_accept_rules(    String accept_rules){
      parameters.put("accept_rules",accept_rules);
    }
  }
public static class flickr_places_placesForTags extends FlickrMethod {
    private String apiMethod="flickr.places.placesForTags";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_place_type_id(){
      return parameters.get("place_type_id");
    }
    public void set_place_type_id(    String place_type_id){
      parameters.put("place_type_id",place_type_id);
    }
    public String get_woe_id(){
      return parameters.get("woe_id");
    }
    public void set_woe_id(    String woe_id){
      parameters.put("woe_id",woe_id);
    }
    public String get_place_id(){
      return parameters.get("place_id");
    }
    public void set_place_id(    String place_id){
      parameters.put("place_id",place_id);
    }
    public String get_threshold(){
      return parameters.get("threshold");
    }
    public void set_threshold(    String threshold){
      parameters.put("threshold",threshold);
    }
    public String get_tags(){
      return parameters.get("tags");
    }
    public void set_tags(    String tags){
      parameters.put("tags",tags);
    }
    public String get_tag_mode(){
      return parameters.get("tag_mode");
    }
    public void set_tag_mode(    String tag_mode){
      parameters.put("tag_mode",tag_mode);
    }
    public String get_machine_tags(){
      return parameters.get("machine_tags");
    }
    public void set_machine_tags(    String machine_tags){
      parameters.put("machine_tags",machine_tags);
    }
    public String get_machine_tag_mode(){
      return parameters.get("machine_tag_mode");
    }
    public void set_machine_tag_mode(    String machine_tag_mode){
      parameters.put("machine_tag_mode",machine_tag_mode);
    }
    public String get_min_upload_date(){
      return parameters.get("min_upload_date");
    }
    public void set_min_upload_date(    String min_upload_date){
      parameters.put("min_upload_date",min_upload_date);
    }
    public String get_max_upload_date(){
      return parameters.get("max_upload_date");
    }
    public void set_max_upload_date(    String max_upload_date){
      parameters.put("max_upload_date",max_upload_date);
    }
    public String get_min_taken_date(){
      return parameters.get("min_taken_date");
    }
    public void set_min_taken_date(    String min_taken_date){
      parameters.put("min_taken_date",min_taken_date);
    }
    public String get_max_taken_date(){
      return parameters.get("max_taken_date");
    }
    public void set_max_taken_date(    String max_taken_date){
      parameters.put("max_taken_date",max_taken_date);
    }
  }
public static class flickr_cameras_getBrandModels extends FlickrMethod {
    private String apiMethod="flickr.cameras.getBrandModels";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_brand(){
      return parameters.get("brand");
    }
    public void set_brand(    String brand){
      parameters.put("brand",brand);
    }
  }
public static class flickr_auth_checkToken extends FlickrMethod {
    private String apiMethod="flickr.auth.checkToken";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_auth_token(){
      return parameters.get("auth_token");
    }
    public void set_auth_token(    String auth_token){
      parameters.put("auth_token",auth_token);
    }
  }
public static class flickr_photosets_addPhoto extends FlickrMethod {
    private String apiMethod="flickr.photosets.addPhoto";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_photos_geo_getLocation extends FlickrMethod {
    private String apiMethod="flickr.photos.geo.getLocation";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
  }
public static class flickr_photos_getContactsPublicPhotos extends FlickrMethod {
    private String apiMethod="flickr.photos.getContactsPublicPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_count(){
      return parameters.get("count");
    }
    public void set_count(    String count){
      parameters.put("count",count);
    }
    public String get_just_friends(){
      return parameters.get("just_friends");
    }
    public void set_just_friends(    String just_friends){
      parameters.put("just_friends",just_friends);
    }
    public String get_single_photo(){
      return parameters.get("single_photo");
    }
    public void set_single_photo(    String single_photo){
      parameters.put("single_photo",single_photo);
    }
    public String get_include_self(){
      return parameters.get("include_self");
    }
    public void set_include_self(    String include_self){
      parameters.put("include_self",include_self);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
  }
public static class flickr_photos_people_delete extends FlickrMethod {
    private String apiMethod="flickr.photos.people.delete";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
  }
public static class flickr_photos_geo_correctLocation extends FlickrMethod {
    private String apiMethod="flickr.photos.geo.correctLocation";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_place_id(){
      return parameters.get("place_id");
    }
    public void set_place_id(    String place_id){
      parameters.put("place_id",place_id);
    }
    public String get_woe_id(){
      return parameters.get("woe_id");
    }
    public void set_woe_id(    String woe_id){
      parameters.put("woe_id",woe_id);
    }
    public String get_foursquare_id(){
      return parameters.get("foursquare_id");
    }
    public void set_foursquare_id(    String foursquare_id){
      parameters.put("foursquare_id",foursquare_id);
    }
  }
public static class flickr_machinetags_getPredicates extends FlickrMethod {
    private String apiMethod="flickr.machinetags.getPredicates";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_namespace(){
      return parameters.get("namespace");
    }
    public void set_namespace(    String namespace){
      parameters.put("namespace",namespace);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photos_search extends FlickrMethod {
    private String apiMethod="flickr.photos.search";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_tags(){
      return parameters.get("tags");
    }
    public void set_tags(    String tags){
      parameters.put("tags",tags);
    }
    public String get_tag_mode(){
      return parameters.get("tag_mode");
    }
    public void set_tag_mode(    String tag_mode){
      parameters.put("tag_mode",tag_mode);
    }
    public String get_text(){
      return parameters.get("text");
    }
    public void set_text(    String text){
      parameters.put("text",text);
    }
    public String get_min_upload_date(){
      return parameters.get("min_upload_date");
    }
    public void set_min_upload_date(    String min_upload_date){
      parameters.put("min_upload_date",min_upload_date);
    }
    public String get_max_upload_date(){
      return parameters.get("max_upload_date");
    }
    public void set_max_upload_date(    String max_upload_date){
      parameters.put("max_upload_date",max_upload_date);
    }
    public String get_min_taken_date(){
      return parameters.get("min_taken_date");
    }
    public void set_min_taken_date(    String min_taken_date){
      parameters.put("min_taken_date",min_taken_date);
    }
    public String get_max_taken_date(){
      return parameters.get("max_taken_date");
    }
    public void set_max_taken_date(    String max_taken_date){
      parameters.put("max_taken_date",max_taken_date);
    }
    public String get_license(){
      return parameters.get("license");
    }
    public void set_license(    String license){
      parameters.put("license",license);
    }
    public String get_sort(){
      return parameters.get("sort");
    }
    public void set_sort(    String sort){
      parameters.put("sort",sort);
    }
    public String get_privacy_filter(){
      return parameters.get("privacy_filter");
    }
    public void set_privacy_filter(    String privacy_filter){
      parameters.put("privacy_filter",privacy_filter);
    }
    public String get_bbox(){
      return parameters.get("bbox");
    }
    public void set_bbox(    String bbox){
      parameters.put("bbox",bbox);
    }
    public String get_accuracy(){
      return parameters.get("accuracy");
    }
    public void set_accuracy(    String accuracy){
      parameters.put("accuracy",accuracy);
    }
    public String get_safe_search(){
      return parameters.get("safe_search");
    }
    public void set_safe_search(    String safe_search){
      parameters.put("safe_search",safe_search);
    }
    public String get_content_type(){
      return parameters.get("content_type");
    }
    public void set_content_type(    String content_type){
      parameters.put("content_type",content_type);
    }
    public String get_machine_tags(){
      return parameters.get("machine_tags");
    }
    public void set_machine_tags(    String machine_tags){
      parameters.put("machine_tags",machine_tags);
    }
    public String get_machine_tag_mode(){
      return parameters.get("machine_tag_mode");
    }
    public void set_machine_tag_mode(    String machine_tag_mode){
      parameters.put("machine_tag_mode",machine_tag_mode);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_contacts(){
      return parameters.get("contacts");
    }
    public void set_contacts(    String contacts){
      parameters.put("contacts",contacts);
    }
    public String get_woe_id(){
      return parameters.get("woe_id");
    }
    public void set_woe_id(    String woe_id){
      parameters.put("woe_id",woe_id);
    }
    public String get_place_id(){
      return parameters.get("place_id");
    }
    public void set_place_id(    String place_id){
      parameters.put("place_id",place_id);
    }
    public String get_media(){
      return parameters.get("media");
    }
    public void set_media(    String media){
      parameters.put("media",media);
    }
    public String get_has_geo(){
      return parameters.get("has_geo");
    }
    public void set_has_geo(    String has_geo){
      parameters.put("has_geo",has_geo);
    }
    public String get_geo_context(){
      return parameters.get("geo_context");
    }
    public void set_geo_context(    String geo_context){
      parameters.put("geo_context",geo_context);
    }
    public String get_lat(){
      return parameters.get("lat");
    }
    public void set_lat(    String lat){
      parameters.put("lat",lat);
    }
    public String get_lon(){
      return parameters.get("lon");
    }
    public void set_lon(    String lon){
      parameters.put("lon",lon);
    }
    public String get_radius(){
      return parameters.get("radius");
    }
    public void set_radius(    String radius){
      parameters.put("radius",radius);
    }
    public String get_radius_units(){
      return parameters.get("radius_units");
    }
    public void set_radius_units(    String radius_units){
      parameters.put("radius_units",radius_units);
    }
    public String get_is_commons(){
      return parameters.get("is_commons");
    }
    public void set_is_commons(    String is_commons){
      parameters.put("is_commons",is_commons);
    }
    public String get_in_gallery(){
      return parameters.get("in_gallery");
    }
    public void set_in_gallery(    String in_gallery){
      parameters.put("in_gallery",in_gallery);
    }
    public String get_is_getty(){
      return parameters.get("is_getty");
    }
    public void set_is_getty(    String is_getty){
      parameters.put("is_getty",is_getty);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_reflection_getMethodInfo extends FlickrMethod {
    private String apiMethod="flickr.reflection.getMethodInfo";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_method_name(){
      return parameters.get("method_name");
    }
    public void set_method_name(    String method_name){
      parameters.put("method_name",method_name);
    }
  }
public static class flickr_photos_setSafetyLevel extends FlickrMethod {
    private String apiMethod="flickr.photos.setSafetyLevel";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_safety_level(){
      return parameters.get("safety_level");
    }
    public void set_safety_level(    String safety_level){
      parameters.put("safety_level",safety_level);
    }
    public String get_hidden(){
      return parameters.get("hidden");
    }
    public void set_hidden(    String hidden){
      parameters.put("hidden",hidden);
    }
  }
public static class flickr_galleries_create extends FlickrMethod {
    private String apiMethod="flickr.galleries.create";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_title(){
      return parameters.get("title");
    }
    public void set_title(    String title){
      parameters.put("title",title);
    }
    public String get_description(){
      return parameters.get("description");
    }
    public void set_description(    String description){
      parameters.put("description",description);
    }
    public String get_primary_photo_id(){
      return parameters.get("primary_photo_id");
    }
    public void set_primary_photo_id(    String primary_photo_id){
      parameters.put("primary_photo_id",primary_photo_id);
    }
    public String get_full_result(){
      return parameters.get("full_result");
    }
    public void set_full_result(    String full_result){
      parameters.put("full_result",full_result);
    }
  }
public static class flickr_places_placesForBoundingBox extends FlickrMethod {
    private String apiMethod="flickr.places.placesForBoundingBox";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_bbox(){
      return parameters.get("bbox");
    }
    public void set_bbox(    String bbox){
      parameters.put("bbox",bbox);
    }
    public String get_place_type(){
      return parameters.get("place_type");
    }
    public void set_place_type(    String place_type){
      parameters.put("place_type",place_type);
    }
    public String get_place_type_id(){
      return parameters.get("place_type_id");
    }
    public void set_place_type_id(    String place_type_id){
      parameters.put("place_type_id",place_type_id);
    }
  }
public static class flickr_machinetags_getRecentValues extends FlickrMethod {
    private String apiMethod="flickr.machinetags.getRecentValues";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_namespace(){
      return parameters.get("namespace");
    }
    public void set_namespace(    String namespace){
      parameters.put("namespace",namespace);
    }
    public String get_predicate(){
      return parameters.get("predicate");
    }
    public void set_predicate(    String predicate){
      parameters.put("predicate",predicate);
    }
    public String get_added_since(){
      return parameters.get("added_since");
    }
    public void set_added_since(    String added_since){
      parameters.put("added_since",added_since);
    }
  }
public static class flickr_groups_leave extends FlickrMethod {
    private String apiMethod="flickr.groups.leave";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_delete_photos(){
      return parameters.get("delete_photos");
    }
    public void set_delete_photos(    String delete_photos){
      parameters.put("delete_photos",delete_photos);
    }
  }
public static class flickr_groups_discuss_replies_getList extends FlickrMethod {
    private String apiMethod="flickr.groups.discuss.replies.getList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_topic_id(){
      return parameters.get("topic_id");
    }
    public void set_topic_id(    String topic_id){
      parameters.put("topic_id",topic_id);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photos_getNotInSet extends FlickrMethod {
    private String apiMethod="flickr.photos.getNotInSet";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_max_upload_date(){
      return parameters.get("max_upload_date");
    }
    public void set_max_upload_date(    String max_upload_date){
      parameters.put("max_upload_date",max_upload_date);
    }
    public String get_min_taken_date(){
      return parameters.get("min_taken_date");
    }
    public void set_min_taken_date(    String min_taken_date){
      parameters.put("min_taken_date",min_taken_date);
    }
    public String get_max_taken_date(){
      return parameters.get("max_taken_date");
    }
    public void set_max_taken_date(    String max_taken_date){
      parameters.put("max_taken_date",max_taken_date);
    }
    public String get_privacy_filter(){
      return parameters.get("privacy_filter");
    }
    public void set_privacy_filter(    String privacy_filter){
      parameters.put("privacy_filter",privacy_filter);
    }
    public String get_media(){
      return parameters.get("media");
    }
    public void set_media(    String media){
      parameters.put("media",media);
    }
    public String get_min_upload_date(){
      return parameters.get("min_upload_date");
    }
    public void set_min_upload_date(    String min_upload_date){
      parameters.put("min_upload_date",min_upload_date);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photos_getUntagged extends FlickrMethod {
    private String apiMethod="flickr.photos.getUntagged";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_min_upload_date(){
      return parameters.get("min_upload_date");
    }
    public void set_min_upload_date(    String min_upload_date){
      parameters.put("min_upload_date",min_upload_date);
    }
    public String get_max_upload_date(){
      return parameters.get("max_upload_date");
    }
    public void set_max_upload_date(    String max_upload_date){
      parameters.put("max_upload_date",max_upload_date);
    }
    public String get_min_taken_date(){
      return parameters.get("min_taken_date");
    }
    public void set_min_taken_date(    String min_taken_date){
      parameters.put("min_taken_date",min_taken_date);
    }
    public String get_max_taken_date(){
      return parameters.get("max_taken_date");
    }
    public void set_max_taken_date(    String max_taken_date){
      parameters.put("max_taken_date",max_taken_date);
    }
    public String get_privacy_filter(){
      return parameters.get("privacy_filter");
    }
    public void set_privacy_filter(    String privacy_filter){
      parameters.put("privacy_filter",privacy_filter);
    }
    public String get_media(){
      return parameters.get("media");
    }
    public void set_media(    String media){
      parameters.put("media",media);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_stats_getPhotosetDomains extends FlickrMethod {
    private String apiMethod="flickr.stats.getPhotosetDomains";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photos_geo_removeLocation extends FlickrMethod {
    private String apiMethod="flickr.photos.geo.removeLocation";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_people_getInfo extends FlickrMethod {
    private String apiMethod="flickr.people.getInfo";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
  }
public static class flickr_test_null extends FlickrMethod {
    private String apiMethod="flickr.test.null";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_galleries_getInfo extends FlickrMethod {
    private String apiMethod="flickr.galleries.getInfo";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_gallery_id(){
      return parameters.get("gallery_id");
    }
    public void set_gallery_id(    String gallery_id){
      parameters.put("gallery_id",gallery_id);
    }
  }
public static class flickr_urls_getUserProfile extends FlickrMethod {
    private String apiMethod="flickr.urls.getUserProfile";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
  }
public static class flickr_stats_getPhotoStats extends FlickrMethod {
    private String apiMethod="flickr.stats.getPhotoStats";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_groups_discuss_replies_getInfo extends FlickrMethod {
    private String apiMethod="flickr.groups.discuss.replies.getInfo";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_topic_id(){
      return parameters.get("topic_id");
    }
    public void set_topic_id(    String topic_id){
      parameters.put("topic_id",topic_id);
    }
    public String get_reply_id(){
      return parameters.get("reply_id");
    }
    public void set_reply_id(    String reply_id){
      parameters.put("reply_id",reply_id);
    }
  }
public static class flickr_people_findByEmail extends FlickrMethod {
    private String apiMethod="flickr.people.findByEmail";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_find_email(){
      return parameters.get("find_email");
    }
    public void set_find_email(    String find_email){
      parameters.put("find_email",find_email);
    }
  }
public static class flickr_galleries_getList extends FlickrMethod {
    private String apiMethod="flickr.galleries.getList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
    public String get_primary_photo_extras(){
      return parameters.get("primary_photo_extras");
    }
    public void set_primary_photo_extras(    String primary_photo_extras){
      parameters.put("primary_photo_extras",primary_photo_extras);
    }
  }
public static class flickr_photosets_comments_editComment extends FlickrMethod {
    private String apiMethod="flickr.photosets.comments.editComment";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_comment_id(){
      return parameters.get("comment_id");
    }
    public void set_comment_id(    String comment_id){
      parameters.put("comment_id",comment_id);
    }
    public String get_comment_text(){
      return parameters.get("comment_text");
    }
    public void set_comment_text(    String comment_text){
      parameters.put("comment_text",comment_text);
    }
  }
public static class flickr_photos_getFavorites extends FlickrMethod {
    private String apiMethod="flickr.photos.getFavorites";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
  }
public static class flickr_photos_upload_checkTickets extends FlickrMethod {
    private String apiMethod="flickr.photos.upload.checkTickets";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_tickets(){
      return parameters.get("tickets");
    }
    public void set_tickets(    String tickets){
      parameters.put("tickets",tickets);
    }
  }
public static class flickr_photos_transform_rotate extends FlickrMethod {
    private String apiMethod="flickr.photos.transform.rotate";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_degrees(){
      return parameters.get("degrees");
    }
    public void set_degrees(    String degrees){
      parameters.put("degrees",degrees);
    }
  }
public static class flickr_stats_getPhotosetStats extends FlickrMethod {
    private String apiMethod="flickr.stats.getPhotosetStats";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
  }
public static class flickr_activity_userComments extends FlickrMethod {
    private String apiMethod="flickr.activity.userComments";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photosets_orderSets extends FlickrMethod {
    private String apiMethod="flickr.photosets.orderSets";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photoset_ids(){
      return parameters.get("photoset_ids");
    }
    public void set_photoset_ids(    String photoset_ids){
      parameters.put("photoset_ids",photoset_ids);
    }
  }
public static class flickr_photosets_removePhotos extends FlickrMethod {
    private String apiMethod="flickr.photosets.removePhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
    public String get_photo_ids(){
      return parameters.get("photo_ids");
    }
    public void set_photo_ids(    String photo_ids){
      parameters.put("photo_ids",photo_ids);
    }
  }
public static class flickr_stats_getPhotostreamReferrers extends FlickrMethod {
    private String apiMethod="flickr.stats.getPhotostreamReferrers";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_date(){
      return parameters.get("date");
    }
    public void set_date(    String date){
      parameters.put("date",date);
    }
    public String get_domain(){
      return parameters.get("domain");
    }
    public void set_domain(    String domain){
      parameters.put("domain",domain);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_auth_oauth_getAccessToken extends FlickrMethod {
    private String apiMethod="flickr.auth.oauth.getAccessToken";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_panda_getPhotos extends FlickrMethod {
    private String apiMethod="flickr.panda.getPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_panda_name(){
      return parameters.get("panda_name");
    }
    public void set_panda_name(    String panda_name){
      parameters.put("panda_name",panda_name);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_galleries_getListForPhoto extends FlickrMethod {
    private String apiMethod="flickr.galleries.getListForPhoto";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_places_placesForContacts extends FlickrMethod {
    private String apiMethod="flickr.places.placesForContacts";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_place_type(){
      return parameters.get("place_type");
    }
    public void set_place_type(    String place_type){
      parameters.put("place_type",place_type);
    }
    public String get_place_type_id(){
      return parameters.get("place_type_id");
    }
    public void set_place_type_id(    String place_type_id){
      parameters.put("place_type_id",place_type_id);
    }
    public String get_woe_id(){
      return parameters.get("woe_id");
    }
    public void set_woe_id(    String woe_id){
      parameters.put("woe_id",woe_id);
    }
    public String get_place_id(){
      return parameters.get("place_id");
    }
    public void set_place_id(    String place_id){
      parameters.put("place_id",place_id);
    }
    public String get_threshold(){
      return parameters.get("threshold");
    }
    public void set_threshold(    String threshold){
      parameters.put("threshold",threshold);
    }
    public String get_contacts(){
      return parameters.get("contacts");
    }
    public void set_contacts(    String contacts){
      parameters.put("contacts",contacts);
    }
    public String get_min_upload_date(){
      return parameters.get("min_upload_date");
    }
    public void set_min_upload_date(    String min_upload_date){
      parameters.put("min_upload_date",min_upload_date);
    }
    public String get_max_upload_date(){
      return parameters.get("max_upload_date");
    }
    public void set_max_upload_date(    String max_upload_date){
      parameters.put("max_upload_date",max_upload_date);
    }
    public String get_min_taken_date(){
      return parameters.get("min_taken_date");
    }
    public void set_min_taken_date(    String min_taken_date){
      parameters.put("min_taken_date",min_taken_date);
    }
    public String get_max_taken_date(){
      return parameters.get("max_taken_date");
    }
    public void set_max_taken_date(    String max_taken_date){
      parameters.put("max_taken_date",max_taken_date);
    }
  }
public static class flickr_photosets_comments_deleteComment extends FlickrMethod {
    private String apiMethod="flickr.photosets.comments.deleteComment";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_comment_id(){
      return parameters.get("comment_id");
    }
    public void set_comment_id(    String comment_id){
      parameters.put("comment_id",comment_id);
    }
  }
public static class flickr_places_tagsForPlace extends FlickrMethod {
    private String apiMethod="flickr.places.tagsForPlace";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_woe_id(){
      return parameters.get("woe_id");
    }
    public void set_woe_id(    String woe_id){
      parameters.put("woe_id",woe_id);
    }
    public String get_place_id(){
      return parameters.get("place_id");
    }
    public void set_place_id(    String place_id){
      parameters.put("place_id",place_id);
    }
    public String get_min_upload_date(){
      return parameters.get("min_upload_date");
    }
    public void set_min_upload_date(    String min_upload_date){
      parameters.put("min_upload_date",min_upload_date);
    }
    public String get_max_upload_date(){
      return parameters.get("max_upload_date");
    }
    public void set_max_upload_date(    String max_upload_date){
      parameters.put("max_upload_date",max_upload_date);
    }
    public String get_min_taken_date(){
      return parameters.get("min_taken_date");
    }
    public void set_min_taken_date(    String min_taken_date){
      parameters.put("min_taken_date",min_taken_date);
    }
    public String get_max_taken_date(){
      return parameters.get("max_taken_date");
    }
    public void set_max_taken_date(    String max_taken_date){
      parameters.put("max_taken_date",max_taken_date);
    }
  }
public static class flickr_favorites_remove extends FlickrMethod {
    private String apiMethod="flickr.favorites.remove";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_photosets_comments_addComment extends FlickrMethod {
    private String apiMethod="flickr.photosets.comments.addComment";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
    public String get_comment_text(){
      return parameters.get("comment_text");
    }
    public void set_comment_text(    String comment_text){
      parameters.put("comment_text",comment_text);
    }
  }
public static class flickr_photos_people_deleteCoords extends FlickrMethod {
    private String apiMethod="flickr.photos.people.deleteCoords";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_user_id(){
      return parameters.get("user_id");
    }
    public void set_user_id(    String user_id){
      parameters.put("user_id",user_id);
    }
  }
public static class flickr_photos_getPerms extends FlickrMethod {
    private String apiMethod="flickr.photos.getPerms";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_groups_pools_getContext extends FlickrMethod {
    private String apiMethod="flickr.groups.pools.getContext";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
  }
public static class flickr_photosets_comments_getList extends FlickrMethod {
    private String apiMethod="flickr.photosets.comments.getList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
  }
public static class flickr_groups_getInfo extends FlickrMethod {
    private String apiMethod="flickr.groups.getInfo";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_group_id(){
      return parameters.get("group_id");
    }
    public void set_group_id(    String group_id){
      parameters.put("group_id",group_id);
    }
    public String get_group_path_alias(){
      return parameters.get("group_path_alias");
    }
    public void set_group_path_alias(    String group_path_alias){
      parameters.put("group_path_alias",group_path_alias);
    }
    public String get_lang(){
      return parameters.get("lang");
    }
    public void set_lang(    String lang){
      parameters.put("lang",lang);
    }
  }
public static class flickr_photos_people_getList extends FlickrMethod {
    private String apiMethod="flickr.photos.people.getList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_auth_getToken extends FlickrMethod {
    private String apiMethod="flickr.auth.getToken";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_frob(){
      return parameters.get("frob");
    }
    public void set_frob(    String frob){
      parameters.put("frob",frob);
    }
  }
public static class flickr_prefs_getSafetyLevel extends FlickrMethod {
    private String apiMethod="flickr.prefs.getSafetyLevel";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_places_resolvePlaceURL extends FlickrMethod {
    private String apiMethod="flickr.places.resolvePlaceURL";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_url(){
      return parameters.get("url");
    }
    public void set_url(    String url){
      parameters.put("url",url);
    }
  }
public static class flickr_photosets_delete extends FlickrMethod {
    private String apiMethod="flickr.photosets.delete";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
  }
public static class flickr_photos_getInfo extends FlickrMethod {
    private String apiMethod="flickr.photos.getInfo";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_secret(){
      return parameters.get("secret");
    }
    public void set_secret(    String secret){
      parameters.put("secret",secret);
    }
  }
public static class flickr_photos_licenses_setLicense extends FlickrMethod {
    private String apiMethod="flickr.photos.licenses.setLicense";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_license_id(){
      return parameters.get("license_id");
    }
    public void set_license_id(    String license_id){
      parameters.put("license_id",license_id);
    }
  }
public static class flickr_photosets_editPhotos extends FlickrMethod {
    private String apiMethod="flickr.photosets.editPhotos";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photoset_id(){
      return parameters.get("photoset_id");
    }
    public void set_photoset_id(    String photoset_id){
      parameters.put("photoset_id",photoset_id);
    }
    public String get_primary_photo_id(){
      return parameters.get("primary_photo_id");
    }
    public void set_primary_photo_id(    String primary_photo_id){
      parameters.put("primary_photo_id",primary_photo_id);
    }
    public String get_photo_ids(){
      return parameters.get("photo_ids");
    }
    public void set_photo_ids(    String photo_ids){
      parameters.put("photo_ids",photo_ids);
    }
  }
public static class flickr_auth_getFrob extends FlickrMethod {
    private String apiMethod="flickr.auth.getFrob";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_prefs_getPrivacy extends FlickrMethod {
    private String apiMethod="flickr.prefs.getPrivacy";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
  }
public static class flickr_photos_recentlyUpdated extends FlickrMethod {
    private String apiMethod="flickr.photos.recentlyUpdated";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_min_date(){
      return parameters.get("min_date");
    }
    public void set_min_date(    String min_date){
      parameters.put("min_date",min_date);
    }
    public String get_extras(){
      return parameters.get("extras");
    }
    public void set_extras(    String extras){
      parameters.put("extras",extras);
    }
    public String get_per_page(){
      return parameters.get("per_page");
    }
    public void set_per_page(    String per_page){
      parameters.put("per_page",per_page);
    }
    public String get_page(){
      return parameters.get("page");
    }
    public void set_page(    String page){
      parameters.put("page",page);
    }
  }
public static class flickr_photos_geo_setPerms extends FlickrMethod {
    private String apiMethod="flickr.photos.geo.setPerms";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_is_public(){
      return parameters.get("is_public");
    }
    public void set_is_public(    String is_public){
      parameters.put("is_public",is_public);
    }
    public String get_is_contact(){
      return parameters.get("is_contact");
    }
    public void set_is_contact(    String is_contact){
      parameters.put("is_contact",is_contact);
    }
    public String get_is_friend(){
      return parameters.get("is_friend");
    }
    public void set_is_friend(    String is_friend){
      parameters.put("is_friend",is_friend);
    }
    public String get_is_family(){
      return parameters.get("is_family");
    }
    public void set_is_family(    String is_family){
      parameters.put("is_family",is_family);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
  }
public static class flickr_photos_suggestions_getList extends FlickrMethod {
    private String apiMethod="flickr.photos.suggestions.getList";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_status_id(){
      return parameters.get("status_id");
    }
    public void set_status_id(    String status_id){
      parameters.put("status_id",status_id);
    }
  }
public static class flickr_photos_geo_setLocation extends FlickrMethod {
    private String apiMethod="flickr.photos.geo.setLocation";
    private java.util.Map<String,String> parameters=new java.util.HashMap<String,String>();
    @Override
	public java.util.Map<String,String> get_parameters(){
      return parameters;
    }
    @Override
	public String get_apiMethod(){
      return apiMethod;
    }
    public String get_api_key(){
      return parameters.get("api_key");
    }
    public void set_api_key(    String api_key){
      parameters.put("api_key",api_key);
    }
    public String get_photo_id(){
      return parameters.get("photo_id");
    }
    public void set_photo_id(    String photo_id){
      parameters.put("photo_id",photo_id);
    }
    public String get_lat(){
      return parameters.get("lat");
    }
    public void set_lat(    String lat){
      parameters.put("lat",lat);
    }
    public String get_lon(){
      return parameters.get("lon");
    }
    public void set_lon(    String lon){
      parameters.put("lon",lon);
    }
    public String get_accuracy(){
      return parameters.get("accuracy");
    }
    public void set_accuracy(    String accuracy){
      parameters.put("accuracy",accuracy);
    }
    public String get_context(){
      return parameters.get("context");
    }
    public void set_context(    String context){
      parameters.put("context",context);
    }
  }
}
