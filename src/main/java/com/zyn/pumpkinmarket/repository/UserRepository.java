package com.zyn.pumpkinmarket.repository;

import com.zyn.pumpkinmarket.model.entity.UserEntity;

public interface UserRepository {
    UserEntity getUser(String username, String password);

    UserEntity updateUser(String id, UserEntity userEntity);

    boolean addUser(UserEntity userEntity);
}
