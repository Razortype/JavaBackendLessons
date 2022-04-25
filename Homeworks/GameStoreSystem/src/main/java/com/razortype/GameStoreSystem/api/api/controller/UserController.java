package com.razortype.GameStoreSystem.api.api.controller;

import com.razortype.GameStoreSystem.business.abstracts.UserService;
import com.razortype.GameStoreSystem.entities.concretes.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController @RequestMapping("api/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/all")
    public List<User> getAll() {
        return this.userService.getAll();
    }

}
