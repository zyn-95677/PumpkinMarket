package com.zyn.pumpkinmarket.business;

import com.zyn.pumpkinmarket.filter.GlobalException;
import com.zyn.pumpkinmarket.model.entity.UserEntity;
import com.zyn.pumpkinmarket.model.param.UserLoginParam;
import com.zyn.pumpkinmarket.model.param.UserParam;
import com.zyn.pumpkinmarket.model.param.UserRegisterParam;
import com.zyn.pumpkinmarket.repository.UserRepository;
import com.zyn.pumpkinmarket.utils.JojoUtil;
import com.zyn.pumpkinmarket.utils.Resp;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserBusinessService")
public class UserBusinessService {

    @Resource
    private UserRepository userRepository;

    public void login(UserLoginParam param) {
        String username = param.getUsername();
        String password = param.getPassword();
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            throw new GlobalException(Resp.USE_OR_PASSWORD_EMPTY);
        }
        UserEntity user = userRepository.login(username, JojoUtil.encrypt(password));
        if (user == null) {
            throw new GlobalException(Resp.USE_OR_PASSWORD_ERROR);
        }
    }

    public UserEntity update(UserParam param) {
        String id = param.getId();
        if (StringUtils.isBlank(id)) {
            throw new RuntimeException();
        }
        return userRepository.updateUser(param.getId(), buildUserEntity(param));
    }

    public void addUser(UserRegisterParam param) {
        boolean result = userRepository.addUser(buildUserEntity(param));
        if (!result) {
            throw new GlobalException(Resp.USE_NOT_EXIST);
        }
    }

    private UserEntity buildUserEntity(UserParam param) {
        return UserEntity.builder()
                .name(param.getUserReq().getName())
                .build();
    }

    private UserEntity buildUserEntity(UserRegisterParam param) {
        return UserEntity.builder()
                .username(param.getUserRegisterReq().getUsername())
                .name(param.getUserRegisterReq().getName())
                .password(param.getUserRegisterReq().getPassword())
                .build();
    }
}
