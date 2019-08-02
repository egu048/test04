package com.heima.controller;

import com.heima.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/list")
    public List<User> findAll(){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("zs","bj",23));
        list.add(new User("ls","sh",24));
        list.add(new User("ww","gz",25));
        return list;
    }
}
