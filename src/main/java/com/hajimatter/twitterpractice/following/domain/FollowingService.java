package com.hajimatter.twitterpractice.following.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author junya.shirahama
 */
@Service
public class FollowingService {

	@Autowired
	private FollowingRepository followingRepositoty;
	
	public Long register(FollowingEtt following) {
		return followingRepositoty.add(following);
	}
}
