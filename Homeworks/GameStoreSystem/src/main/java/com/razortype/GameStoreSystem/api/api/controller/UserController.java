package com.razortype.GameStoreSystem.api.api.controller;

import com.razortype.GameStoreSystem.business.abstracts.UserInfoService;
import com.razortype.GameStoreSystem.business.abstracts.UserService;
import com.razortype.GameStoreSystem.core.result.DataResult;
import com.razortype.GameStoreSystem.entities.concretes.User;
import com.razortype.GameStoreSystem.entities.concretes.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController @RequestMapping("api/user")
public class UserController {

    private final UserService userService;
    private final UserInfoService userInfoService;

    @GetMapping("/all")
    public DataResult<List<User>> getAll() {
        return this.userService.getAll();
    }

    @PostMapping("/login")
    public UserInfo loginUser(@RequestBody String username, @RequestBody String password) {
        return this.userService.loginUser(username, password);
    }

    @GetMapping("/getById")
    public User getUserById(@RequestParam String username) {
        return this.userService.getUserById(username);
    }

    @PostMapping("/register")
    public void add(@RequestBody User user) {
        this.userService.add(user);
    }

}
