package com.example.sharding.service.impl;

import com.example.sharding.dao.UserDao;
import com.example.sharding.pojo.domain.UserDO;
import com.example.sharding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public int insertUser(UserDO record) {
        return userDao.insert(record);
    }
}
