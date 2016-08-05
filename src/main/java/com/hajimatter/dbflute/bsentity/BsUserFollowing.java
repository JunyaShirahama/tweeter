package com.hajimatter.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.Entity;
import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import org.dbflute.optional.OptionalEntity;
import com.hajimatter.dbflute.allcommon.DBMetaInstanceHandler;
import com.hajimatter.dbflute.exentity.*;

/**
 * The entity of USER_FOLLOWING as TABLE. <br>
 * <pre>
 * [primary-key]
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
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long userFollowingId = entity.getUserFollowingId();
 * Long followerUserId = entity.getFollowerUserId();
 * Long followingUserId = entity.getFollowingUserId();
 * entity.setUserFollowingId(userFollowingId);
 * entity.setFollowerUserId(followerUserId);
 * entity.setFollowingUserId(followingUserId);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsUserFollowing extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _userFollowingId;

    /** FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER} */
    protected Long _followerUserId;

    /** FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER} */
    protected Long _followingUserId;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "USER_FOLLOWING";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_userFollowingId == null) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param followerUserId : UQ+, NotNull, BIGINT(19), FK to USER. (NotNull)
     * @param followingUserId : +UQ, IX, NotNull, BIGINT(19), FK to USER. (NotNull)
     */
    public void uniqueBy(Long followerUserId, Long followingUserId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("followerUserId");
        __uniqueDrivenProperties.addPropertyName("followingUserId");
        setFollowerUserId(followerUserId);setFollowingUserId(followingUserId);
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** USER by my FOLLOWING_USER_ID, named 'userByFollowingUserId'. */
    protected OptionalEntity<User> _userByFollowingUserId;

    /**
     * [get] USER by my FOLLOWING_USER_ID, named 'userByFollowingUserId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userByFollowingUserId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUserByFollowingUserId() {
        if (_userByFollowingUserId == null) { _userByFollowingUserId = OptionalEntity.relationEmpty(this, "userByFollowingUserId"); }
        return _userByFollowingUserId;
    }

    /**
     * [set] USER by my FOLLOWING_USER_ID, named 'userByFollowingUserId'.
     * @param userByFollowingUserId The entity of foreign property 'userByFollowingUserId'. (NullAllowed)
     */
    public void setUserByFollowingUserId(OptionalEntity<User> userByFollowingUserId) {
        _userByFollowingUserId = userByFollowingUserId;
    }

    /** USER by my FOLLOWER_USER_ID, named 'userByFollowerUserId'. */
    protected OptionalEntity<User> _userByFollowerUserId;

    /**
     * [get] USER by my FOLLOWER_USER_ID, named 'userByFollowerUserId'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'userByFollowerUserId'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUserByFollowerUserId() {
        if (_userByFollowerUserId == null) { _userByFollowerUserId = OptionalEntity.relationEmpty(this, "userByFollowerUserId"); }
        return _userByFollowerUserId;
    }

    /**
     * [set] USER by my FOLLOWER_USER_ID, named 'userByFollowerUserId'.
     * @param userByFollowerUserId The entity of foreign property 'userByFollowerUserId'. (NullAllowed)
     */
    public void setUserByFollowerUserId(OptionalEntity<User> userByFollowerUserId) {
        _userByFollowerUserId = userByFollowerUserId;
    }

    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() {
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsUserFollowing) {
            BsUserFollowing other = (BsUserFollowing)obj;
            if (!xSV(_userFollowingId, other._userFollowingId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _userFollowingId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_userByFollowingUserId != null && _userByFollowingUserId.isPresent())
        { sb.append(li).append(xbRDS(_userByFollowingUserId, "userByFollowingUserId")); }
        if (_userByFollowerUserId != null && _userByFollowerUserId.isPresent())
        { sb.append(li).append(xbRDS(_userByFollowerUserId, "userByFollowerUserId")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_userFollowingId));
        sb.append(dm).append(xfND(_followerUserId));
        sb.append(dm).append(xfND(_followingUserId));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_userByFollowingUserId != null && _userByFollowingUserId.isPresent())
        { sb.append(dm).append("userByFollowingUserId"); }
        if (_userByFollowerUserId != null && _userByFollowerUserId.isPresent())
        { sb.append(dm).append("userByFollowerUserId"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public UserFollowing clone() {
        return (UserFollowing)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'USER_FOLLOWING_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserFollowingId() {
        checkSpecifiedProperty("userFollowingId");
        return _userFollowingId;
    }

    /**
     * [set] USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param userFollowingId The value of the column 'USER_FOLLOWING_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserFollowingId(Long userFollowingId) {
        registerModifiedProperty("userFollowingId");
        _userFollowingId = userFollowingId;
    }

    /**
     * [get] FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER} <br>
     * @return The value of the column 'FOLLOWER_USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFollowerUserId() {
        checkSpecifiedProperty("followerUserId");
        return _followerUserId;
    }

    /**
     * [set] FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER} <br>
     * @param followerUserId The value of the column 'FOLLOWER_USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFollowerUserId(Long followerUserId) {
        registerModifiedProperty("followerUserId");
        _followerUserId = followerUserId;
    }

    /**
     * [get] FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER} <br>
     * @return The value of the column 'FOLLOWING_USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getFollowingUserId() {
        checkSpecifiedProperty("followingUserId");
        return _followingUserId;
    }

    /**
     * [set] FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER} <br>
     * @param followingUserId The value of the column 'FOLLOWING_USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setFollowingUserId(Long followingUserId) {
        registerModifiedProperty("followingUserId");
        _followingUserId = followingUserId;
    }
}
