package com.hajimatter.twitterpractice.twitter.domain;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

public class TweetEtt {

	@Getter
	private long id;
	@Getter
	@Setter
	private long userId;
	@Getter
	@NotEmpty(message = "ツイートを入力してください")
	@Length(min = 1, max = 140, message = "140字以下でツイートしてください")
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
	
	@JsonCreator
	public TweetEtt(@JsonProperty("contents") String contents) {
		this.contents = contents;
	}
	
	
	
}