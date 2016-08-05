package com.hajimatter.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import com.hajimatter.dbflute.allcommon.*;
import com.hajimatter.dbflute.exentity.*;

/**
 * The DB meta of USER_FOLLOWING. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class UserFollowingDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final UserFollowingDbm _instance = new UserFollowingDbm();
    private UserFollowingDbm() {}
    public static UserFollowingDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((UserFollowing)et).getUserFollowingId(), (et, vl) -> ((UserFollowing)et).setUserFollowingId(ctl(vl)), "userFollowingId");
        setupEpg(_epgMap, et -> ((UserFollowing)et).getFollowerUserId(), (et, vl) -> ((UserFollowing)et).setFollowerUserId(ctl(vl)), "followerUserId");
        setupEpg(_epgMap, et -> ((UserFollowing)et).getFollowingUserId(), (et, vl) -> ((UserFollowing)et).setFollowingUserId(ctl(vl)), "followingUserId");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((UserFollowing)et).getUserByFollowingUserId(), (et, vl) -> ((UserFollowing)et).setUserByFollowingUserId((OptionalEntity<User>)vl), "userByFollowingUserId");
        setupEfpg(_efpgMap, et -> ((UserFollowing)et).getUserByFollowerUserId(), (et, vl) -> ((UserFollowing)et).setUserByFollowerUserId((OptionalEntity<User>)vl), "userByFollowerUserId");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "USER_FOLLOWING";
    protected final String _tableDispName = "USER_FOLLOWING";
    protected final String _tablePropertyName = "userFollowing";
    protected final TableSqlName _tableSqlName = new TableSqlName("USER_FOLLOWING", _tableDbName);
    { _tableSqlName.xacceptFilter(DBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserFollowingId = cci("USER_FOLLOWING_ID", "USER_FOLLOWING_ID", null, null, Long.class, "userFollowingId", null, true, true, true, "BIGINT", 19, 0, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFollowerUserId = cci("FOLLOWER_USER_ID", "FOLLOWER_USER_ID", null, null, Long.class, "followerUserId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "userByFollowerUserId", null, null, false);
    protected final ColumnInfo _columnFollowingUserId = cci("FOLLOWING_USER_ID", "FOLLOWING_USER_ID", null, null, Long.class, "followingUserId", null, false, false, true, "BIGINT", 19, 0, null, false, null, null, "userByFollowingUserId", null, null, false);

    /**
     * USER_FOLLOWING_ID: {PK, ID, NotNull, BIGINT(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserFollowingId() { return _columnUserFollowingId; }
    /**
     * FOLLOWER_USER_ID: {UQ+, NotNull, BIGINT(19), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFollowerUserId() { return _columnFollowerUserId; }
    /**
     * FOLLOWING_USER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to USER}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFollowingUserId() { return _columnFollowingUserId; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnUserFollowingId());
        ls.add(columnFollowerUserId());
        ls.add(columnFollowingUserId());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnUserFollowingId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnFollowerUserId());
        ls.add(columnFollowingUserId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * USER by my FOLLOWING_USER_ID, named 'userByFollowingUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserByFollowingUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFollowingUserId(), UserDbm.getInstance().columnUserId());
        return cfi("user_following_ibfk_2", "userByFollowingUserId", this, UserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userFollowingByFollowingUserIdList", false);
    }
    /**
     * USER by my FOLLOWER_USER_ID, named 'userByFollowerUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserByFollowerUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFollowerUserId(), UserDbm.getInstance().columnUserId());
        return cfi("user_following_ibfk_1", "userByFollowerUserId", this, UserDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userFollowingByFollowerUserIdList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "com.hajimatter.dbflute.exentity.UserFollowing"; }
    public String getConditionBeanTypeName() { return "com.hajimatter.dbflute.cbean.UserFollowingCB"; }
    public String getBehaviorTypeName() { return "com.hajimatter.dbflute.exbhv.UserFollowingBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<UserFollowing> getEntityType() { return UserFollowing.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public UserFollowing newEntity() { return new UserFollowing(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((UserFollowing)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((UserFollowing)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
