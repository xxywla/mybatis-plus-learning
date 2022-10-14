package com.xxyw;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xxyw.entity.User;
import com.xxyw.mapper.UserMapper;
import com.xxyw.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ServiceTestsDemo1 {

    @Autowired
    UserService userService;


    @Test
    void testQuery1() {
        List<User> userList = userService.list();
        userList.forEach(System.out::println);
    }

}
