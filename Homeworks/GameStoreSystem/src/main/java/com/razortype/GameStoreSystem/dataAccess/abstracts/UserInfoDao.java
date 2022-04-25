package com.razortype.GameStoreSystem.dataAccess.abstracts;

import com.razortype.GameStoreSystem.entities.concretes.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoDao extends JpaRepository<UserInfo, Integer> {



}
