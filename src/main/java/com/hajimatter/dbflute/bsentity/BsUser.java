package com.hajimatter.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.hajimatter.dbflute.allcommon.DBMetaInstanceHandler;
import com.hajimatter.dbflute.exentity.*;

/**
 * The entity of USER as TABLE. <br>
 * <pre>
 * [primary-key]
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
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long userId = entity.getUserId();
 * String userName = entity.getUserName();
 * String password = entity.getPassword();
 * String favoriteArtist = entity.getFavoriteArtist();
 * java.time.LocalDateTime registerDatetime = entity.getRegisterDatetime();
 * entity.setUserId(userId);
 * entity.setUserName(userName);
 * entity.setPassword(password);
 * entity.setFavoriteArtist(favoriteArtist);
 * entity.setRegisterDatetime(registerDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUser extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** USER_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _userId;

    /** USER_NAME: {UQ, NotNull, VARCHAR(10)} */
    protected String _userName;

    /** PASSWORD: {NotNull, VARCHAR(20)} */
    protected String _password;

    /** FAVORITE_ARTIST: {NotNull, VARCHAR(20)} */
    protected String _favoriteArtist;

    /** REGISTER_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime _registerDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "USER";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param userName : UQ, NotNull, VARCHAR(10). (NotNull)
     */
    public void uniqueBy(String userName) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("userName");
        setUserName(userName);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    /** TWEET by USER_ID, named 'tweetList'. */
    protected List<Tweet> _tweetList;

    /**
     * [get] TWEET by USER_ID, named 'tweetList'.
     * @return The entity list of referrer property 'tweetList'. (NotNull: even if no loading, returns empty list)
     */
    public List<Tweet> getTweetList() {
        if (_tweetList == null) { _tweetList = newReferrerList(); }
        return _tweetList;
    }

    /**
     * [set] TWEET by USER_ID, named 'tweetList'.
     * @param tweetList The entity list of referrer property 'tweetList'. (NullAllowed)
     */
    public void setTweetList(List<Tweet> tweetList) {
        _tweetList = tweetList;
    }

    /** USER_FOLLOWING by FOLLOWING_USER_ID, named 'userFollowingByFollowingUserIdList'. */
    protected List<UserFollowing> _userFollowingByFollowingUserIdList;

    /**
     * [get] USER_FOLLOWING by FOLLOWING_USER_ID, named 'userFollowingByFollowingUserIdList'.
     * @return The entity list of referrer property 'userFollowingByFollowingUserIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<UserFollowing> getUserFollowingByFollowingUserIdList() {
        if (_userFollowingByFollowingUserIdList == null) { _userFollowingByFollowingUserIdList = newReferrerList(); }
        return _userFollowingByFollowingUserIdList;
    }

    /**
     * [set] USER_FOLLOWING by FOLLOWING_USER_ID, named 'userFollowingByFollowingUserIdList'.
     * @param userFollowingByFollowingUserIdList The entity list of referrer property 'userFollowingByFollowingUserIdList'. (NullAllowed)
     */
    public void setUserFollowingByFollowingUserIdList(List<UserFollowing> userFollowingByFollowingUserIdList) {
        _userFollowingByFollowingUserIdList = userFollowingByFollowingUserIdList;
    }

    /** USER_FOLLOWING by FOLLOWER_USER_ID, named 'userFollowingByFollowerUserIdList'. */
    protected List<UserFollowing> _userFollowingByFollowerUserIdList;

    /**
     * [get] USER_FOLLOWING by FOLLOWER_USER_ID, named 'userFollowingByFollowerUserIdList'.
     * @return The entity list of referrer property 'userFollowingByFollowerUserIdList'. (NotNull: even if no loading, returns empty list)
     */
    public List<UserFollowing> getUserFollowingByFollowerUserIdList() {
        if (_userFollowingByFollowerUserIdList == null) { _userFollowingByFollowerUserIdList = newReferrerList(); }
        return _userFollowingByFollowerUserIdList;
    }

    /**
     * [set] USER_FOLLOWING by FOLLOWER_USER_ID, named 'userFollowingByFollowerUserIdList'.
     * @param userFollowingByFollowerUserIdList The entity list of referrer property 'userFollowingByFollowerUserIdList'. (NullAllowed)
     */
    public void setUserFollowingByFollowerUserIdList(List<UserFollowing> userFollowingByFollowerUserIdList) {
        _userFollowingByFollowerUserIdList = userFollowingByFollowerUserIdList;
    }

    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUser) {
            BsUser other = (BsUser)obj;
            if (!xSV(_userId, other._userId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_tweetList != null) { for (Tweet et : _tweetList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "tweetList")); } } }
        if (_userFollowingByFollowingUserIdList != null) { for (UserFollowing et : _userFollowingByFollowingUserIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userFollowingByFollowingUserIdList")); } } }
        if (_userFollowingByFollowerUserIdList != null) { for (UserFollowing et : _userFollowingByFollowerUserIdList)
        { if (et != null) { sb.append(li).append(xbRDS(et, "userFollowingByFollowerUserIdList")); } } }
        return sb.toString();
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_userName));
        sb.append(dm).append(xfND(_password));
        sb.append(dm).append(xfND(_favoriteArtist));
        sb.append(dm).append(xfND(_registerDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_tweetList != null && !_tweetList.isEmpty())
        { sb.append(dm).append("tweetList"); }
        if (_userFollowingByFollowingUserIdList != null && !_userFollowingByFollowingUserIdList.isEmpty())
        { sb.append(dm).append("userFollowingByFollowingUserIdList"); }
        if (_userFollowingByFollowerUserIdList != null && !_userFollowingByFollowerUserIdList.isEmpty())
        { sb.append(dm).append("userFollowingByFollowerUserIdList"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public User clone() {
        return (User)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] USER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] USER_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * @return The value of the column 'USER_NAME'. (basically NotNull if selected: for the constraint)
     */
    public String getUserName() {
        checkSpecifiedProperty("userName");
        return _userName;
    }

    /**
     * [set] USER_NAME: {UQ, NotNull, VARCHAR(10)} <br>
     * @param userName The value of the column 'USER_NAME'. (basically NotNull if update: for the constraint)
     */
    public void setUserName(String userName) {
        registerModifiedProperty("userName");
        _userName = userName;
    }

    /**
     * [get] PASSWORD: {NotNull, VARCHAR(20)} <br>
     * @return The value of the column 'PASSWORD'. (basically NotNull if selected: for the constraint)
     */
    public String getPassword() {
        checkSpecifiedProperty("password");
        return _password;
    }

    /**
     * [set] PASSWORD: {NotNull, VARCHAR(20)} <br>
     * @param password The value of the column 'PASSWORD'. (basically NotNull if update: for the constraint)
     */
    public void setPassword(String password) {
        registerModifiedProperty("password");
        _password = password;
    }

    /**
     * [get] FAVORITE_ARTIST: {NotNull, VARCHAR(20)} <br>
     * @return The value of the column 'FAVORITE_ARTIST'. (basically NotNull if selected: for the constraint)
     */
    public String getFavoriteArtist() {
        checkSpecifiedProperty("favoriteArtist");
        return _favoriteArtist;
    }

    /**
     * [set] FAVORITE_ARTIST: {NotNull, VARCHAR(20)} <br>
     * @param favoriteArtist The value of the column 'FAVORITE_ARTIST'. (basically NotNull if update: for the constraint)
     */
    public void setFavoriteArtist(String favoriteArtist) {
        registerModifiedProperty("favoriteArtist");
        _favoriteArtist = favoriteArtist;
    }

    /**
     * [get] REGISTER_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * @return The value of the column 'REGISTER_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getRegisterDatetime() {
        checkSpecifiedProperty("registerDatetime");
        return _registerDatetime;
    }

    /**
     * [set] REGISTER_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * @param registerDatetime The value of the column 'REGISTER_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setRegisterDatetime(java.time.LocalDateTime registerDatetime) {
        registerModifiedProperty("registerDatetime");
        _registerDatetime = registerDatetime;
    }
}
