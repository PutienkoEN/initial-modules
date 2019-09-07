package com.core.dao;

import java.util.Map;

import com.core.model.UserModel;

public class UserDao
{
    private static final Map<Long, UserModel> USERS = Map.of(
            1L, UserModel.from(1L, "Max", "Payne"),
            2L, UserModel.from(2L, "Mario", "Mario"),
            3L, UserModel.from(3L, "Luigi", "Mario"));

    public UserModel findById(final Long id)
    {
        final UserModel user = USERS.get(id);
        return user;
    }
}
