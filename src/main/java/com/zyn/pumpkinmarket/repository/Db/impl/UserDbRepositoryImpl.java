package com.zyn.pumpkinmarket.repository.Db.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyn.pumpkinmarket.dao.UserDao;
import com.zyn.pumpkinmarket.model.entity.UserEntity;
import com.zyn.pumpkinmarket.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserDbRepository")
public class UserDbRepositoryImpl extends ServiceImpl<UserDao, UserEntity> implements UserRepository {

    @Resource
    private UserDao userDao;

    @Override
    public UserEntity getUser(String username, String password) {
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(UserField.USERNAME, username);
        wrapper.eq(UserField.PASSWORD, password);
        return userDao.selectOne(wrapper);
    }

    static class UserField {
        static final String USERNAME = "username";
        static final String PASSWORD = "password";
    }
}
