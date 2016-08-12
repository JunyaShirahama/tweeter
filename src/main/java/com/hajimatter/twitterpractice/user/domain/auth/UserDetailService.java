package com.hajimatter.twitterpractice.user.domain.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.hajimatter.twitterpractice.user.domain.UserEtt;
import com.hajimatter.twitterpractice.user.domain.UserRepository;
import com.hajimatter.twitterpractice.user.domain.spec.UserSpecificationByUserName;

@Component
public class UserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		UserSpecificationByUserName spec = new UserSpecificationByUserName(userName);
		UserEtt user = userRepository.findOne(spec);
		UserDetails details;
		if (user != null) {
			details = new com.hajimatter.twitterpractice.user.domain.auth.UserDetails(user.getId(), user.getUsername(),
					user.getPassword(), AuthorityUtils.createAuthorityList("ROLE_USER"));
		} else {
			throw new UsernameNotFoundException("user not found");
		}
		return details;
	}

}
