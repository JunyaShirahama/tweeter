package com.hajimatter.twitterpractice.twitter.view;

import java.util.Date;

import com.hajimatter.twitterpractice.twitter.domain.TweetEtt;

import lombok.Getter;

public class TweetPO {
	@Getter
	private long id;
	@Getter
	private long userId;
	@Getter
	private String userName;
	@Getter
	private String contents;
	@Getter
	private Date tweetDateTime;
	
	public TweetPO(TweetEtt tweet, String userName){
		id = tweet.getId();
		userId = tweet.getUserId();
		contents = tweet.getContents();
		tweetDateTime = tweet.getTweetDateTime();
		this.userName = userName;
		
	}
}
