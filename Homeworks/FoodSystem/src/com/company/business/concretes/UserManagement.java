package com.company.business.concretes;

import com.company.business.abstracts.UserService;
import com.company.entities.concretes.User;

import java.util.ArrayList;

public class UserManagement implements UserService {

    ArrayList<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void removeUser(User user) {
        users.remove(user);
    }

    @Override
    public void updateUser(User oldUser, User newUser) {
        users.set(users.indexOf(oldUser), newUser);
    }

}
