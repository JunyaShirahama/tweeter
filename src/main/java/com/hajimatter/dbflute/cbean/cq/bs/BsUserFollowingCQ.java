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
 * The base condition-query of USER_FOLLOWING.
 * @author DBFlute(AutoGenerator)
 */
public class BsUserFollowingCQ extends AbstractBsUserFollowingCQ {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected UserFollowingCIQ _inlineQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsUserFollowingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                 InlineView/OrClause
    //                                                                 ===================
    /**
     * Prepare InlineView query. <br>
     * {select ... from ... left outer join (select * from USER_FOLLOWING) where FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">inline()</span>.setFoo...;
     * </pre>
     * @return The condition-query for InlineView query. (NotNull)
     */
    public UserFollowingCIQ inline() {
        if (_inlineQuery == null) { _inlineQuery = xcreateCIQ(); }
        _inlineQuery.xsetOnClause(false); return _inlineQuery;
    }

    protected UserFollowingCIQ xcreateCIQ() {
        UserFollowingCIQ ciq = xnewCIQ();
        ciq.xsetBaseCB(_baseCB);
        return ciq;
    }

    protected UserFollowingCIQ xnewCIQ() {
        return new UserFollowingCIQ(xgetReferrerQuery(), xgetSqlClause(), xgetAliasName(), xgetNestLevel(), this);
    }

