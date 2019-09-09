package com.fun.services.impl;

import com.fun.core.dao.UserDao;
import com.fun.core.models.UserModel;

public class DefaultUserService
{
    public UserModel getUserById(long userId)
    {
        final UserDao userDao = new UserDao();
        final UserModel user = userDao.findById(userId);

        return user;
    }
}
