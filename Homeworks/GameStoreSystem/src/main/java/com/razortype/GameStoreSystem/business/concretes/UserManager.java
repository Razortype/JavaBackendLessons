package com.razortype.GameStoreSystem.business.concretes;

import com.razortype.GameStoreSystem.business.abstracts.UserService;
import com.razortype.GameStoreSystem.core.result.DataResult;
import com.razortype.GameStoreSystem.core.result.SuccessDataResult;
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
    public UserInfo loginUser(String username, String password) {

        User user = userDao.findByUsernameAndPassword(username, password) ;
        UserInfo userInfo = new UserInfo();

        System.out.println(user.getUsername());

        if (user.getUsername() != null) {
            int id = user.getId();
            userInfo = userInfoDao.getById(id);
        }

        return userInfo;
    }

    @Override
    public User getUserById(String username) {
        return this.userDao.findUserByUsername(username);
    }

    @Override
    public void add(User user) {
        this.userDao.save(user);
    }

}
