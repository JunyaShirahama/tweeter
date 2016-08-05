package com.hajimatter.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.hajimatter.dbflute.exbhv.*;
import com.hajimatter.dbflute.exentity.*;

/**
 * The referrer loader of TWEET as TABLE. <br>
 * <pre>
 * [primary key]
 *     TWEET_ID
 *
 * [column]
 *     TWEET_ID, USER_ID, CONTENTS, TWEET_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TWEET_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     USER
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     user
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTweet {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<Tweet> _selectedList;
    protected BehaviorSelector _selector;
    protected TweetBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTweet ready(List<Tweet> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TweetBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TweetBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfUser _foreignUserLoader;
    public LoaderOfUser pulloutUser() {
        if (_foreignUserLoader == null)
        { _foreignUserLoader = new LoaderOfUser().ready(myBhv().pulloutUser(_selectedList), _selector); }
        return _foreignUserLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<Tweet> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
