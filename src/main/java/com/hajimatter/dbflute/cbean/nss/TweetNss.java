package com.hajimatter.dbflute.cbean.nss;

import com.hajimatter.dbflute.cbean.cq.TweetCQ;

/**
 * The nest select set-upper of TWEET.
 * @author DBFlute(AutoGenerator)
 */
public class TweetNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TweetCQ _query;
    public TweetNss(TweetCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * USER by my USER_ID, named 'user'.
     */
    public void withUser() {
        _query.xdoNss(() -> _query.queryUser());
    }
}
