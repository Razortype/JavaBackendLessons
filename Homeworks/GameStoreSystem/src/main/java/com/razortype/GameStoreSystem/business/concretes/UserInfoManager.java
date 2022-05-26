package com.razortype.GameStoreSystem.business.concretes;


import com.razortype.GameStoreSystem.business.abstracts.UserInfoService;
import com.razortype.GameStoreSystem.core.result.DataResult;
import com.razortype.GameStoreSystem.core.result.SuccessDataResult;
import com.razortype.GameStoreSystem.dataAccess.abstracts.UserInfoDao;
import com.razortype.GameStoreSystem.entities.concretes.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserInfoManager implements UserInfoService {

    private final UserInfoDao userInfoDao;


    @Override
    public DataResult<List<UserInfo>> getAll() {
        List<UserInfo> userInfos = this.userInfoDao.findAll();
        return new SuccessDataResult<>(userInfos, "All user information executed!");
    }
}
