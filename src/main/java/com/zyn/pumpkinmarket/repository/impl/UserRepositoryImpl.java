package com.zyn.pumpkinmarket.repository.impl;

import com.zyn.pumpkinmarket.model.entity.UserEntity;
import com.zyn.pumpkinmarket.repository.Db.UserDbRepository;
import com.zyn.pumpkinmarket.repository.UserRepository;

import javax.annotation.Resource;

public class UserRepositoryImpl implements UserRepository {

    @Resource
    private UserDbRepository userDbRepository;

    @Override
    public UserEntity getUser(String username, String password) {
        return null;
    }
}
