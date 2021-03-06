package com.hewking.develop.db.table;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.hewking.develop.db.table.HomePageDataTable;
import com.hewking.develop.db.table.MessageTable;

import com.hewking.develop.db.table.HomePageDataTableDao;
import com.hewking.develop.db.table.MessageTableDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig homePageDataTableDaoConfig;
    private final DaoConfig messageTableDaoConfig;

    private final HomePageDataTableDao homePageDataTableDao;
    private final MessageTableDao messageTableDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        homePageDataTableDaoConfig = daoConfigMap.get(HomePageDataTableDao.class).clone();
        homePageDataTableDaoConfig.initIdentityScope(type);

        messageTableDaoConfig = daoConfigMap.get(MessageTableDao.class).clone();
        messageTableDaoConfig.initIdentityScope(type);

        homePageDataTableDao = new HomePageDataTableDao(homePageDataTableDaoConfig, this);
        messageTableDao = new MessageTableDao(messageTableDaoConfig, this);

        registerDao(HomePageDataTable.class, homePageDataTableDao);
        registerDao(MessageTable.class, messageTableDao);
    }
    
    public void clear() {
        homePageDataTableDaoConfig.clearIdentityScope();
        messageTableDaoConfig.clearIdentityScope();
    }

    public HomePageDataTableDao getHomePageDataTableDao() {
        return homePageDataTableDao;
    }

    public MessageTableDao getMessageTableDao() {
        return messageTableDao;
    }

}
