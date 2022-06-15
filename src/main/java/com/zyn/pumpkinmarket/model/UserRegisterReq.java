package com.zyn.pumpkinmarket.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegisterReq {

    @ApiModelProperty(name = "username", required = true, example = "123")
    private String username;

    @ApiModelProperty(name = "name", required = true, example = "jack")
    private String name;

    @ApiModelProperty(name = "password", required = true, example = "123")
    private String password;
}
