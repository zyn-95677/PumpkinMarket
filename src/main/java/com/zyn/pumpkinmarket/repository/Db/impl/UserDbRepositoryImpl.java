package com.zyn.pumpkinmarket.repository.Db.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyn.pumpkinmarket.dao.UserDao;
import com.zyn.pumpkinmarket.model.entity.UserEntity;
import com.zyn.pumpkinmarket.repository.Db.UserDbRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserDbRepository")
public class UserDbRepositoryImpl extends ServiceImpl<UserDao, UserEntity> implements UserDbRepository {

    @Resource
    private UserDao userDao;

    @Override
    public UserEntity getUser(String username, String password) {
        QueryWrapper<UserEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(UserField.USERNAME, username);
        wrapper.eq(UserField.PASSWORD, password);
        return userDao.selectOne(wrapper);
    }

    @Override
    public int updateUser(String id, UserEntity userEntity) {
        UpdateWrapper<UserEntity> wrapper = new UpdateWrapper<>();
        wrapper.eq(UserField.ID, id);
        return userDao.update(userEntity, wrapper);
    }

    @Override
    public UserEntity getUserById(String id) {
        return userDao.selectById(id);
    }

    @Override
    public int addUser(UserEntity userEntity) {
        return userDao.insert(userEntity);
    }

    static class UserField {

        static final String ID = "id";

        static final String USERNAME = "username";

        static final String PASSWORD = "password";
    }
}
