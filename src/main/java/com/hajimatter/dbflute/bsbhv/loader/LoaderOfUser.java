package com.hajimatter.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.hajimatter.dbflute.exbhv.*;
import com.hajimatter.dbflute.exentity.*;
import com.hajimatter.dbflute.cbean.*;

/**
 * The referrer loader of USER as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_ID
 *
 * [column]
 *     USER_ID, USER_NAME, PASSWORD, FAVORITE_ARTIST, REGISTER_DATETIME
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_ID
 *
 * [version-no]
 *     
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     TWEET, USER_FOLLOWING
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tweetList, userFollowingByFollowingUserIdList, userFollowingByFollowerUserIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<User> _selectedList;
    protected BehaviorSelector _selector;
    protected UserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUser ready(List<User> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<Tweet> _referrerTweet;

    /**
     * Load referrer of tweetList by the set-upper of referrer. <br>
     * TWEET by USER_ID, named 'tweetList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTweet</span>(<span style="color: #553000">tweetCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">tweetCB</span>.setupSelect...
     *         <span style="color: #553000">tweetCB</span>.query().set...
     *         <span style="color: #553000">tweetCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">tweetLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    tweetLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getTweetList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTweet> loadTweet(ReferrerConditionSetupper<TweetCB> refCBLambda) {
        myBhv().loadTweet(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTweet = refLs);
        return hd -> hd.handle(new LoaderOfTweet().ready(_referrerTweet, _selector));
    }

    protected List<UserFollowing> _referrerUserFollowingByFollowingUserId;

    /**
     * Load referrer of userFollowingByFollowingUserIdList by the set-upper of referrer. <br>
     * USER_FOLLOWING by FOLLOWING_USER_ID, named 'userFollowingByFollowingUserIdList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadUserFollowingByFollowingUserId</span>(<span style="color: #553000">followingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">followingCB</span>.setupSelect...
     *         <span style="color: #553000">followingCB</span>.query().set...
     *         <span style="color: #553000">followingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">followingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    followingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getUserFollowingByFollowingUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFollowingUserId_InScope(pkList);
     * cb.query().addOrderBy_FollowingUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfUserFollowing> loadUserFollowingByFollowingUserId(ReferrerConditionSetupper<UserFollowingCB> refCBLambda) {
        myBhv().loadUserFollowingByFollowingUserId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerUserFollowingByFollowingUserId = refLs);
        return hd -> hd.handle(new LoaderOfUserFollowing().ready(_referrerUserFollowingByFollowingUserId, _selector));
    }

    protected List<UserFollowing> _referrerUserFollowingByFollowerUserId;

    /**
     * Load referrer of userFollowingByFollowerUserIdList by the set-upper of referrer. <br>
     * USER_FOLLOWING by FOLLOWER_USER_ID, named 'userFollowingByFollowerUserIdList'.
     * <pre>
     * <span style="color: #0000C0">userBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">userList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadUserFollowingByFollowerUserId</span>(<span style="color: #553000">followingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">followingCB</span>.setupSelect...
     *         <span style="color: #553000">followingCB</span>.query().set...
     *         <span style="color: #553000">followingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">followingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    followingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (User user : <span style="color: #553000">userList</span>) {
     *     ... = user.<span style="color: #CC4747">getUserFollowingByFollowerUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setFollowerUserId_InScope(pkList);
     * cb.query().addOrderBy_FollowerUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfUserFollowing> loadUserFollowingByFollowerUserId(ReferrerConditionSetupper<UserFollowingCB> refCBLambda) {
        myBhv().loadUserFollowingByFollowerUserId(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerUserFollowingByFollowerUserId = refLs);
        return hd -> hd.handle(new LoaderOfUserFollowing().ready(_referrerUserFollowingByFollowerUserId, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<User> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
