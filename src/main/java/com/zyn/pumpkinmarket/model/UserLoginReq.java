package com.zyn.pumpkinmarket.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiModel(value = "User - 登录信息")
public class UserLoginReq {

    @ApiModelProperty(name = "username", required = true, example = "123")
    private String username;

    private String password;

}
