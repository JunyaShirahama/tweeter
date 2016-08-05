package com.hajimatter.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.hajimatter.dbflute.exbhv.*;
import com.hajimatter.dbflute.exentity.*;

/**
 * The referrer loader of USER_FOLLOWING as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_FOLLOWING_ID
 *
 * [column]
 *     USER_FOLLOWING_ID, FOLLOWER_USER_ID, FOLLOWING_USER_ID
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_FOLLOWING_ID
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
 *     userByFollowingUserId, userByFollowerUserId
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfUserFollowing {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<UserFollowing> _selectedList;
    protected BehaviorSelector _selector;
    protected UserFollowingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfUserFollowing ready(List<UserFollowing> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected UserFollowingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(UserFollowingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfUser _foreignUserByFollowingUserIdLoader;
    public LoaderOfUser pulloutUserByFollowingUserId() {
        if (_foreignUserByFollowingUserIdLoader == null)
        { _foreignUserByFollowingUserIdLoader = new LoaderOfUser().ready(myBhv().pulloutUserByFollowingUserId(_selectedList), _selector); }
        return _foreignUserByFollowingUserIdLoader;
    }

    protected LoaderOfUser _foreignUserByFollowerUserIdLoader;
    public LoaderOfUser pulloutUserByFollowerUserId() {
        if (_foreignUserByFollowerUserIdLoader == null)
        { _foreignUserByFollowerUserIdLoader = new LoaderOfUser().ready(myBhv().pulloutUserByFollowerUserId(_selectedList), _selector); }
        return _foreignUserByFollowerUserIdLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<UserFollowing> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
