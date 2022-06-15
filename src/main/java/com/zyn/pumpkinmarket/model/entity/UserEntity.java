package com.zyn.pumpkinmarket.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

@Data
@TableName("tb_user")
@Builder
public class UserEntity {
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    private String username;

    private String name;

    private String password;
}
