package com.hajimatter.twitterpractice.user.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hajimatter.twitterpractice.user.domain.UserEtt;
import com.hajimatter.twitterpractice.user.domain.UserService;

/**
 * @author junya.shirahama
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		mav.addObject("msg", "フォームを送信下さい。");
		return mav;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView send(@RequestParam(value = "check1", required = false) boolean check1,
			@RequestParam(value = "radio1", required = false) String radio1,
			@RequestParam(value = "select1", required = false) String select1,
			@RequestParam(value = "select2", required = false) String[] select2, ModelAndView mav) {

		String res = "";
		try {
			res = "check:" + check1 + " radio:" + radio1 + " select:" + select1 + "\nselect2:";
		} catch (NullPointerException e) {
		}
		try {
			res += select2[0];
			for (int i = 1; i < select2.length; i++)
				res += ", " + select2[i];
		} catch (NullPointerException e) {
			res += "null";
		}
		mav.addObject("msg", res);
		mav.setViewName("index");
		return mav;
	}

	// @RequestMapping(value = "/", method = RequestMethod.GET)
	// public ModelAndView index(ModelAndView mav) {
	// mav.setViewName("index");
	// mav.addObject("msg", "お名前を書いて送信してください。");
	// return mav;
	// }
	//
	// @RequestMapping(value = "/", method = RequestMethod.POST)
	// public ModelAndView send(@RequestParam("text1")String str, ModelAndView
	// mav) {
	// mav.addObject("msg", "こんにちは、" + str + "さん！");
	// mav.addObject("value", str);
	// mav.setViewName("index");
	// return mav;
	// }

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
	public ModelAndView userList(ModelAndView mav) {
		mav.setViewName("userList");
		return mav;
	}

	@RequestMapping(value = "/main", method = RequestMethod.POST)
	public ModelAndView main(ModelAndView mav) {
		mav.setViewName("main");
		return mav;
	}

}
