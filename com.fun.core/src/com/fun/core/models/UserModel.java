package com.fun.core.models;

public class UserModel
{
    private Long id;
    private String firstName;
    private String lastName;

    public static UserModel from(final Long id, final String firstName, final String lastName)
    {
        final UserModel userModel = new UserModel();

        userModel.id = id;
        userModel.firstName = firstName;
        userModel.lastName = lastName;

        return userModel;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(final Long id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(final String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(final String lastName)
    {
        this.lastName = lastName;
    }

}
