package com.razortype.GameStoreSystem.business.concretes;

import com.razortype.GameStoreSystem.business.abstracts.UserService;
import com.razortype.GameStoreSystem.core.result.*;
import com.razortype.GameStoreSystem.dataAccess.abstracts.UserDao;
import com.razortype.GameStoreSystem.dataAccess.abstracts.UserInfoDao;
import com.razortype.GameStoreSystem.entities.concretes.User;
import com.razortype.GameStoreSystem.entities.concretes.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserManager implements UserService {

    private final UserDao userDao;
    private final UserInfoDao userInfoDao;

    @Override
    public DataResult<List<User>> getAll() {
        List<User> users = this.userDao.findAll();
        return new SuccessDataResult<>(users, "Users Listed!");
    }

    @Override
    public DataResult<UserInfo> loginUser(String username, String password) {

        User user = userDao.findByUsernameAndPassword(username, password) ;
        UserInfo userInfo;

        if (user != null) {
            int id = user.getId();
            userInfo = userInfoDao.getById(id);
        } else {
            return new ErrorDataResult<>("No user has found");
        }

        if (userInfo != null) {
            return new SuccessDataResult<>(userInfo, "Login Executed");
        } else {
            return new ErrorDataResult<>("No user has found");
        }

    }

    @Override
    public DataResult<User> getUserById(String username) {
        User user = this.userDao.findUserByUsername(username);
        if (user != null) {
            return new SuccessDataResult<>(user, "User Exported!");
        } else {
            return new ErrorDataResult<>("User Could not Exported!");
        }
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Successfully Saved to Database!");
    }

}
