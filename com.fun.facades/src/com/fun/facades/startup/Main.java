package com.fun.facades.startup;

import com.fun.core.model.UserModel;
import com.fun.services.UserService;

public class Main
{
    public static void main(String[] args)
    {
        UserService userService = new UserService();
        final UserModel user = userService.getById(1L);
        System.out.println(String.format("%s %s says hello!", user.getFirstName(), user.getLastName()));
    }
}
