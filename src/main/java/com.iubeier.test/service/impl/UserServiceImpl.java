package com.iubeier.test.service.impl;

import com.iubeier.test.entity.UserEntity;
import com.iubeier.test.mapper.UserMapper;
import com.iubeier.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by jankie on 16/1/2.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserEntity getUserById(String userId) {
        return userMapper.getUserById(userId);
    }

    @Override
    public List<UserEntity> getUserList(){
        return userMapper.getUserList();
    }
}
