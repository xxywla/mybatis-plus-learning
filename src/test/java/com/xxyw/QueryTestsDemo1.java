package com.xxyw;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xxyw.entity.User;
import com.xxyw.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
class QueryTestsDemo1 {

    @Autowired
    UserMapper userMapper;

    // 5. 正则
    @Test
    void testQuery5() {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<>();
        wrapper.orderByDesc(User::getAge);
        wrapper.like(User::getEmail, "king");
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
    }

    // 4. orderByDesc、orderByAsc
    @Test
    void testQuery4() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.orderByDesc("age");
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
    }

    // 3. like、likeLeft、likeRight
    @Test
    void testQuery3() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("email", "king");
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
    }

    // 2. eq、ne
    @Test
    void testQuery2() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("name", "宫本武藏");
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
    }

    // 1. ge、gt、le、lt
    @Test
    void testQuery1() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.ge("age", 21);
        List<User> userList = userMapper.selectList(wrapper);
        userList.forEach(System.out::println);
    }

}
