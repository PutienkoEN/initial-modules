package com.fun.facades.startup;

import java.util.NoSuchElementException;
import java.util.ServiceLoader;

import com.fun.models.UserModel;
import com.fun.models.services.UserService;


public class Main
{
    public static void main(String[] args)
    {
        final UserService userService = getService();
        final UserModel user = userService.getById(1L);

        System.out.println(String.format("%s %s says hello!", user.getFirstName(), user.getLastName()));
    }

    private static UserService getService()
    {
        final ServiceLoader<UserService> loader = ServiceLoader.load(UserService.class);

        final UserService userService = loader
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("User service was not found"));

        return userService;
    }

}
