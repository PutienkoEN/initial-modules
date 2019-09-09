package com.fun.services.api;

import com.fun.models.UserModel;

public interface UserService
{
    UserModel getUserById(long userId);
}
