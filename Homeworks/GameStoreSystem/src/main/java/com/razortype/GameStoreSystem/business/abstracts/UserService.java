package com.razortype.GameStoreSystem.business.abstracts;

import com.razortype.GameStoreSystem.core.result.DataResult;
import com.razortype.GameStoreSystem.entities.concretes.User;
import com.razortype.GameStoreSystem.entities.concretes.UserInfo;

import java.util.List;

public interface UserService {

    DataResult<List<User>> getAll();
    UserInfo loginUser(String username, String password);
    User getUserById(String username);
    void add(User user);

}