    /**
     * Prepare OnClause query. <br>
     * {select ... from ... left outer join USER_FOLLOWING on ... and FOO = [value] ...}
     * <pre>
     * cb.query().queryMemberStatus().<span style="color: #CC4747">on()</span>.setFoo...;
     * </pre>
     * @return The condition-query for OnClause query. (NotNull)
     * @throws IllegalConditionBeanOperationException When this condition-query is base query.
     */
    public UserFollowingCIQ on() {
        if (isBaseQuery()) { throw new IllegalConditionBeanOperationException("OnClause for local table is unavailable!"); }
        UserFollowingCIQ inlineQuery = inline(); inlineQuery.xsetOnClause(true); return inlineQuery;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    protected ConditionValue _userFollowingId;
    public ConditionValue xdfgetUserFollowingId()
    { if (_userFollowingId == null) { _userFollowingId = nCV(); }
      return _userFollowingId; }
    protected ConditionValue xgetCValueUserFollowingId() { return xdfgetUserFollowingId(); }

    /** 
     * Add order-by as ascend. <br>
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsUserFollowingCQ addOrderBy_UserFollowingId_Asc() { regOBA("USER_FOLLOWING_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return this. (NotNull)
     */
    public BsUserFollowingCQ addOrderBy_UserFollowingId_Desc() { regOBD("USER_FOLLOWING_ID"); return this; }

    protected ConditionValue _followerUserId;
    public ConditionValue xdfgetFollowerUserId()
    { if (_followerUserId == null) { _followerUserId = nCV(); }
      return _followerUserId; }
    protected ConditionValue xgetCValueFollowerUserId() { return xdfgetFollowerUserId(); }

    /** 
     * Add order-by as ascend. <br>
     * FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsUserFollowingCQ addOrderBy_FollowerUserId_Asc() { regOBA("FOLLOWER_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsUserFollowingCQ addOrderBy_FollowerUserId_Desc() { regOBD("FOLLOWER_USER_ID"); return this; }

    protected ConditionValue _followingUserId;
    public ConditionValue xdfgetFollowingUserId()
    { if (_followingUserId == null) { _followingUserId = nCV(); }
      return _followingUserId; }
    protected ConditionValue xgetCValueFollowingUserId() { return xdfgetFollowingUserId(); }

    /** 
     * Add order-by as ascend. <br>
     * FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsUserFollowingCQ addOrderBy_FollowingUserId_Asc() { regOBA("FOLLOWING_USER_ID"); return this; }

    /**
     * Add order-by as descend. <br>
     * FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @return this. (NotNull)
     */
    public BsUserFollowingCQ addOrderBy_FollowingUserId_Desc() { regOBD("FOLLOWING_USER_ID"); return this; }

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
    public BsUserFollowingCQ addSpecifiedDerivedOrderBy_Asc(String aliasName) { registerSpecifiedDerivedOrderBy_Asc(aliasName); return this; }

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
    public BsUserFollowingCQ addSpecifiedDerivedOrderBy_Desc(String aliasName) { registerSpecifiedDerivedOrderBy_Desc(aliasName); return this; }

    // ===================================================================================
    //                                                                         Union Query
    //                                                                         ===========
    public void reflectRelationOnUnionQuery(ConditionQuery bqs, ConditionQuery uqs) {
        UserFollowingCQ bq = (UserFollowingCQ)bqs;
        UserFollowingCQ uq = (UserFollowingCQ)uqs;
        if (bq.hasConditionQueryUserByFollowingUserId()) {
            uq.queryUserByFollowingUserId().reflectRelationOnUnionQuery(bq.queryUserByFollowingUserId(), uq.queryUserByFollowingUserId());
        }
        if (bq.hasConditionQueryUserByFollowerUserId()) {
            uq.queryUserByFollowerUserId().reflectRelationOnUnionQuery(bq.queryUserByFollowerUserId(), uq.queryUserByFollowerUserId());
        }
    }

    // ===================================================================================
    //                                                                       Foreign Query
    //                                                                       =============
    /**
     * Get the condition-query for relation table. <br>
     * USER by my FOLLOWING_USER_ID, named 'userByFollowingUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUserByFollowingUserId() {
        return xdfgetConditionQueryUserByFollowingUserId();
    }
    public UserCQ xdfgetConditionQueryUserByFollowingUserId() {
        String prop = "userByFollowingUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUserByFollowingUserId()); xsetupOuterJoinUserByFollowingUserId(); }
        return xgetQueRlMap(prop);
    }
    protected UserCQ xcreateQueryUserByFollowingUserId() {
        String nrp = xresolveNRP("USER_FOLLOWING", "userByFollowingUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "userByFollowingUserId", nrp);
    }
    protected void xsetupOuterJoinUserByFollowingUserId() { xregOutJo("userByFollowingUserId"); }
    public boolean hasConditionQueryUserByFollowingUserId() { return xhasQueRlMap("userByFollowingUserId"); }

    /**
     * Get the condition-query for relation table. <br>
     * USER by my FOLLOWER_USER_ID, named 'userByFollowerUserId'.
     * @return The instance of condition-query. (NotNull)
     */
    public UserCQ queryUserByFollowerUserId() {
        return xdfgetConditionQueryUserByFollowerUserId();
    }
    public UserCQ xdfgetConditionQueryUserByFollowerUserId() {
        String prop = "userByFollowerUserId";
        if (!xhasQueRlMap(prop)) { xregQueRl(prop, xcreateQueryUserByFollowerUserId()); xsetupOuterJoinUserByFollowerUserId(); }
        return xgetQueRlMap(prop);
    }
    protected UserCQ xcreateQueryUserByFollowerUserId() {
        String nrp = xresolveNRP("USER_FOLLOWING", "userByFollowerUserId"); String jan = xresolveJAN(nrp, xgetNNLvl());
        return xinitRelCQ(new UserCQ(this, xgetSqlClause(), jan, xgetNNLvl()), _baseCB, "userByFollowerUserId", nrp);
    }
    protected void xsetupOuterJoinUserByFollowerUserId() { xregOutJo("userByFollowerUserId"); }
    public boolean hasConditionQueryUserByFollowerUserId() { return xhasQueRlMap("userByFollowerUserId"); }

    protected Map<String, Object> xfindFixedConditionDynamicParameterMap(String property) {
        return null;
    }

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    public Map<String, UserFollowingCQ> xdfgetScalarCondition() { return xgetSQueMap("scalarCondition"); }
    public String keepScalarCondition(UserFollowingCQ sq) { return xkeepSQue("scalarCondition", sq); }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public Map<String, UserFollowingCQ> xdfgetSpecifyMyselfDerived() { return xgetSQueMap("specifyMyselfDerived"); }
    public String keepSpecifyMyselfDerived(UserFollowingCQ sq) { return xkeepSQue("specifyMyselfDerived", sq); }

    public Map<String, UserFollowingCQ> xdfgetQueryMyselfDerived() { return xgetSQueMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerived(UserFollowingCQ sq) { return xkeepSQue("queryMyselfDerived", sq); }
    public Map<String, Object> xdfgetQueryMyselfDerivedParameter() { return xgetSQuePmMap("queryMyselfDerived"); }
    public String keepQueryMyselfDerivedParameter(Object pm) { return xkeepSQuePm("queryMyselfDerived", pm); }

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    protected Map<String, UserFollowingCQ> _myselfExistsMap;
    public Map<String, UserFollowingCQ> xdfgetMyselfExists() { return xgetSQueMap("myselfExists"); }
    public String keepMyselfExists(UserFollowingCQ sq) { return xkeepSQue("myselfExists", sq); }

    // ===================================================================================
    //                                                                       MyselfInScope
    //                                                                       =============
    public Map<String, UserFollowingCQ> xdfgetMyselfInScope() { return xgetSQueMap("myselfInScope"); }
    public String keepMyselfInScope(UserFollowingCQ sq) { return xkeepSQue("myselfInScope", sq); }

    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xCB() { return UserFollowingCB.class.getName(); }
    protected String xCQ() { return UserFollowingCQ.class.getName(); }
    protected String xCHp() { return HpQDRFunction.class.getName(); }
    protected String xCOp() { return ConditionOption.class.getName(); }
    protected String xMap() { return Map.class.getName(); }
}
