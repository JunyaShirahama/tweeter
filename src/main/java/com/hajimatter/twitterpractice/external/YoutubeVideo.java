package com.hajimatter.twitterpractice.external;

import lombok.Getter;

public class YoutubeVideo {
	
	@Getter
	private String id;

	public YoutubeVideo(String id) {
		this.id = id;
	}
	
}
