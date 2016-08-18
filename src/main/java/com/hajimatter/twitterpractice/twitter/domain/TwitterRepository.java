package com.hajimatter.twitterpractice.twitter.domain;

import java.sql.Date;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import org.dbflute.cbean.result.ListResultBean;
import org.dbflute.cbean.result.PagingResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hajimatter.dbflute.exbhv.TweetBhv;
import com.hajimatter.dbflute.exentity.Tweet;
import com.hajimatter.twitterpractice.base.infrastructure.PagingList;
import com.hajimatter.twitterpractice.twitter.domain.spec.ITweetSpecification;

@Repository
public class TwitterRepository {

	@Autowired
	private TweetBhv tweetBhv;
	
	public Long add(TweetEtt tweet) {
		Tweet entity = new Tweet();
		entity.setUserId(tweet.getUserId());
		entity.setContents(tweet.getContents());
		tweetBhv.insert(entity);
		return entity.getTweetId();
	}
	
	public List<TweetEtt> find(ITweetSpecification spec) {
		ListResultBean<Tweet> selectList = tweetBhv.selectList(spec.toQuery());
		if (selectList == null) {
			return null;
		} else {
			List<TweetEtt> tweetList = new ArrayList<>();
			for (Tweet tweet : selectList) {
				TweetEtt twitterEtt = convertToEntity(tweet);
				tweetList.add(twitterEtt);
			}
			return tweetList;
		}
		
	}
	
	public PagingList<TweetEtt> findPage(ITweetSpecification spec) {
		PagingResultBean<Tweet> selectPage = tweetBhv.selectPage(spec.toQuery());
		List<TweetEtt> tweetList = new ArrayList<>();
		for (Tweet tweet : selectPage) {
			TweetEtt tweetEtt = convertToEntity(tweet);
			tweetList.add(tweetEtt);
		}
		PagingList<TweetEtt> pagingTweets = new PagingList<>(selectPage.getCurrentPageNumber(), selectPage.existsNextPage(), tweetList);
		return pagingTweets;
	}
	
	private TweetEtt convertToEntity(Tweet tweet) {
		if (tweet == null) {
			return null;
		}
		return new TweetEtt(tweet.getTweetId(), tweet.getUserId(), tweet.getContents(),
				Date.from(tweet.getTweetDatetime().atZone(ZoneId.systemDefault()).toInstant()));
				
	}
}
