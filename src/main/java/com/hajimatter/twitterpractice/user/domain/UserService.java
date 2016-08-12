package com.hajimatter.twitterpractice.user.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public void register(UserEtt user) {
		userRepository.add(user);
	}
}
