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
 * The entity of TWEET as TABLE. <br>
 * <pre>
 * [primary-key]
 *     TWEET_ID
 * 
 * [column]
 *     TWEET_ID, USER_ID, CONTENTS, TWEET_DATETIME
 * 
 * [sequence]
 *     
 * 
 * [identity]
 *     TWEET_ID
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
 *     user
 * 
 * [referrer property]
 *     
 * 
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * Long tweetId = entity.getTweetId();
 * Long userId = entity.getUserId();
 * String contents = entity.getContents();
 * java.time.LocalDateTime tweetDatetime = entity.getTweetDatetime();
 * entity.setTweetId(tweetId);
 * entity.setUserId(userId);
 * entity.setContents(contents);
 * entity.setTweetDatetime(tweetDatetime);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTweet extends AbstractEntity implements DomainEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** TWEET_ID: {PK, ID, NotNull, BIGINT(19)} */
    protected Long _tweetId;

    /** USER_ID: {IX, NotNull, BIGINT(19), FK to USER} */
    protected Long _userId;

    /** CONTENTS: {NotNull, VARCHAR(140)} */
    protected String _contents;

    /** TWEET_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} */
    protected java.time.LocalDateTime _tweetDatetime;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "TWEET";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============
    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        if (_tweetId == null) { return false; }
        return true;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    /** USER by my USER_ID, named 'user'. */
    protected OptionalEntity<User> _user;

    /**
     * [get] USER by my USER_ID, named 'user'. <br>
     * Optional: alwaysPresent(), ifPresent().orElse(), get(), ...
     * @return The entity of foreign property 'user'. (NotNull, EmptyAllowed: when e.g. null FK column, no setupSelect)
     */
    public OptionalEntity<User> getUser() {
        if (_user == null) { _user = OptionalEntity.relationEmpty(this, "user"); }
        return _user;
    }

    /**
     * [set] USER by my USER_ID, named 'user'.
     * @param user The entity of foreign property 'user'. (NullAllowed)
     */
    public void setUser(OptionalEntity<User> user) {
        _user = user;
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
        if (obj instanceof BsTweet) {
            BsTweet other = (BsTweet)obj;
            if (!xSV(_tweetId, other._tweetId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _tweetId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        StringBuilder sb = new StringBuilder();
        if (_user != null && _user.isPresent())
        { sb.append(li).append(xbRDS(_user, "user")); }
        return sb.toString();
    }
    protected <ET extends Entity> String xbRDS(org.dbflute.optional.OptionalEntity<ET> et, String name) { // buildRelationDisplayString()
        return et.get().buildDisplayString(name, true, true);
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_tweetId));
        sb.append(dm).append(xfND(_userId));
        sb.append(dm).append(xfND(_contents));
        sb.append(dm).append(xfND(_tweetDatetime));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        StringBuilder sb = new StringBuilder();
        if (_user != null && _user.isPresent())
        { sb.append(dm).append("user"); }
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length()).insert(0, "(").append(")");
        }
        return sb.toString();
    }

    @Override
    public Tweet clone() {
        return (Tweet)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] TWEET_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @return The value of the column 'TWEET_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getTweetId() {
        checkSpecifiedProperty("tweetId");
        return _tweetId;
    }

    /**
     * [set] TWEET_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * @param tweetId The value of the column 'TWEET_ID'. (basically NotNull if update: for the constraint)
     */
    public void setTweetId(Long tweetId) {
        registerModifiedProperty("tweetId");
        _tweetId = tweetId;
    }

    /**
     * [get] USER_ID: {IX, NotNull, BIGINT(19), FK to USER} <br>
     * @return The value of the column 'USER_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getUserId() {
        checkSpecifiedProperty("userId");
        return _userId;
    }

    /**
     * [set] USER_ID: {IX, NotNull, BIGINT(19), FK to USER} <br>
     * @param userId The value of the column 'USER_ID'. (basically NotNull if update: for the constraint)
     */
    public void setUserId(Long userId) {
        registerModifiedProperty("userId");
        _userId = userId;
    }

    /**
     * [get] CONTENTS: {NotNull, VARCHAR(140)} <br>
     * @return The value of the column 'CONTENTS'. (basically NotNull if selected: for the constraint)
     */
    public String getContents() {
        checkSpecifiedProperty("contents");
        return _contents;
    }

    /**
     * [set] CONTENTS: {NotNull, VARCHAR(140)} <br>
     * @param contents The value of the column 'CONTENTS'. (basically NotNull if update: for the constraint)
     */
    public void setContents(String contents) {
        registerModifiedProperty("contents");
        _contents = contents;
    }

    /**
     * [get] TWEET_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * @return The value of the column 'TWEET_DATETIME'. (basically NotNull if selected: for the constraint)
     */
    public java.time.LocalDateTime getTweetDatetime() {
        checkSpecifiedProperty("tweetDatetime");
        return _tweetDatetime;
    }

    /**
     * [set] TWEET_DATETIME: {NotNull, TIMESTAMP(19), default=[CURRENT_TIMESTAMP]} <br>
     * @param tweetDatetime The value of the column 'TWEET_DATETIME'. (basically NotNull if update: for the constraint)
     */
    public void setTweetDatetime(java.time.LocalDateTime tweetDatetime) {
        registerModifiedProperty("tweetDatetime");
        _tweetDatetime = tweetDatetime;
    }
}
