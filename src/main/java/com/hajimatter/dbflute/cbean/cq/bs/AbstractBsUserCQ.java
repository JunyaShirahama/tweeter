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
 * The abstract condition-query of USER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsUserCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsUserCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "USER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_Equal(Long userId) {
        doSetUserId_Equal(userId);
    }

    protected void doSetUserId_Equal(Long userId) {
        regUserId(CK_EQ, userId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_NotEqual(Long userId) {
        doSetUserId_NotEqual(userId);
    }

    protected void doSetUserId_NotEqual(Long userId) {
        regUserId(CK_NES, userId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterThan(Long userId) {
        regUserId(CK_GT, userId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessThan(Long userId) {
        regUserId(CK_LT, userId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_GreaterEqual(Long userId) {
        regUserId(CK_GE, userId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userId The value of userId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUserId_LessEqual(Long userId) {
        regUserId(CK_LE, userId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of range-of. (NotNull)
     */
    public void setUserId_RangeOf(Long minNumber, Long maxNumber, ConditionOptionCall<RangeOfOption> opLambda) {
        setUserId_RangeOf(minNumber, maxNumber, xcROOP(opLambda));
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of userId. (NullAllowed: if null, no from-condition)
     * @param maxNumber The max number of userId. (NullAllowed: if null, no to-condition)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    protected void setUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUserId(), "USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userIdList The collection of userId as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_InScope(Collection<Long> userIdList) {
        doSetUserId_InScope(userIdList);
    }

    protected void doSetUserId_InScope(Collection<Long> userIdList) {
        regINS(CK_INS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param userIdList The collection of userId as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserId_NotInScope(Collection<Long> userIdList) {
        doSetUserId_NotInScope(userIdList);
    }

    protected void doSetUserId_NotInScope(Collection<Long> userIdList) {
        regINS(CK_NINS, cTL(userIdList), xgetCValueUserId(), "USER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select USER_ID from TWEET where ...)} <br>
     * TWEET by USER_ID, named 'tweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTweet</span>(tweetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tweetCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TweetList for 'exists'. (NotNull)
     */
    public void existsTweet(SubQuery<TweetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TweetCB cb = new TweetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_TweetList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "tweetList");
    }
    public abstract String keepUserId_ExistsReferrer_TweetList(TweetCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select FOLLOWING_USER_ID from USER_FOLLOWING where ...)} <br>
     * USER_FOLLOWING by FOLLOWING_USER_ID, named 'userFollowingByFollowingUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsUserFollowingByFollowingUserId</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserFollowingByFollowingUserIdList for 'exists'. (NotNull)
     */
    public void existsUserFollowingByFollowingUserId(SubQuery<UserFollowingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_UserFollowingByFollowingUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "FOLLOWING_USER_ID", pp, "userFollowingByFollowingUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_UserFollowingByFollowingUserIdList(UserFollowingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select FOLLOWER_USER_ID from USER_FOLLOWING where ...)} <br>
     * USER_FOLLOWING by FOLLOWER_USER_ID, named 'userFollowingByFollowerUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsUserFollowingByFollowerUserId</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserFollowingByFollowerUserIdList for 'exists'. (NotNull)
     */
    public void existsUserFollowingByFollowerUserId(SubQuery<UserFollowingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_ExistsReferrer_UserFollowingByFollowerUserIdList(cb.query());
        registerExistsReferrer(cb.query(), "USER_ID", "FOLLOWER_USER_ID", pp, "userFollowingByFollowerUserIdList");
    }
    public abstract String keepUserId_ExistsReferrer_UserFollowingByFollowerUserIdList(UserFollowingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select USER_ID from TWEET where ...)} <br>
     * TWEET by USER_ID, named 'tweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTweet</span>(tweetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tweetCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_TweetList for 'not exists'. (NotNull)
     */
    public void notExistsTweet(SubQuery<TweetCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TweetCB cb = new TweetCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_TweetList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "USER_ID", pp, "tweetList");
    }
    public abstract String keepUserId_NotExistsReferrer_TweetList(TweetCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select FOLLOWING_USER_ID from USER_FOLLOWING where ...)} <br>
     * USER_FOLLOWING by FOLLOWING_USER_ID, named 'userFollowingByFollowingUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserFollowingByFollowingUserId</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_UserFollowingByFollowingUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsUserFollowingByFollowingUserId(SubQuery<UserFollowingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_UserFollowingByFollowingUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "FOLLOWING_USER_ID", pp, "userFollowingByFollowingUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_UserFollowingByFollowingUserIdList(UserFollowingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select FOLLOWER_USER_ID from USER_FOLLOWING where ...)} <br>
     * USER_FOLLOWING by FOLLOWER_USER_ID, named 'userFollowingByFollowerUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsUserFollowingByFollowerUserId</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of UserId_NotExistsReferrer_UserFollowingByFollowerUserIdList for 'not exists'. (NotNull)
     */
    public void notExistsUserFollowingByFollowerUserId(SubQuery<UserFollowingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepUserId_NotExistsReferrer_UserFollowingByFollowerUserIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "USER_ID", "FOLLOWER_USER_ID", pp, "userFollowingByFollowerUserIdList");
    }
    public abstract String keepUserId_NotExistsReferrer_UserFollowingByFollowerUserIdList(UserFollowingCQ sq);

    public void xsderiveTweetList(String fn, SubQuery<TweetCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TweetCB cb = new TweetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_TweetList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", pp, "tweetList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_TweetList(TweetCQ sq);

    public void xsderiveUserFollowingByFollowingUserIdList(String fn, SubQuery<UserFollowingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_UserFollowingByFollowingUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "FOLLOWING_USER_ID", pp, "userFollowingByFollowingUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_UserFollowingByFollowingUserIdList(UserFollowingCQ sq);

    public void xsderiveUserFollowingByFollowerUserIdList(String fn, SubQuery<UserFollowingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepUserId_SpecifyDerivedReferrer_UserFollowingByFollowerUserIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "USER_ID", "FOLLOWER_USER_ID", pp, "userFollowingByFollowerUserIdList", al, op);
    }
    public abstract String keepUserId_SpecifyDerivedReferrer_UserFollowingByFollowerUserIdList(UserFollowingCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from TWEET where ...)} <br>
     * TWEET by USER_ID, named 'tweetAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTweet()</span>.<span style="color: #CC4747">max</span>(tweetCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     tweetCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     tweetCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TweetCB> derivedTweet() {
        return xcreateQDRFunctionTweetList();
    }
    protected HpQDRFunction<TweetCB> xcreateQDRFunctionTweetList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTweetList(fn, sq, rd, vl, op));
    }
    public void xqderiveTweetList(String fn, SubQuery<TweetCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TweetCB cb = new TweetCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_TweetList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_TweetListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "USER_ID", sqpp, "tweetList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_TweetList(TweetCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_TweetListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from USER_FOLLOWING where ...)} <br>
     * USER_FOLLOWING by FOLLOWING_USER_ID, named 'userFollowingByFollowingUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedUserFollowingByFollowingUserId()</span>.<span style="color: #CC4747">max</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     followingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<UserFollowingCB> derivedUserFollowingByFollowingUserId() {
        return xcreateQDRFunctionUserFollowingByFollowingUserIdList();
    }
    protected HpQDRFunction<UserFollowingCB> xcreateQDRFunctionUserFollowingByFollowingUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveUserFollowingByFollowingUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveUserFollowingByFollowingUserIdList(String fn, SubQuery<UserFollowingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_UserFollowingByFollowingUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_UserFollowingByFollowingUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "FOLLOWING_USER_ID", sqpp, "userFollowingByFollowingUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_UserFollowingByFollowingUserIdList(UserFollowingCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_UserFollowingByFollowingUserIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from USER_FOLLOWING where ...)} <br>
     * USER_FOLLOWING by FOLLOWER_USER_ID, named 'userFollowingByFollowerUserIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedUserFollowingByFollowerUserId()</span>.<span style="color: #CC4747">max</span>(followingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     followingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     followingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<UserFollowingCB> derivedUserFollowingByFollowerUserId() {
        return xcreateQDRFunctionUserFollowingByFollowerUserIdList();
    }
    protected HpQDRFunction<UserFollowingCB> xcreateQDRFunctionUserFollowingByFollowerUserIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveUserFollowingByFollowerUserIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveUserFollowingByFollowerUserIdList(String fn, SubQuery<UserFollowingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserFollowingCB cb = new UserFollowingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepUserId_QueryDerivedReferrer_UserFollowingByFollowerUserIdList(cb.query()); String prpp = keepUserId_QueryDerivedReferrer_UserFollowingByFollowerUserIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "USER_ID", "FOLLOWER_USER_ID", sqpp, "userFollowingByFollowerUserIdList", rd, vl, prpp, op);
    }
    public abstract String keepUserId_QueryDerivedReferrer_UserFollowingByFollowerUserIdList(UserFollowingCQ sq);
    public abstract String keepUserId_QueryDerivedReferrer_UserFollowingByFollowerUserIdListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setUserId_IsNull() { regUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setUserId_IsNotNull() { regUserId(CK_ISNN, DOBJ); }

    protected void regUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserId(), "USER_ID"); }
    protected abstract ConditionValue xgetCValueUserId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param userName The value of userName as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_Equal(String userName) {
        doSetUserName_Equal(fRES(userName));
    }

    protected void doSetUserName_Equal(String userName) {
        regUserName(CK_EQ, userName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param userName The value of userName as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_NotEqual(String userName) {
        doSetUserName_NotEqual(fRES(userName));
    }

    protected void doSetUserName_NotEqual(String userName) {
        regUserName(CK_NES, userName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param userName The value of userName as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_GreaterThan(String userName) {
        regUserName(CK_GT, fRES(userName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param userName The value of userName as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_LessThan(String userName) {
        regUserName(CK_LT, fRES(userName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param userName The value of userName as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_GreaterEqual(String userName) {
        regUserName(CK_GE, fRES(userName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param userName The value of userName as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_LessEqual(String userName) {
        regUserName(CK_LE, fRES(userName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param userNameList The collection of userName as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_InScope(Collection<String> userNameList) {
        doSetUserName_InScope(userNameList);
    }

    protected void doSetUserName_InScope(Collection<String> userNameList) {
        regINS(CK_INS, cTL(userNameList), xgetCValueUserName(), "USER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param userNameList The collection of userName as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setUserName_NotInScope(Collection<String> userNameList) {
        doSetUserName_NotInScope(userNameList);
    }

    protected void doSetUserName_NotInScope(Collection<String> userNameList) {
        regINS(CK_NINS, cTL(userNameList), xgetCValueUserName(), "USER_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUserName_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param userName The value of userName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserName_LikeSearch(String userName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserName_LikeSearch(userName, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * <pre>e.g. setUserName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userName The value of userName as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setUserName_LikeSearch(String userName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userName), xgetCValueUserName(), "USER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param userName The value of userName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setUserName_NotLikeSearch(String userName, ConditionOptionCall<LikeSearchOption> opLambda) {
        setUserName_NotLikeSearch(userName, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_NAME: {UQ, NotNull, VARCHAR(10)}
     * @param userName The value of userName as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setUserName_NotLikeSearch(String userName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userName), xgetCValueUserName(), "USER_NAME", likeSearchOption);
    }

    protected void regUserName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserName(), "USER_NAME"); }
    protected abstract ConditionValue xgetCValueUserName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(20)}
     * @param password The value of password as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_Equal(String password) {
        doSetPassword_Equal(fRES(password));
    }

    protected void doSetPassword_Equal(String password) {
        regPassword(CK_EQ, password);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(20)}
     * @param password The value of password as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_NotEqual(String password) {
        doSetPassword_NotEqual(fRES(password));
    }

    protected void doSetPassword_NotEqual(String password) {
        regPassword(CK_NES, password);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(20)}
     * @param password The value of password as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_GreaterThan(String password) {
        regPassword(CK_GT, fRES(password));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(20)}
     * @param password The value of password as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_LessThan(String password) {
        regPassword(CK_LT, fRES(password));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(20)}
     * @param password The value of password as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_GreaterEqual(String password) {
        regPassword(CK_GE, fRES(password));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(20)}
     * @param password The value of password as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_LessEqual(String password) {
        regPassword(CK_LE, fRES(password));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(20)}
     * @param passwordList The collection of password as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_InScope(Collection<String> passwordList) {
        doSetPassword_InScope(passwordList);
    }

    protected void doSetPassword_InScope(Collection<String> passwordList) {
        regINS(CK_INS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(20)}
     * @param passwordList The collection of password as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setPassword_NotInScope(Collection<String> passwordList) {
        doSetPassword_NotInScope(passwordList);
    }

    protected void doSetPassword_NotInScope(Collection<String> passwordList) {
        regINS(CK_NINS, cTL(passwordList), xgetCValuePassword(), "PASSWORD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param password The value of password as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_LikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_LikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setPassword_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param password The value of password as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setPassword_LikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(20)}
     * @param password The value of password as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setPassword_NotLikeSearch(String password, ConditionOptionCall<LikeSearchOption> opLambda) {
        setPassword_NotLikeSearch(password, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PASSWORD: {NotNull, VARCHAR(20)}
     * @param password The value of password as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setPassword_NotLikeSearch(String password, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(password), xgetCValuePassword(), "PASSWORD", likeSearchOption);
    }

    protected void regPassword(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePassword(), "PASSWORD"); }
    protected abstract ConditionValue xgetCValuePassword();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_ARTIST: {NotNull, VARCHAR(20)}
     * @param favoriteArtist The value of favoriteArtist as equal. (NullAllowed: if null (or empty), no condition)
     */
    public void setFavoriteArtist_Equal(String favoriteArtist) {
        doSetFavoriteArtist_Equal(fRES(favoriteArtist));
    }

    protected void doSetFavoriteArtist_Equal(String favoriteArtist) {
        regFavoriteArtist(CK_EQ, favoriteArtist);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_ARTIST: {NotNull, VARCHAR(20)}
     * @param favoriteArtist The value of favoriteArtist as notEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFavoriteArtist_NotEqual(String favoriteArtist) {
        doSetFavoriteArtist_NotEqual(fRES(favoriteArtist));
    }

    protected void doSetFavoriteArtist_NotEqual(String favoriteArtist) {
        regFavoriteArtist(CK_NES, favoriteArtist);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_ARTIST: {NotNull, VARCHAR(20)}
     * @param favoriteArtist The value of favoriteArtist as greaterThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setFavoriteArtist_GreaterThan(String favoriteArtist) {
        regFavoriteArtist(CK_GT, fRES(favoriteArtist));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_ARTIST: {NotNull, VARCHAR(20)}
     * @param favoriteArtist The value of favoriteArtist as lessThan. (NullAllowed: if null (or empty), no condition)
     */
    public void setFavoriteArtist_LessThan(String favoriteArtist) {
        regFavoriteArtist(CK_LT, fRES(favoriteArtist));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_ARTIST: {NotNull, VARCHAR(20)}
     * @param favoriteArtist The value of favoriteArtist as greaterEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFavoriteArtist_GreaterEqual(String favoriteArtist) {
        regFavoriteArtist(CK_GE, fRES(favoriteArtist));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAVORITE_ARTIST: {NotNull, VARCHAR(20)}
     * @param favoriteArtist The value of favoriteArtist as lessEqual. (NullAllowed: if null (or empty), no condition)
     */
    public void setFavoriteArtist_LessEqual(String favoriteArtist) {
        regFavoriteArtist(CK_LE, fRES(favoriteArtist));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAVORITE_ARTIST: {NotNull, VARCHAR(20)}
     * @param favoriteArtistList The collection of favoriteArtist as inScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFavoriteArtist_InScope(Collection<String> favoriteArtistList) {
        doSetFavoriteArtist_InScope(favoriteArtistList);
    }

    protected void doSetFavoriteArtist_InScope(Collection<String> favoriteArtistList) {
        regINS(CK_INS, cTL(favoriteArtistList), xgetCValueFavoriteArtist(), "FAVORITE_ARTIST");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAVORITE_ARTIST: {NotNull, VARCHAR(20)}
     * @param favoriteArtistList The collection of favoriteArtist as notInScope. (NullAllowed: if null (or empty), no condition)
     */
    public void setFavoriteArtist_NotInScope(Collection<String> favoriteArtistList) {
        doSetFavoriteArtist_NotInScope(favoriteArtistList);
    }

    protected void doSetFavoriteArtist_NotInScope(Collection<String> favoriteArtistList) {
        regINS(CK_NINS, cTL(favoriteArtistList), xgetCValueFavoriteArtist(), "FAVORITE_ARTIST");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAVORITE_ARTIST: {NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setFavoriteArtist_LikeSearch("xxx", op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">likeContain()</span>);</pre>
     * @param favoriteArtist The value of favoriteArtist as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFavoriteArtist_LikeSearch(String favoriteArtist, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFavoriteArtist_LikeSearch(favoriteArtist, xcLSOP(opLambda));
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAVORITE_ARTIST: {NotNull, VARCHAR(20)} <br>
     * <pre>e.g. setFavoriteArtist_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param favoriteArtist The value of favoriteArtist as likeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    protected void setFavoriteArtist_LikeSearch(String favoriteArtist, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(favoriteArtist), xgetCValueFavoriteArtist(), "FAVORITE_ARTIST", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAVORITE_ARTIST: {NotNull, VARCHAR(20)}
     * @param favoriteArtist The value of favoriteArtist as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param opLambda The callback for option of like-search. (NotNull)
     */
    public void setFavoriteArtist_NotLikeSearch(String favoriteArtist, ConditionOptionCall<LikeSearchOption> opLambda) {
        setFavoriteArtist_NotLikeSearch(favoriteArtist, xcLSOP(opLambda));
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAVORITE_ARTIST: {NotNull, VARCHAR(20)}
     * @param favoriteArtist The value of favoriteArtist as notLikeSearch. (NullAllowed: if null (or empty), no condition)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    protected void setFavoriteArtist_NotLikeSearch(String favoriteArtist, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(favoriteArtist), xgetCValueFavoriteArtist(), "FAVORITE_ARTIST", likeSearchOption);
    }

    protected void regFavoriteArtist(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFavoriteArtist(), "FAVORITE_ARTIST"); }
    protected abstract ConditionValue xgetCValueFavoriteArtist();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param registerDatetime The value of registerDatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_Equal(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_EQ,  registerDatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param registerDatetime The value of registerDatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GT,  registerDatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param registerDatetime The value of registerDatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessThan(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LT,  registerDatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param registerDatetime The value of registerDatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_GreaterEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_GE,  registerDatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * @param registerDatetime The value of registerDatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRegisterDatetime_LessEqual(java.time.LocalDateTime registerDatetime) {
        regRegisterDatetime(CK_LE, registerDatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, op <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> op.<span style="color: #CC4747">compareAsDate()</span>);</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no to-condition)
     * @param opLambda The callback for option of from-to. (NotNull)
     */
    public void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, ConditionOptionCall<FromToOption> opLambda) {
        setRegisterDatetime_FromTo(fromDatetime, toDatetime, xcFTOP(opLambda));
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REGISTER_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]}
     * <pre>e.g. setRegisterDatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no from-condition)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of registerDatetime. (NullAllowed: if null, no to-condition)
     * @param fromToOption The option of from-to. (NotNull)
     */
    protected void setRegisterDatetime_FromTo(java.time.LocalDateTime fromDatetime, java.time.LocalDateTime toDatetime, FromToOption fromToOption) {
        String nm = "REGISTER_DATETIME"; FromToOption op = fromToOption;
        regFTQ(xfFTHD(fromDatetime, nm, op), xfFTHD(toDatetime, nm, op), xgetCValueRegisterDatetime(), nm, op);
    }

    protected void regRegisterDatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRegisterDatetime(), "REGISTER_DATETIME"); }
    protected abstract ConditionValue xgetCValueRegisterDatetime();

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
    public HpSLCFunction<UserCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, UserCB.class);
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
    public HpSLCFunction<UserCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, UserCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;UserCB&gt;() {
     *     public void query(UserCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<UserCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, UserCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        UserCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(UserCQ sq);

    protected UserCB xcreateScalarConditionCB() {
        UserCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected UserCB xcreateScalarConditionPartitionByCB() {
        UserCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<UserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserCB cb = new UserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "USER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(UserCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<UserCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(UserCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        UserCB cb = new UserCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "USER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(UserCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<UserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        UserCB cb = new UserCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(UserCQ sq);

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
    protected UserCB newMyCB() {
        return new UserCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return UserCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
