package com.example.sharding.dao;

import com.example.sharding.pojo.domain.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    int insert(UserDO record);
}
