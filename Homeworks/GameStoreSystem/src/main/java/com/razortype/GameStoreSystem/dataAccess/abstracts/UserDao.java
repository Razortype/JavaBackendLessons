package com.razortype.GameStoreSystem.dataAccess.abstracts;

import com.razortype.GameStoreSystem.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {

    User findByUsernameAndPassword(String username, String password);

}
