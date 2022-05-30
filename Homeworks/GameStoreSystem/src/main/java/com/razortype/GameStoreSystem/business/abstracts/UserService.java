package com.razortype.GameStoreSystem.business.abstracts;

import com.razortype.GameStoreSystem.core.result.DataResult;
import com.razortype.GameStoreSystem.core.result.Result;
import com.razortype.GameStoreSystem.entities.concretes.User;
import com.razortype.GameStoreSystem.entities.concretes.UserInfo;

import java.util.List;

public interface UserService {

    DataResult<List<User>> getAll();
    DataResult<UserInfo> loginUser(String username, String password);
    DataResult<User> getUserById(String username);
    Result add(User user);

}
