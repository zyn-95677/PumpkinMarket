package com.zyn.pumpkinmarket.model;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotNull;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "User - 登录信息")
public class LoginReq {

    @NotNull(message = "账号不能为空")
    private String username;

    @NotNull(message = "密码不能为空")
    private String password;

}
