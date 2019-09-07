package com.fun.services;

import com.fun.core.dao.UserDao;
import com.fun.core.model.UserModel;

public class UserService
{
    public UserModel getById(Long id)
    {
        final UserDao userDao = new UserDao();

        final UserModel user = userDao.findById(1L);

        return user;
    }
}
