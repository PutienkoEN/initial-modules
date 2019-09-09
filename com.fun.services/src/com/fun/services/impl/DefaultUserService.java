package com.fun.services.impl;

import com.fun.core.dao.UserDao;
import com.fun.models.UserModel;
import com.fun.services.UserService;

public class DefaultUserService implements UserService
{
    public UserModel getUserById(long userId)
    {
        final UserDao userDao = new UserDao();
        final UserModel user = userDao.findById(userId);

        return user;
    }
}
