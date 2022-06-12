package com.zyn.pumpkinmarket.business;

import com.zyn.pumpkinmarket.model.entity.UserEntity;
import com.zyn.pumpkinmarket.model.param.UserLoginParam;
import com.zyn.pumpkinmarket.repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserBusinessService {

    @Resource
    private UserRepository userRepository;

    public UserEntity login(UserLoginParam param) {
        return userRepository.getUser(param.getUsername(), param.getPassword());
    }
}
