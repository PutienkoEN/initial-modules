package com.fun.facades.startup;

import java.util.NoSuchElementException;
import java.util.ServiceLoader;

import com.fun.models.UserModel;
import com.fun.services.UserService;

public class Main
{
    public static void main(String[] args)
    {
        final UserService userService = getUserService();
        final UserModel user = userService.getUserById(1L);

        System.out.println(String.format("%s says hello!", user.getFirstName()));
    }

    private static UserService getUserService()
    {
        final ServiceLoader<UserService> services = ServiceLoader.load(UserService.class);
        final UserService userService = services
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("User service not found!"));

        return userService;
    }

}
