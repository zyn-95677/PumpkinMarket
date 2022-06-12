package com.zyn.pumpkinmarket.controller;

import com.zyn.pumpkinmarket.business.UserBusinessService;
import com.zyn.pumpkinmarket.constants.CommonConstant;
import com.zyn.pumpkinmarket.model.LoginReq;
import com.zyn.pumpkinmarket.model.entity.UserEntity;
import com.zyn.pumpkinmarket.model.param.UserLoginParam;
import com.zyn.pumpkinmarket.utils.Resp;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Resource
    private UserBusinessService userBusinessService;

    @PostMapping("/login")
    @ResponseBody
    public Resp login(@Validated @RequestBody LoginReq loginReq) {
        UserLoginParam param = UserLoginParam.builder()
                .username(loginReq.getUsername())
                .password(loginReq.getPassword())
                .build();
        UserEntity userEntity = userBusinessService.login(param);
        Map<String, Object> map = new HashMap<>();
        map.put(CommonConstant.KEY_DATA, userEntity);
        return Resp.ok(map);
    }
}
