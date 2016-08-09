package com.hajimatter.twitterpractice.following.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hajimatter.twitterpractice.following.domain.FollowingEtt;
import com.hajimatter.twitterpractice.following.domain.FollowingService;

/**
 * @author junya.shirahama
 */
@RestController
public class FollowingController {
	@Autowired
	private FollowingService followingService;

	@RequestMapping(value = "/follows", method = RequestMethod.POST)
	public ResponseEntity<?> follow(
			@RequestBody FollowingEtt following) {
		Long followingId =followingService.register(following);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.setLocation(ServletUriComponentsBuilder
				.fromCurrentRequest().path("/{id}")
				.buildAndExpand(followingId).toUri());
		return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
	}
}
