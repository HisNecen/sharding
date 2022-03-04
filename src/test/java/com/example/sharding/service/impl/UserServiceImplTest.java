package com.example.sharding.service.impl;

import com.example.sharding.pojo.domain.UserDO;
import com.example.sharding.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserServiceImpl.class)
@EnableAutoConfiguration
public class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    public void insertUser() {
        UserDO record = new UserDO();
        record.setId(UUID.randomUUID().toString());
        record.setName("a");
        record.setPassword("a");

        userService.insertUser(record);
    }
}