package com.hajimatter.twitterpractice.user.domain.spec;

import java.util.List;

import org.dbflute.bhv.readable.CBCall;

import com.hajimatter.dbflute.cbean.UserCB;

public class UserSpecificationByUserIds implements IUserSpecification {

	private List<Long> userIds;
	
	@Override
	public CBCall<UserCB> toQuery() {
		return cb -> {
			cb.query().setUserId_InScope(userIds);
		};
	}

	public UserSpecificationByUserIds(List<Long> userIds) {
		if (userIds == null || userIds.size() == 0) {
			throw new IllegalAccessError("userIds cannot be empty.");
		}
		this.userIds = userIds;
	}
	
	
}
