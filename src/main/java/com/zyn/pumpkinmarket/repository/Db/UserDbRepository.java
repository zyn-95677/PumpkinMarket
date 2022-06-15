package com.zyn.pumpkinmarket.repository.Db;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyn.pumpkinmarket.model.entity.UserEntity;

public interface UserDbRepository extends IService<UserEntity> {
    UserEntity getUser(String username, String password);

    int updateUser(String id, UserEntity userEntity);

    UserEntity getUserById(String id);

    int addUser(UserEntity userEntity);
}
