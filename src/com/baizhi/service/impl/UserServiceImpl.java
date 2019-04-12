package com.baizhi.service.impl;

import com.baizhi.dao.UserDao;
import com.baizhi.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.insert();
    }
}
