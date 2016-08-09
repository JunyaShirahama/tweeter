package com.hajimatter.twitterpractice.following.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hajimatter.dbflute.exbhv.UserFollowingBhv;
import com.hajimatter.dbflute.exentity.UserFollowing;

/**
 * @author junya.shirahama
 */
@Repository
public class FollowingRepository {

	@Autowired
	private UserFollowingBhv userFollowingBhv;
	
	public Long add(FollowingEtt following) {
		UserFollowing entity = new UserFollowing();
		entity.setFollowerUserId(following.getFollowerUserId());
		entity.setFollowingUserId(following.getFollowingUserId());
		userFollowingBhv.insert(entity);
		return entity.getUserFollowingId();
	}
}
