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
@ApiModel(value = "User - 用户信息")
public class UserReq {

    @ApiModelProperty(name = "name", required = false, example = "jack")
    private String name;
}
