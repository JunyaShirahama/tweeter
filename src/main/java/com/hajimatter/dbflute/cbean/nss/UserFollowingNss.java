package com.hajimatter.dbflute.cbean.nss;

import com.hajimatter.dbflute.cbean.cq.UserFollowingCQ;

/**
 * The nest select set-upper of USER_FOLLOWING.
 * @author DBFlute(AutoGenerator)
 */
public class UserFollowingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final UserFollowingCQ _query;
    public UserFollowingNss(UserFollowingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * USER by my FOLLOWING_USER_ID, named 'userByFollowingUserId'.
     */
    public void withUserByFollowingUserId() {
        _query.xdoNss(() -> _query.queryUserByFollowingUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * USER by my FOLLOWER_USER_ID, named 'userByFollowerUserId'.
     */
    public void withUserByFollowerUserId() {
        _query.xdoNss(() -> _query.queryUserByFollowerUserId());
    }
}
