package com.hajimatter.dbflute.cbean.cq.bs;

import java.util.*;

import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.ckey.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.cvalue.ConditionValue;
import org.dbflute.cbean.ordering.*;
import org.dbflute.cbean.scoping.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.dbmeta.DBMetaProvider;
import com.hajimatter.dbflute.allcommon.*;
import com.hajimatter.dbflute.cbean.*;
import com.hajimatter.dbflute.cbean.cq.*;

/**
 * The abstract condition-query of USER_FOLLOWING.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUserFollowingCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUserFollowingCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        super(referrerQuery, sqlClause, aliasName, nestLevel);
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider xgetDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider();
    }

    public String asTableDbName() {
        return "USER_FOLLOWING";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userFollowingId The value of userFollowingId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserFollowingId_Equal(Long userFollowingId) {
        doSetUserFollowingId_Equal(userFollowingId);
    }

    protected void doSetUserFollowingId_Equal(Long userFollowingId) {
        regUserFollowingId(CK_EQ, userFollowingId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userFollowingId The value of userFollowingId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserFollowingId_NotEqual(Long userFollowingId) {
        doSetUserFollowingId_NotEqual(userFollowingId);
    }

    protected void doSetUserFollowingId_NotEqual(Long userFollowingId) {
        regUserFollowingId(CK_NES, userFollowingId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userFollowingId The value of userFollowingId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserFollowingId_GreaterThan(Long userFollowingId) {
        regUserFollowingId(CK_GT, userFollowingId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userFollowingId The value of userFollowingId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserFollowingId_LessThan(Long userFollowingId) {
        regUserFollowingId(CK_LT, userFollowingId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userFollowingId The value of userFollowingId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserFollowingId_GreaterEqual(Long userFollowingId) {
        regUserFollowingId(CK_GE, userFollowingId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userFollowingId The value of userFollowingId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserFollowingId_LessEqual(Long userFollowingId) {
        regUserFollowingId(CK_LE, userFollowingId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of userFollowingId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userFollowingId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserFollowingId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserFollowingId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of userFollowingId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userFollowingId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserFollowingId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserFollowingId(), "USER_FOLLOWING_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userFollowingIdList The collection of userFollowingId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserFollowingId_InScope(Collection<Long> userFollowingIdList) {
        doSetUserFollowingId_InScope(userFollowingIdList);
    }

    protected void doSetUserFollowingId_InScope(Collection<Long> userFollowingIdList) {
        regINS(CK_INS, cTL(userFollowingIdList), xgetCValueUserFollowingId(), "USER_FOLLOWING_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userFollowingIdList The collection of userFollowingId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserFollowingId_NotInScope(Collection<Long> userFollowingIdList) {
        doSetUserFollowingId_NotInScope(userFollowingIdList);
    }

    protected void doSetUserFollowingId_NotInScope(Collection<Long> userFollowingIdList) {
        regINS(CK_NINS, cTL(userFollowingIdList), xgetCValueUserFollowingId(), "USER_FOLLOWING_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setUserFollowingId_IsNull() { regUserFollowingId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setUserFollowingId_IsNotNull() { regUserFollowingId(CK_ISNN, DOBJ); }

    protected void regUserFollowingId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserFollowingId(), "USER_FOLLOWING_ID"); }
    protected abstract ConditionValue xgetCValueUserFollowingId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followerUserId The value of followerUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowerUserId_Equal(Long followerUserId) {
        doSetFollowerUserId_Equal(followerUserId);
    }

    protected void doSetFollowerUserId_Equal(Long followerUserId) {
        regFollowerUserId(CK_EQ, followerUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followerUserId The value of followerUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowerUserId_NotEqual(Long followerUserId) {
        doSetFollowerUserId_NotEqual(followerUserId);
    }

    protected void doSetFollowerUserId_NotEqual(Long followerUserId) {
        regFollowerUserId(CK_NES, followerUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followerUserId The value of followerUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowerUserId_GreaterThan(Long followerUserId) {
        regFollowerUserId(CK_GT, followerUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followerUserId The value of followerUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowerUserId_LessThan(Long followerUserId) {
        regFollowerUserId(CK_LT, followerUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followerUserId The value of followerUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowerUserId_GreaterEqual(Long followerUserId) {
        regFollowerUserId(CK_GE, followerUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followerUserId The value of followerUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowerUserId_LessEqual(Long followerUserId) {
        regFollowerUserId(CK_LE, followerUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of followerUserId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of followerUserId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFollowerUserId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFollowerUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of followerUserId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of followerUserId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFollowerUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFollowerUserId(), "FOLLOWER_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followerUserIdList The collection of followerUserId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFollowerUserId_InScope(Collection<Long> followerUserIdList) {
        doSetFollowerUserId_InScope(followerUserIdList);
    }

    protected void doSetFollowerUserId_InScope(Collection<Long> followerUserIdList) {
        regINS(CK_INS, cTL(followerUserIdList), xgetCValueFollowerUserId(), "FOLLOWER_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @param followerUserIdList The collection of followerUserId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFollowerUserId_NotInScope(Collection<Long> followerUserIdList) {
        doSetFollowerUserId_NotInScope(followerUserIdList);
    }

    protected void doSetFollowerUserId_NotInScope(Collection<Long> followerUserIdList) {
        regINS(CK_NINS, cTL(followerUserIdList), xgetCValueFollowerUserId(), "FOLLOWER_USER_ID");
    }

    protected void regFollowerUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFollowerUserId(), "FOLLOWER_USER_ID"); }
    protected abstract ConditionValue xgetCValueFollowerUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followingUserId The value of followingUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowingUserId_Equal(Long followingUserId) {
        doSetFollowingUserId_Equal(followingUserId);
    }

    protected void doSetFollowingUserId_Equal(Long followingUserId) {
        regFollowingUserId(CK_EQ, followingUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followingUserId The value of followingUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowingUserId_NotEqual(Long followingUserId) {
        doSetFollowingUserId_NotEqual(followingUserId);
    }

    protected void doSetFollowingUserId_NotEqual(Long followingUserId) {
        regFollowingUserId(CK_NES, followingUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followingUserId The value of followingUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowingUserId_GreaterThan(Long followingUserId) {
        regFollowingUserId(CK_GT, followingUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followingUserId The value of followingUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowingUserId_LessThan(Long followingUserId) {
        regFollowingUserId(CK_LT, followingUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followingUserId The value of followingUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowingUserId_GreaterEqual(Long followingUserId) {
        regFollowingUserId(CK_GE, followingUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followingUserId The value of followingUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFollowingUserId_LessEqual(Long followingUserId) {
        regFollowingUserId(CK_LE, followingUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of followingUserId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of followingUserId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setFollowingUserId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setFollowingUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param minNumber The min number of followingUserId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of followingUserId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setFollowingUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFollowingUserId(), "FOLLOWING_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followingUserIdList The collection of followingUserId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFollowingUserId_InScope(Collection<Long> followingUserIdList) {
        doSetFollowingUserId_InScope(followingUserIdList);
    }

    protected void doSetFollowingUserId_InScope(Collection<Long> followingUserIdList) {
        regINS(CK_INS, cTL(followingUserIdList), xgetCValueFollowingUserId(), "FOLLOWING_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @param followingUserIdList The collection of followingUserId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFollowingUserId_NotInScope(Collection<Long> followingUserIdList) {
        doSetFollowingUserId_NotInScope(followingUserIdList);
    }

    protected void doSetFollowingUserId_NotInScope(Collection<Long> followingUserIdList) {
        regINS(CK_NINS, cTL(followingUserIdList), xgetCValueFollowingUserId(), "FOLLOWING_USER_ID");
    }

    protected void regFollowingUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFollowingUserId(), "FOLLOWING_USER_ID"); }
    protected abstract ConditionValue xgetCValueFollowingUserId();

    // ===================================================================================
    //                                                                     ScalarCondition
    //                                                                     ===============
    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO = (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserFollowingCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, UserFollowingCB.class);
    }

    /**
     * Prepare ScalarCondition as equal. <br>
     * {where FOO &lt;&gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserFollowingCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, UserFollowingCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterThan. <br>
     * {where FOO &gt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserFollowingCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, UserFollowingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessThan. <br>
     * {where FOO &lt; (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserFollowingCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, UserFollowingCB.class);
    }

    /**
     * Prepare ScalarCondition as greaterEqual. <br>
     * {where FOO &gt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().scalar_Equal().<span style="color: #CC4747">avg</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">purchaseCB</span>.specify().<span style="color: #CC4747">columnPurchasePrice</span>(); <span style="color: #3F7E5E">// *Point!</span>
     *     <span style="color: #553000">purchaseCB</span>.query().setPaymentCompleteFlg_Equal_True();
     * });
     * </pre> 
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserFollowingCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, UserFollowingCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;UserFollowingCB&gt;() {
     *     public void query(UserFollowingCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserFollowingCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, UserFollowingCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        UserFollowingCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(UserFollowingCQ sq);

    protected UserFollowingCB xcreateScalarConditionCB() {
        UserFollowingCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected UserFollowingCB xcreateScalarConditionPartitionByCB() {
        UserFollowingCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<UserFollowingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "USER_FOLLOWING_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(UserFollowingCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<UserFollowingCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(UserFollowingCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "USER_FOLLOWING_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(UserFollowingCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<UserFollowingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(UserFollowingCQ sq);

    // ===================================================================================
    //                                                                        Manual Order
    //                                                                        ============
    /**
     * Order along manual ordering information.
     * <pre>
     * cb.query().addOrderBy_Birthdate_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when BIRTHDATE &gt;= '2000/01/01' then 0</span>
     * <span style="color: #3F7E5E">//     else 1</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     *
     * cb.query().addOrderBy_MemberStatusCode_Asc().<span style="color: #CC4747">withManualOrder</span>(<span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_GreaterEqual</span>(priorityDate); <span style="color: #3F7E5E">// e.g. 2000/01/01</span>
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Withdrawal);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Formalized);
     *     <span style="color: #553000">op</span>.<span style="color: #CC4747">when_Equal</span>(CDef.MemberStatus.Provisional);
     * });
     * <span style="color: #3F7E5E">// order by </span>
     * <span style="color: #3F7E5E">//   case</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'WDL' then 0</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'FML' then 1</span>
     * <span style="color: #3F7E5E">//     when MEMBER_STATUS_CODE = 'PRV' then 2</span>
     * <span style="color: #3F7E5E">//     else 3</span>
     * <span style="color: #3F7E5E">//   end asc, ...</span>
     * </pre>
     * <p>This function with Union is unsupported!</p>
     * <p>The order values are bound (treated as bind parameter).</p>
     * @param opLambda The callback for option of manual-order containing order values. (NotNull)
     */
    public void withManualOrder(ManualOrderOptionCall opLambda) { // is user public!
        xdoWithManualOrder(cMOO(opLambda));
    }

    // ===================================================================================
    //                                                                    Small Adjustment
    //                                                                    ================
    // ===================================================================================
    //                                                                       Very Internal
    //                                                                       =============
    protected UserFollowingCB newMyCB() {
        return new UserFollowingCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return UserFollowingCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
