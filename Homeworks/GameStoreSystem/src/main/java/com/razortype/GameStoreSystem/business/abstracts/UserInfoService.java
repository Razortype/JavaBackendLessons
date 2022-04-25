package com.razortype.GameStoreSystem.business.abstracts;

import com.razortype.GameStoreSystem.entities.concretes.UserInfo;

import java.util.List;

public interface UserInfoService {

    List<UserInfo> getAll();

}
