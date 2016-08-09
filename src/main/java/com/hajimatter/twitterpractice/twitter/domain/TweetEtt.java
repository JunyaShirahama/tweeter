package com.hajimatter.twitterpractice.twitter.domain;

import java.util.Date;

import lombok.Getter;

public class TweetEtt {

	@Getter
	private long id;
	@Getter
	private long userId;
	@Getter
	private String contents;
	@Getter
	private Date tweetDateTime;
	
	public TweetEtt(long id, long userId, String contents, Date tweetDateTime) {
		this.id = id;
		this.userId = userId;
		this.contents = contents;
		this.tweetDateTime = tweetDateTime;
	}
	
	public TweetEtt(long userId, String contents) {
		this.userId = userId;
		this.contents = contents;
		this.tweetDateTime = new Date();
	}
	
	
}