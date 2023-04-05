package com.zyn.pumpkinmarket.repository.impl;

import com.zyn.pumpkinmarket.model.entity.UserEntity;
import com.zyn.pumpkinmarket.repository.Db.UserDbRepository;
import com.zyn.pumpkinmarket.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserRepository")
public class UserRepositoryImpl implements UserRepository {

    @Resource
    private UserDbRepository userDbRepository;

    @Override
    public UserEntity login(String username, String password) {
        return userDbRepository.getUser(username, password);
    }

    @Override
    public UserEntity updateUser(String id, UserEntity userEntity) {
        int result = userDbRepository.updateUser(id, userEntity);
        if (result == 0) {
            throw new RuntimeException();
        }
        return userDbRepository.getUserById(id);
    }

    @Override
    public boolean addUser(UserEntity userEntity) {
        int result = userDbRepository.addUser(userEntity);
        if (result == 0) {
            throw new RuntimeException();
        }
        return true;
    }
}
