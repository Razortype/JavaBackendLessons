package com.company.dataAccess.concretes;

import com.company.dataAccess.abstracts.UsersDataDao;
import com.company.entities.concretes.User;

import java.util.ArrayList;

public class PostgreUsersData implements UsersDataDao {

    @Override
    public ArrayList<User> getAll() {
        return null;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public boolean checkUserValidation(String email, String password) {

        boolean tempResult = true;
        return tempResult;

    }
}
