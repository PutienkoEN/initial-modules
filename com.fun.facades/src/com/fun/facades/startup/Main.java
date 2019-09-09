package com.fun.facades.startup;

import com.fun.core.models.UserModel;
import com.fun.services.impl.DefaultUserService;

public class Main
{
    public static void main(String[] args)
    {
        final DefaultUserService userService = new DefaultUserService();
        final UserModel user = userService.getUserById(1L);

        System.out.println(String.format("%s says hello!", user.getFirstName()));
    }
}
