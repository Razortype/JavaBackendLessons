package com.razortype.GameStoreSystem.business.concretes;

import com.razortype.GameStoreSystem.business.abstracts.UserService;
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
    public List<User> getAll() {
        return userDao.findAll();
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

}
