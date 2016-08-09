package com.hajimatter.twitterpractice.user.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hajimatter.twitterpractice.user.domain.UserEtt;
import com.hajimatter.twitterpractice.user.domain.UserRepository;
import com.hajimatter.twitterpractice.user.domain.UserService;
import com.hajimatter.twitterpractice.user.domain.spec.IUserSpecification;
import com.hajimatter.twitterpractice.user.domain.spec.UserSpecificationForUserList;

/**
 * @author junya.shirahama
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/top", method = RequestMethod.GET)
	public ModelAndView top(ModelAndView mav) {
		mav.setViewName("top");
		return mav;
	}

	@RequestMapping(value = "/top", method = RequestMethod.POST)
	public ModelAndView top2(ModelAndView mav) {
		mav.setViewName("top");
		return mav;
	}

	// 特定のユーザー名とパスワードを入れるとtrueかfalseで返して、二つともtrueならmain画面、それ以外はtop画面に移る
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(@RequestParam("username") String username, @RequestParam("password") String password,
			ModelAndView mav) {
		if (userService.login(username, password)) {
			mav.setViewName("main");
			return mav;
		} else {
			mav.setViewName("top");
			return mav;
		}
	}

	//
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public ModelAndView register(@RequestParam("username") String username, @RequestParam("password") String password,
			ModelAndView mav) {

		UserEtt user = new UserEtt(username, password);
		userService.register(user);
		mav.setViewName("main");
		return mav;
	}

	@RequestMapping(value = "/createaccount", method = RequestMethod.GET)
	public ModelAndView createAccount(ModelAndView mav) {
		mav.setViewName("createAccount");
		return mav;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public ModelAndView logout(ModelAndView mav) {
		mav.setViewName("logout");
		return mav;
	}
	
	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
	public ModelAndView userlist(ModelAndView mav) {
		mav.setViewName("userList");
		return mav;
	}

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@ResponseBody
	public List<UserEtt> userList(ModelAndView mav) {
		mav.setViewName("users");
		IUserSpecification spec = new UserSpecificationForUserList("aaa");
		List<UserEtt> userList = userRepository.find(spec);
		return userList;
	}

	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public ModelAndView main(ModelAndView mav) {
		mav.setViewName("main");
		return mav;
	}

}
