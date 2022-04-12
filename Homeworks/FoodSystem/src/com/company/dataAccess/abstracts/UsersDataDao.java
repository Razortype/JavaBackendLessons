package com.company.dataAccess.abstracts;

import com.company.entities.concretes.User;

import java.util.ArrayList;

public interface UsersDataDao {

    ArrayList<User> getAll();
    void add(User user);
    void delete(User user);
    User get(int id);

}
