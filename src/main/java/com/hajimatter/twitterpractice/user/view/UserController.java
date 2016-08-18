package com.hajimatter.twitterpractice.user.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.hajimatter.twitterpractice.base.application.PagingListData;
import com.hajimatter.twitterpractice.base.infrastructure.PagingList;
import com.hajimatter.twitterpractice.following.domain.FollowingEtt;
import com.hajimatter.twitterpractice.following.domain.FollowingRepository;
import com.hajimatter.twitterpractice.following.domain.spec.FollowingSpecificationForFollowList;
import com.hajimatter.twitterpractice.user.domain.UserEtt;
import com.hajimatter.twitterpractice.user.domain.UserRepository;
import com.hajimatter.twitterpractice.user.domain.UserService;
import com.hajimatter.twitterpractice.user.domain.spec.IUserSpecification;
import com.hajimatter.twitterpractice.user.domain.spec.UserPagingSpecificationByUserId;
import com.hajimatter.twitterpractice.user.domain.spec.UserSpecificationByUserId;

/**
 * @author junya.shirahama
 */
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private FollowingRepository followingRepository;

	@RequestMapping(value = "/top", method = RequestMethod.GET)
	public ModelAndView top(ModelAndView mav) {
		mav.setViewName("top");
		return mav;
	}

	// 会員登録
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public ModelAndView register(@RequestParam("username") String username, @RequestParam("password") String password, @RequestParam("favoriteArtist") String favoriteArtist, ModelAndView mav) {
		UserEtt user = new UserEtt(username, password, favoriteArtist);
		userService.register(user);
		mav.setViewName("top");
		return mav;
	}

	@RequestMapping(value = "/createaccount", method = RequestMethod.GET)
	public ModelAndView createAccount(ModelAndView mav) {
		mav.setViewName("createAccount");
		return mav;
	}

//	@RequestMapping(value = "/logout", method = RequestMethod.GET)
//	public ModelAndView logout(ModelAndView mav) {
//		mav.setViewName("logout");
//		return mav;
//	}
	
	// 会員情報の取得
	@RequestMapping(value = "/userinformation", method = RequestMethod.GET)
	public ModelAndView userinformation(ModelAndView mav, @SessionAttribute("userId") Long userId) {
		IUserSpecification spec = new UserSpecificationByUserId(userId);
		UserEtt user = userRepository.findOne(spec);
		mav.addObject("username", user.getUsername());
		mav.setViewName("userInformation");
		return mav;
	}
	
	// 会員情報を変更
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ModelAndView user(@SessionAttribute("userId") Long userId, @RequestParam("favoriteArtist") String favoriteArtist, ModelAndView mav) {
		UserEtt user = new UserEtt(userId, favoriteArtist);
		userRepository.update(user);
		mav.setViewName("userInformation");
		return mav;
	}
	
	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
	public ModelAndView userlist(ModelAndView mav) {
		mav.setViewName("userList");
		return mav;
	}	
	
	// フォローしている人としてない人の情報を加えたユーザー一覧の取得
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	@ResponseBody
	public PagingListData<UserPO> userList(ModelAndView mav, @SessionAttribute("userId") Long userId, @RequestParam(required = false, name="p") Integer pageNumber) {
		// TODO login user id: 1
		long loginUserId = userId;
		mav.setViewName("users");
		// ユーザーDBからuserListを取得（本来ならばページングを考慮する。とりあえず全件取得）
		IUserSpecification spec = new UserPagingSpecificationByUserId(userId , pageNumber);
		PagingList<UserEtt> userList = userRepository.findPage(spec);
		List<Long> userIds  = new ArrayList<>();
		// userListのユーザーからidを抽出してuserIdのリスト(=userIds)を作る
		for(UserEtt user : userList){
			userIds.add(user.getId());
		}
		// ログイン中であるフォロワー（予定）のloginUserId（とりあえずid:1）とuserIdsからloginUserIdの人がフォローしているフォローレコードの一覧(=followsings)を取得
		List<FollowingEtt> followings  = followingRepository.find(new FollowingSpecificationForFollowList(loginUserId, userIds));
		// followingsからidを抽出して、followingsUserIdsを作る（存在すればフォローしているという判断ができる）
		Set<Long> followingUserIds = new HashSet<>();
		for(FollowingEtt following : followings){
			followingUserIds.add(following.getFollowingUserId());
		}
		// 最終的に画面出したい情報=UserPOの一覧
		List<UserPO> userPOs  = new ArrayList<>();
		// UserEttからidとusernameを取得。followingUserIdsの中にidがあればtrue、なければfalse
		for(UserEtt user : userList){
			Long id = user.getId();
			String username = user.getUsername();
			boolean isFollowing = followingUserIds.contains(id);
			userPOs.add(new UserPO(id, username, isFollowing));
		}
		return new PagingListData<>(userList.getCurrentPage(), userList.existsNextPage(), userPOs);
	}

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public ModelAndView main(ModelAndView mav, @SessionAttribute("userId") Long userId) {
		mav.setViewName("main");
		IUserSpecification spec = new UserSpecificationByUserId(userId);
		UserEtt user = userRepository.findOne(spec);
		mav.addObject("msg", "ようこそ " + user.getUsername() + " さん");
		mav.addObject("username", user.getUsername());
		return mav;
	}

}
