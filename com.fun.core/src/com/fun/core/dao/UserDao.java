package com.fun.core.dao;

import java.util.Map;

import com.fun.core.models.UserModel;

public class UserDao
{
    private static final Map<Long, UserModel> USERS = Map.of(
            1L, UserModel.from(1L, "Mickey", "Mouse"),
            2L, UserModel.from(2L, "Mario", "Mario"),
            3L, UserModel.from(3L, "Luigi", "Mario"));

    public UserModel findById(final Long id)
    {
        final UserModel user = USERS.get(id);
        return user;
    }
}
