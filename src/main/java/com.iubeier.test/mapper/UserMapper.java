package com.iubeier.test.mapper;

import com.iubeier.test.entity.UserEntity;

import java.util.List;

/**
 * Created by jankie on 16/1/2.
 */
public interface UserMapper {

    UserEntity getUserById (String userId);

    List<UserEntity> getUserList();
}
