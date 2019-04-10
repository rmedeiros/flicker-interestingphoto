package es.um.scsyd.flicker.interestingphoto.flicker;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.stream.Collectors;

import org.codehaus.jackson.map.ObjectMapper;

public abstract class FlickrMethod {
	private static String baseUrl = "https://api.flickr.com/services/rest/?method=";

	private static ObjectMapper om = new ObjectMapper();

	public abstract String get_apiMethod();
    public abstract Map<String,String> get_parameters();

	public Map<String,Object> call()
	{
		try {
			URL url = new URL(baseUrl + get_apiMethod() + "&format=json&nojsoncallback=1&" +
					get_parameters().entrySet().stream()
							.map(e -> e.getKey() + "=" + e.getValue()).collect(Collectors.joining("&")));
			int code = 0;

            HttpURLConnection httpCon = (HttpURLConnection) url.openConnection();
            // you need the following if you pass server credentials
            httpCon.setDoOutput(true);
            httpCon.setRequestMethod("GET");
            code = httpCon.getResponseCode();

            if (code != 200 && code != 201) {
            	System.err.println("Error");
            	return null;
            }

            @SuppressWarnings("unchecked")
			Map<String,Object> userData = om.readValue(httpCon.getInputStream(), Map.class);
            //om.writeValue(System.out, userData);
            return userData;
        } catch (IOException e) {
        	e.printStackTrace();
        }

		return null;
	}
}
