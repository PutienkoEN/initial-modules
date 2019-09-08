package com.fun.facades.startup;

import com.fun.core.dao.UserDao;
import com.fun.core.models.UserModel;

public class Main
{
    public static void main(String[] args)
    {
        final UserDao userDao = new UserDao();

        final UserModel user = userDao.findById(1L);

        System.out.println(String.format("%s %s says hello!", user.getFirstName(), user.getLastName()));
    }
}
