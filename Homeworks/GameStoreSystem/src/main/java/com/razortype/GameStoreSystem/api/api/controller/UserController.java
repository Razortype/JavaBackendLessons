package com.razortype.GameStoreSystem.api.api.controller;

import com.razortype.GameStoreSystem.business.abstracts.UserInfoService;
import com.razortype.GameStoreSystem.business.abstracts.UserService;
import com.razortype.GameStoreSystem.entities.concretes.User;
import com.razortype.GameStoreSystem.entities.concretes.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController @RequestMapping("api/user")
public class UserController {

    private final UserService userService;
    private final UserInfoService userInfoService;

    @GetMapping("/all")
    public List<User> getAll() {
        return this.userService.getAll();
    }

    @GetMapping("/login")
    public UserInfo loginUser(@RequestParam String username, @RequestParam String password) {
        return this.userService.loginUser(username, password);
    }

}
