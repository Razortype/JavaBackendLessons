package com.razortype.GameStoreSystem.business.abstracts;

import com.razortype.GameStoreSystem.entities.concretes.User;
import com.razortype.GameStoreSystem.entities.concretes.UserInfo;

import java.util.List;

public interface UserService {

    List<User> getAll();
    UserInfo loginUser(String username, String password);

}
