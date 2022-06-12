package com.zyn.pumpkinmarket.model.param;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserLoginParam {

    private String username;

    private String password;

}
