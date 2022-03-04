package com.example.sharding.dao;
import com.example.sharding.ShardingApplication;
import com.example.sharding.pojo.domain.UserDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@SpringBootTest(classes = ShardingApplication.class)
@RunWith(SpringRunner.class)
@EnableAutoConfiguration
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    public void testInsertUser(){
        UserDO record = new UserDO();
        record.setId(UUID.randomUUID().toString());
        record.setName("a");
        record.setPassword("a");

        userDao.insert(record);
    }
}