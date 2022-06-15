package com.zyn.pumpkinmarket.model.param;

import com.zyn.pumpkinmarket.model.UserReq;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserParam {

    private String id;

    private UserReq userReq;

}
