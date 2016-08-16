package com.hajimatter.twitterpractice.twitter.domain.spec;

import java.util.List;

import org.dbflute.bhv.readable.CBCall;

import com.hajimatter.dbflute.cbean.TweetCB;

public class TweetPagingSpecificationForTweetList implements ITweetSpecification {

	private static final int PAGE_SIZE = 3;
	
	private Integer pageNumber;
	
	private List<Long> followingUserIds;
	
	@Override
	public CBCall<TweetCB> toQuery() {
		return cb -> {
			cb.query().setUserId_InScope(followingUserIds);
			cb.paging(PAGE_SIZE, pageNumber);
		};
	}

	public TweetPagingSpecificationForTweetList(List<Long> followingUserIds, Integer pageNumber) {
		if (followingUserIds == null || followingUserIds.size() == 0) {
			throw new IllegalArgumentException("followingUserIds cannot be empty");
		}
		this.followingUserIds = followingUserIds;
		if (pageNumber == null) {
			pageNumber = 1;
		}
		this.pageNumber = pageNumber;
	}
	
	
}
