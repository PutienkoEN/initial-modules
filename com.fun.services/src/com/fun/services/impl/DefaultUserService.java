package com.fun.services.impl;

import com.fun.core.dao.UserDao;
import com.fun.models.UserModel;
import com.fun.models.services.UserService;

public class DefaultUserService implements UserService
{
    public UserModel getById(long id)
    {
        final UserDao userDao = new UserDao();
        final UserModel user = userDao.findById(1L);

        return user;
    }
}
