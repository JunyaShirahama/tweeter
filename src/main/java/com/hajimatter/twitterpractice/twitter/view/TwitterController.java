package com.hajimatter.twitterpractice.twitter.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hajimatter.twitterpractice.twitter.domain.TweetEtt;
import com.hajimatter.twitterpractice.twitter.domain.TwitterRepository;
import com.hajimatter.twitterpractice.twitter.domain.spec.ITweetSpecification;
import com.hajimatter.twitterpractice.twitter.domain.spec.TweetSpecificationForTweetList;

/**
 * @author junya.shirahama
 */
@Controller
public class TwitterController {
	
	@Autowired
	private TwitterRepository twitterRepository;
	
	// ツイート入力画面から内容を入れるとツイートのデータが入る
	@RequestMapping(value = "/tweets", method = RequestMethod.POST)
	public ModelAndView tweet(@RequestParam("tweet")String contents,
			ModelAndView mav) {
		mav.setViewName("main");
		TweetEtt twitterEtt = new TweetEtt(1, contents);
		twitterRepository.add(twitterEtt);
		return mav;
	}
	
	@RequestMapping(value = "/tweets", method = RequestMethod.GET)
	@ResponseBody
	public List<TweetEtt> tweetsList(ModelAndView mav) {
		mav.setViewName("tweetsList");
		ITweetSpecification spec = new TweetSpecificationForTweetList(1);
		List<TweetEtt> tweetList = twitterRepository.find(spec);
		
		return tweetList;
	}
}
