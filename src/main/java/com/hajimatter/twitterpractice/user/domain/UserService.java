package com.hajimatter.twitterpractice.user.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hajimatter.twitterpractice.user.domain.spec.UserSpecificationForLogin;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public void register(UserEtt user) {
		// TODO validation
		userRepository.add(user);
	}
	
	public boolean login(String username, String password) {
		UserSpecificationForLogin spec = new UserSpecificationForLogin(username, password);
		UserEtt user = userRepository.findOne(spec);
//		if (user != null) {
//			return true;
//		} else {
//			return false;
//		}
		return user != null;
	}
}
