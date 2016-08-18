package com.hajimatter.dbflute.cbean.cq.ciq;

import java.util.Map;
import org.dbflute.cbean.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.ConditionOption;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.hajimatter.dbflute.cbean.*;
import com.hajimatter.dbflute.cbean.cq.bs.*;
import com.hajimatter.dbflute.cbean.cq.*;

/**
 * The condition-query for in-line of USER.
 * @author DBFlute(AutoGenerator)
 */
public class UserCIQ extends AbstractBsUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected BsUserCQ _myCQ;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public UserCIQ(ConditionQuery referrerQuery, SqlClause sqlClause
                        , String aliasName, int nestLevel, BsUserCQ myCQ) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
        _myCQ = myCQ;
        _foreignPropertyName = _myCQ.xgetForeignPropertyName(); // accept foreign property name
        _relationPath = _myCQ.xgetRelationPath(); // accept relation path
        _inline = true;
    }

    // ===================================================================================
    //                                                             Override about Register
    //                                                             =======================
    protected void reflectRelationOnUnionQuery(ConditionQuery bq, ConditionQuery uq)
    { throw new IllegalConditionBeanOperationException("InlineView cannot use Union: " + bq + " : " + uq); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col)
    { regIQ(k, v, cv, col); }

    @Override
    protected void setupConditionValueAndRegisterWhereClause(ConditionKey k, Object v, ConditionValue cv, String col, ConditionOption op)
    { regIQ(k, v, cv, col, op); }

    @Override
    protected void registerWhereClause(String wc)
    { registerInlineWhereClause(wc); }

    @Override
    protected boolean isInScopeRelationSuppressLocalAliasName() {
        if (_onClause) { throw new IllegalConditionBeanOperationException("InScopeRelation on OnClause is unsupported."); }
        return true;
    }

    // ===================================================================================
    //                                                                Override about Query
    //                                                                ====================
    protected ConditionValue xgetCValueUserId() { return _myCQ.xdfgetUserId(); }
    public String keepUserId_ExistsReferrer_TweetList(TweetCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_UserFollowingByFollowingUserIdList(UserFollowingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_ExistsReferrer_UserFollowingByFollowerUserIdList(UserFollowingCQ sq)
    { throwIICBOE("ExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_TweetList(TweetCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_UserFollowingByFollowingUserIdList(UserFollowingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_NotExistsReferrer_UserFollowingByFollowerUserIdList(UserFollowingCQ sq)
    { throwIICBOE("NotExistsReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_TweetList(TweetCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_UserFollowingByFollowingUserIdList(UserFollowingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_SpecifyDerivedReferrer_UserFollowingByFollowerUserIdList(UserFollowingCQ sq)
    { throwIICBOE("(Specify)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TweetList(TweetCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_TweetListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_UserFollowingByFollowingUserIdList(UserFollowingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_UserFollowingByFollowingUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_UserFollowingByFollowerUserIdList(UserFollowingCQ sq)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    public String keepUserId_QueryDerivedReferrer_UserFollowingByFollowerUserIdListParameter(Object vl)
    { throwIICBOE("(Query)DerivedReferrer"); return null; }
    protected ConditionValue xgetCValueUserName() { return _myCQ.xdfgetUserName(); }
    protected ConditionValue xgetCValuePassword() { return _myCQ.xdfgetPassword(); }
    protected ConditionValue xgetCValueFavoriteArtist() { return _myCQ.xdfgetFavoriteArtist(); }
    protected ConditionValue xgetCValueRegisterDatetime() { return _myCQ.xdfgetRegisterDatetime(); }
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String pp) { return null; }
    public String keepScalarCondition(UserCQ sq)
    { throwIICBOE("ScalarCondition"); return null; }
    public String keepSpecifyMyselfDerived(UserCQ sq)
    { throwIICBOE("(Specify)MyselfDerived"); return null;}
    public String keepQueryMyselfDerived(UserCQ sq)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepQueryMyselfDerivedParameter(Object vl)
    { throwIICBOE("(Query)MyselfDerived"); return null;}
    public String keepMyselfExists(UserCQ sq)
    { throwIICBOE("MyselfExists"); return null;}

    protected void throwIICBOE(String name)
    { throw new IllegalConditionBeanOperationException(name + " at InlineView is unsupported."); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xinCB() { return UserCB.class.getName(); }
    protected String xinCQ() { return UserCQ.class.getName(); }
}
