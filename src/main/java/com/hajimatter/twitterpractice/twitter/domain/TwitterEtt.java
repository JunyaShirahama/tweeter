package com.hajimatter.twitterpractice.twitter.domain;

import java.util.Date;

import lombok.Getter;

public class TwitterEtt {

	@Getter
	private long id;
	@Getter
	private long userId;
	@Getter
	private String contents;
	@Getter
	private Date tweetDateTime;
	
	public TwitterEtt(long id, long userId, String contents) {
		this.id = id;
		this.userId = userId;
		this.contents = contents;
		this.tweetDateTime = new Date();
	}
	
	
}