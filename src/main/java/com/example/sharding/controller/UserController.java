package com.example.sharding.controller;

import com.example.sharding.pojo.domain.UserDO;
import com.example.sharding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    public Map<String,Object> insert(@RequestBody UserDO record){
        Map<String,Object> res = new HashMap<>();
        int num = userService.insertUser(record);
        res.put("num",num);
        return res;
    }
}
