package com.xxyw.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xxyw.entity.User;
import com.xxyw.mapper.UserMapper;
import com.xxyw.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
