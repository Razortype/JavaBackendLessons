package com.company.business.abstracts;

import com.company.entities.concretes.User;

public interface UserService {

    void addAllData();
    void addUser(User user);
    void removeUser(User user);
    void updateUser(User oldUser, User newUser);
}
