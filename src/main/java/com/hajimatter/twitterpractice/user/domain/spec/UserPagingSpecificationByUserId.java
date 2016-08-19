package com.hajimatter.twitterpractice.user.domain.spec;

import org.dbflute.bhv.readable.CBCall;

import com.hajimatter.dbflute.cbean.UserCB;

public class UserPagingSpecificationByUserId implements IUserSpecification {
	
	private long userId;

	private Integer pageNumber;

	private static final int PAGE_SIZE = 10;

	@Override
	public CBCall<UserCB> toQuery() {
		return cb -> {
			cb.query().setUserId_NotEqual(userId);
			cb.paging(PAGE_SIZE, pageNumber);
		};
	}

	public UserPagingSpecificationByUserId(long userId, Integer pageNumber) {
		this.userId = userId;
		if (pageNumber == null) {
			pageNumber = 1;
		}
		this.pageNumber = pageNumber;
	}

}
