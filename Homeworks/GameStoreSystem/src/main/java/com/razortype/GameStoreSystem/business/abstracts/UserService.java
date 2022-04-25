package com.razortype.GameStoreSystem.business.abstracts;

import com.razortype.GameStoreSystem.entities.concretes.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

}
