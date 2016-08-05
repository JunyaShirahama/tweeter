package com.hajimatter.dbflute.cbean.cq.bs;

import java.util.Map;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.exception.IllegalConditionBeanOperationException;
import com.hajimatter.dbflute.cbean.cq.ciq.*;
import com.hajimatter.dbflute.cbean.*;
import com.hajimatter.dbflute.cbean.cq.*;

/**
 * The base condition-query of USER.
 * @author DBFlute(AutoGenerator)
 */
public class BsUserCQ extends AbstractBsUserCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from USER) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UserCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected UserCIQ xcreateCIQ() {
        UserCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UserCIQ xnewCIQ() {
        return new UserCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join USER on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UserCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        UserCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userId;
    public ConditionValue xdfgetUserId()
    { if (_userId == null) { _userId = nCV(); }
      return _userId; }
    protected ConditionValue xgetCValueUserId() { return xdfgetUserId(); }

    public Map<String, TweetCQ> xdfgetUserId_ExistsReferrer_TweetList() { return xgetSQueMap("userId_ExistsReferrer_TweetList"); }
    public String keepUserId_ExistsReferrer_TweetList(TweetCQ sq) { return xkeepSQue("userId_ExistsReferrer_TweetList", sq); }

    public Map<String, UserFollowingCQ> xdfgetUserId_ExistsReferrer_UserFollowingByFollowingUserIdList() { return xgetSQueMap("userId_ExistsReferrer_UserFollowingByFollowingUserIdList"); }
    public String keepUserId_ExistsReferrer_UserFollowingByFollowingUserIdList(UserFollowingCQ sq) { return xkeepSQue("userId_ExistsReferrer_UserFollowingByFollowingUserIdList", sq); }

    public Map<String, UserFollowingCQ> xdfgetUserId_ExistsReferrer_UserFollowingByFollowerUserIdList() { return xgetSQueMap("userId_ExistsReferrer_UserFollowingByFollowerUserIdList"); }
    public String keepUserId_ExistsReferrer_UserFollowingByFollowerUserIdList(UserFollowingCQ sq) { return xkeepSQue("userId_ExistsReferrer_UserFollowingByFollowerUserIdList", sq); }

    public Map<String, TweetCQ> xdfgetUserId_NotExistsReferrer_TweetList() { return xgetSQueMap("userId_NotExistsReferrer_TweetList"); }
    public String keepUserId_NotExistsReferrer_TweetList(TweetCQ sq) { return xkeepSQue("userId_NotExistsReferrer_TweetList", sq); }

    public Map<String, UserFollowingCQ> xdfgetUserId_NotExistsReferrer_UserFollowingByFollowingUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_UserFollowingByFollowingUserIdList"); }
    public String keepUserId_NotExistsReferrer_UserFollowingByFollowingUserIdList(UserFollowingCQ sq) { return xkeepSQue("userId_NotExistsReferrer_UserFollowingByFollowingUserIdList", sq); }

    public Map<String, UserFollowingCQ> xdfgetUserId_NotExistsReferrer_UserFollowingByFollowerUserIdList() { return xgetSQueMap("userId_NotExistsReferrer_UserFollowingByFollowerUserIdList"); }
    public String keepUserId_NotExistsReferrer_UserFollowingByFollowerUserIdList(UserFollowingCQ sq) { return xkeepSQue("userId_NotExistsReferrer_UserFollowingByFollowerUserIdList", sq); }

    public Map<String, TweetCQ> xdfgetUserId_SpecifyDerivedReferrer_TweetList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_TweetList"); }
    public String keepUserId_SpecifyDerivedReferrer_TweetList(TweetCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_TweetList", sq); }

    public Map<String, UserFollowingCQ> xdfgetUserId_SpecifyDerivedReferrer_UserFollowingByFollowingUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_UserFollowingByFollowingUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_UserFollowingByFollowingUserIdList(UserFollowingCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_UserFollowingByFollowingUserIdList", sq); }

    public Map<String, UserFollowingCQ> xdfgetUserId_SpecifyDerivedReferrer_UserFollowingByFollowerUserIdList() { return xgetSQueMap("userId_SpecifyDerivedReferrer_UserFollowingByFollowerUserIdList"); }
    public String keepUserId_SpecifyDerivedReferrer_UserFollowingByFollowerUserIdList(UserFollowingCQ sq) { return xkeepSQue("userId_SpecifyDerivedReferrer_UserFollowingByFollowerUserIdList", sq); }

    public Map<String, TweetCQ> xdfgetUserId_QueryDerivedReferrer_TweetList() { return xgetSQueMap("userId_QueryDerivedReferrer_TweetList"); }
    public String keepUserId_QueryDerivedReferrer_TweetList(TweetCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_TweetList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_TweetListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_TweetList"); }
    public String keepUserId_QueryDerivedReferrer_TweetListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_TweetList", pm); }

    public Map<String, UserFollowingCQ> xdfgetUserId_QueryDerivedReferrer_UserFollowingByFollowingUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_UserFollowingByFollowingUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_UserFollowingByFollowingUserIdList(UserFollowingCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_UserFollowingByFollowingUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_UserFollowingByFollowingUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_UserFollowingByFollowingUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_UserFollowingByFollowingUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_UserFollowingByFollowingUserIdList", pm); }

    public Map<String, UserFollowingCQ> xdfgetUserId_QueryDerivedReferrer_UserFollowingByFollowerUserIdList() { return xgetSQueMap("userId_QueryDerivedReferrer_UserFollowingByFollowerUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_UserFollowingByFollowerUserIdList(UserFollowingCQ sq) { return xkeepSQue("userId_QueryDerivedReferrer_UserFollowingByFollowerUserIdList", sq); }
    public Map<String, Object> xdfgetUserId_QueryDerivedReferrer_UserFollowingByFollowerUserIdListParameter() { return xgetSQuePmMap("userId_QueryDerivedReferrer_UserFollowingByFollowerUserIdList"); }
    public String keepUserId_QueryDerivedReferrer_UserFollowingByFollowerUserIdListParameter(Object pm) { return xkeepSQuePm("userId_QueryDerivedReferrer_UserFollowingByFollowerUserIdList", pm); }

    /** 
     * Add order-by as ascend. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserId_Asc() { regOBA("USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserId_Desc() { regOBD("USER_ID"); return this; }

    protected ConditionValue _userName;
    public ConditionValue xdfgetUserName()
    { if (_userName == null) { _userName = nCV(); }
      return _userName; }
    protected ConditionValue xgetCValueUserName() { return xdfgetUserName(); }

    /** 
     * Add order-by as ascend. <br>
     * USER_NAME: {UQ, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserName_Asc() { regOBA("USER_NAME"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_NAME: {UQ, NotNull, VARCHAR(10)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_UserName_Desc() { regOBD("USER_NAME"); return this; }

    protected ConditionValue _password;
    public ConditionValue xdfgetPassword()
    { if (_password == null) { _password = nCV(); }
      return _password; }
    protected ConditionValue xgetCValuePassword() { return xdfgetPassword(); }

    /** 
     * Add order-by as ascend. <br>
     * PASSWORD: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Password_Asc() { regOBA("PASSWORD"); return this; }

    /**
     * Add order-by as descend. <br>
     * PASSWORD: {NotNull, VARCHAR(20)}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_Password_Desc() { regOBD("PASSWORD"); return this; }

    protected ConditionValue _registerDatetime;
    public ConditionValue xdfgetRegisterDatetime()
    { if (_registerDatetime == null) { _registerDatetime = nCV(); }
      return _registerDatetime; }
    protected ConditionValue xgetCValueRegisterDatetime() { return xdfgetRegisterDatetime(); }

    /** 
     * Add order-by as ascend. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_RegisterDatetime_Asc() { regOBA("REGISTER_DATETIME"); return this; }

    /**
     * Add order-by as descend. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @return this. (NotNull)
     */
    public BsUserCQ addOrderBy_RegisterDatetime_Desc() { regOBD("REGISTER_DATETIME"); return this; }

    // ===================================================================================
    //                                                             SpecifiedDerivedOrderBy
    //                                                             =======================
    /**
     * Add order-by for specified derived column as ascend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] asc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Asc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsUserCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

    /**
     * Add order-by for specified derived column as descend.
     * <pre>
     * cb.specify().derivedPurchaseList().max(new SubQuery&lt;PurchaseCB&gt;() {
     *     public void query(PurchaseCB subCB) {
     *         subCB.specify().columnPurchaseDatetime();
     *     }
     * }, <span style="color: #CC4747">aliasName</span>);
     * <span style="color: #3F7E5E">// order by [alias-name] desc</span>
     * cb.<span style="color: #CC4747">addSpecifiedDerivedOrderBy_Desc</span>(<span style="color: #CC4747">aliasName</span>);
     * </pre>
     * @param aliasName The alias name specified at (Specify)DerivedReferrer. (NotNull)
     * @return this. (NotNull)
     */
    public BsUserCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, UserCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(UserCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, UserCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(UserCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, UserCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(UserCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UserCQ> _myselfExistsMap;
    public Map<String, UserCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(UserCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, UserCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(UserCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return UserCB.class.getName(); }
    protected String xCQ() { return UserCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
