package com.zyn.pumpkinmarket.model.param;

import com.zyn.pumpkinmarket.model.UserRegisterReq;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserRegisterParam {

    private UserRegisterReq userRegisterReq;

}
