package com.bjsxt.service.impl;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    //声明mapper层属性
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selUserInfoService(String uname) {

        return userMapper.selUserInfoMapper(uname);
    }
}
