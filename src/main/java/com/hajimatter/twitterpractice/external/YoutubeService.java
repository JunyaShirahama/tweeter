package com.hajimatter.twitterpractice.external;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

import org.springframework.stereotype.Service;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.services.youtube.YouTube;
import com.google.api.services.youtube.model.SearchListResponse;
import com.google.api.services.youtube.model.SearchResult;

@Service
public class YoutubeService {

	/** Global instance properties filename. */
	private static String PROPERTIES_FILENAME = "youtube.properties";

	/** Global instance of the HTTP transport. */
	private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();

	/** Global instance of the JSON factory. */
	private static final JsonFactory JSON_FACTORY = new JacksonFactory();

	/**
	 * Global instance of the max number of videos we want returned (50 = upper
	 * limit per page).
	 */
	private static final long NUMBER_OF_VIDEOS_RETURNED = 25;

	/** Global instance of Youtube object to make all API requests. */
	private static YouTube youtube;

	public YoutubeVideo findVideos(String keyword) {

		// Read the developer key from youtube.properties
		Properties properties = new Properties();
		try {
			InputStream in = YoutubeVideo.class.getResourceAsStream("/" + PROPERTIES_FILENAME);
			properties.load(in);

		} catch (IOException e) {
			System.err.println(
					"There was an error reading " + PROPERTIES_FILENAME + ": " + e.getCause() + " : " + e.getMessage());
			System.exit(1);
		}

		try {
			/*
			 * The YouTube object is used to make all API requests. The last
			 * argument is required, but because we don't need anything
			 * initialized when the HttpRequest is initialized, we override the
			 * interface and provide a no-op function.
			 */
			youtube = new YouTube.Builder(HTTP_TRANSPORT, JSON_FACTORY, new HttpRequestInitializer() {
				public void initialize(HttpRequest request) throws IOException {
				}
			}).setApplicationName("youtube-cmdline-search-sample").build();

			YouTube.Search.List search = youtube.search().list("id");
			/*
			 * It is important to set your developer key from the Google
			 * Developer Console for non-authenticated requests (found under the
			 * API Access tab at this link: code.google.com/apis/). This is good
			 * practice and increased your quota.
			 */
			String apiKey = properties.getProperty("youtube.apikey");
			search.setKey(apiKey);
			search.setQ(keyword);
			/*
			 * We are only searching for videos (not playlists or channels). If
			 * we were searching for more, we would add them as a string like
			 * this: "video,playlist,channel".
			 */
			search.setType("video");
			/*
			 * This method reduces the info returned to only the fields we need
			 * and makes calls more efficient.
			 */
			search.setFields("items(id/kind,id/videoId,snippet/title,snippet/thumbnails/default/url)");
			search.setMaxResults(NUMBER_OF_VIDEOS_RETURNED);
			SearchListResponse searchResponse = search.execute();

			List<SearchResult> searchResultList = searchResponse.getItems();

			if (searchResultList.size() > 1) {
				SearchResult result = searchResultList.get(0);
				return new YoutubeVideo(result.getId().getVideoId());
			}
		} catch (GoogleJsonResponseException e) {
			System.err.println(
					"There was a service error: " + e.getDetails().getCode() + " : " + e.getDetails().getMessage());
		} catch (IOException e) {
			System.err.println("There was an IO error: " + e.getCause() + " : " + e.getMessage());
		} catch (Throwable t) {
			t.printStackTrace();
		}

		return null;
	}

}
