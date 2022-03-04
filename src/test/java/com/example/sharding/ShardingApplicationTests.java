package com.example.sharding;

import com.example.sharding.dao.UserDao;
import com.example.sharding.pojo.domain.UserDO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShardingApplicationTests {


	@Test
	void contextLoads() {
		System.out.printf("");
	}

}
