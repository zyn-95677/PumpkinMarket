package com.zyn.pumpkinmarket.controller;

import com.zyn.pumpkinmarket.business.UserBusinessService;
import com.zyn.pumpkinmarket.model.UserLoginReq;
import com.zyn.pumpkinmarket.model.UserRegisterReq;
import com.zyn.pumpkinmarket.model.UserReq;
import com.zyn.pumpkinmarket.model.entity.UserEntity;
import com.zyn.pumpkinmarket.model.param.UserLoginParam;
import com.zyn.pumpkinmarket.model.param.UserParam;
import com.zyn.pumpkinmarket.model.param.UserRegisterParam;
import com.zyn.pumpkinmarket.utils.Resp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
@Slf4j
@CrossOrigin
public class UserController {

    @Resource
    private UserBusinessService userBusinessService;

    @PostMapping("/login")
    @ResponseBody
    public Resp login(@Validated @RequestBody UserLoginReq userLoginReq) {
        UserLoginParam param = UserLoginParam.builder()
                .username(userLoginReq.getUsername())
                .password(userLoginReq.getPassword())
                .build();
        userBusinessService.login(param);
        return Resp.SUCCESS;
    }

    @PostMapping("/update")
    @ResponseBody
    public UserEntity update(String id, @Validated @RequestBody UserReq userReq) {
        UserParam param = UserParam.builder()
                .id(id)
                .userReq(userReq)
                .build();
        return userBusinessService.update(param);
    }

    @PostMapping("/register")
    @ResponseBody
    public void register(@Validated @RequestBody UserRegisterReq userRegisterReq) {
        UserRegisterParam param = UserRegisterParam.builder()
                .userRegisterReq(userRegisterReq)
                .build();
        userBusinessService.addUser(param);
    }
}
