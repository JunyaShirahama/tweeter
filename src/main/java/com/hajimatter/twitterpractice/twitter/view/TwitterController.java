package com.hajimatter.twitterpractice.twitter.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.hajimatter.twitterpractice.following.domain.spec.FollowingSpecificationByUserId;
import com.hajimatter.twitterpractice.following.domain.spec.IFollowingSpecification;
import com.hajimatter.twitterpractice.twitter.domain.TweetEtt;
import com.hajimatter.twitterpractice.twitter.domain.TwitterRepository;
import com.hajimatter.twitterpractice.twitter.domain.spec.ITweetSpecification;
import com.hajimatter.twitterpractice.twitter.domain.spec.TweetPagingSpecificationForTweetList;
import com.hajimatter.twitterpractice.user.domain.UserEtt;
import com.hajimatter.twitterpractice.user.domain.UserRepository;
import com.hajimatter.twitterpractice.user.domain.spec.IUserSpecification;
import com.hajimatter.twitterpractice.user.domain.spec.UserSpecificationByUserIds;

/**
 * @author junya.shirahama
 */
@Controller
public class TwitterController {

	@Autowired
	private TwitterRepository twitterRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private FollowingRepository followingRepository;

	// ツイート入力画面から内容を入れるとツイートのデータが入る
	@RequestMapping(value = "/tweets", method = RequestMethod.POST)
	public ModelAndView tweet(@RequestParam("tweet") String contents, @SessionAttribute("userId") Long userId,
			ModelAndView mav) {
		mav.setViewName("main");
		TweetEtt twitterEtt = new TweetEtt(userId, contents);
		twitterRepository.add(twitterEtt);
		return mav;
	}

	// フォローしているユーザーのツイートを取得（したい）
	@RequestMapping(value = "/tweets", method = RequestMethod.GET)
	@ResponseBody
	public PagingListData<TweetPO> tweetPageList(@SessionAttribute("userId") Long userId, @RequestParam(required = false, name="p") Integer pageNumber) {
		
		IFollowingSpecification spec2 = new FollowingSpecificationByUserId(userId);
		List<FollowingEtt> followings = followingRepository.find(spec2);
		List<Long> followingUserIds = new ArrayList<>();
		followingUserIds.add(userId);
		for (FollowingEtt following : followings) {
			followingUserIds.add(following.getFollowingUserId());
		}
		ITweetSpecification spec3 = new TweetPagingSpecificationForTweetList(followingUserIds, pageNumber);
		PagingList<TweetEtt> tweetList = twitterRepository.findPage(spec3);

		IUserSpecification spec = new UserSpecificationByUserIds(followingUserIds);
		List<UserEtt> users = userRepository.find(spec);
		Map<Long, UserEtt> userMap = new HashMap<>();
		for (UserEtt user : users) {
			userMap.put(user.getId(), user);
		}
		// 最終的に画面に出したい情報(TweetPO)の一覧
		List<TweetPO> tweetPOs = new ArrayList<>();
		for (TweetEtt tweet : tweetList) {
			Long tweetUserId = tweet.getUserId();
			UserEtt user = userMap.get(tweetUserId);
			tweetPOs.add(new TweetPO(tweet, user.getUsername()));
		}
		return new PagingListData<>(tweetList.getCurrentPage(), tweetList.existsNextPage(), tweetPOs);
	}
}
