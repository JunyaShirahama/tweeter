package com.hajimatter.twitterpractice.twitter.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.hajimatter.twitterpractice.following.domain.spec.FollowingSpecificationByUserId;
import com.hajimatter.twitterpractice.following.domain.spec.IFollowingSpecification;
import com.hajimatter.twitterpractice.twitter.domain.TweetEtt;
import com.hajimatter.twitterpractice.twitter.domain.TwitterRepository;
import com.hajimatter.twitterpractice.twitter.domain.spec.ITweetSpecification;
import com.hajimatter.twitterpractice.twitter.domain.spec.TweetSpecificationForTweetList;
import com.hajimatter.twitterpractice.user.domain.UserEtt;
import com.hajimatter.twitterpractice.user.domain.UserRepository;

/**
 * @author junya.shirahama
 */
@Controller
public class TwitterController {
	
	@Autowired
	private TwitterRepository twitterRepository;
	@Autowired
	private UserRepository userRepository;
	
	// ツイート入力画面から内容を入れるとツイートのデータが入る
	@RequestMapping(value = "/tweets", method = RequestMethod.POST)
	public ModelAndView tweet(@RequestParam("tweet")String contents, @SessionAttribute("userId") Long userId,
			ModelAndView mav) {
		mav.setViewName("main");
		TweetEtt twitterEtt = new TweetEtt(userId, contents);
		twitterRepository.add(twitterEtt);
		return mav;
	}
	
	// フォローしているユーザーのツイートを取得（したい）
	@RequestMapping(value = "/tweets", method = RequestMethod.GET)
	@ResponseBody
	public List<TweetEtt> tweetsList(ModelAndView mav, @SessionAttribute("userId") Long userId) {
		mav.setViewName("tweetsList");
		ITweetSpecification spec = new TweetSpecificationForTweetList(userId);
		List<TweetEtt> tweetList = twitterRepository.find(spec);
		
		// List<UserEtt> users = userRepository.find(Spec ..)
//		IFollowingSpecification spec2 = new FollowingSpecificationByUserId(userId);
//		List<UserEtt> users = userRepository.find(spec2);
		// for(TweetEtt tweet : tweetList)
		// List<TweetPO> 
		
		return tweetList;
	}
}
