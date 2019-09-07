package com.facades.startup;

import com.core.dao.UserDao;
import com.core.model.UserModel;

public class Main
{
    public static void main(String[] args)
    {
        final UserDao userDao = new UserDao();

        final UserModel user = userDao.findById(1L);

        System.out.println(user.getFirstName() + " " + user.getLastName());
    }
}
