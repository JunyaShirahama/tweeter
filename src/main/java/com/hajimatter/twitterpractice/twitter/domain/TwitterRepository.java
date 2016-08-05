package com.hajimatter.twitterpractice.twitter.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hajimatter.dbflute.exbhv.TweetBhv;
import com.hajimatter.dbflute.exentity.Tweet;

@Repository
public class TwitterRepository {

	@Autowired
	private TweetBhv tweetBhv;
	
	public void add(TwitterEtt tweet) {
		Tweet entity = new Tweet();
		entity.setContents(tweet.getContents());
		
		tweetBhv.insert(entity);
	}
}
