package com.zyn.pumpkinmarket.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@TableName("tb_file_info")
@Builder
public class FileEntity {
    @TableId(type = IdType.ASSIGN_UUID)
    private String id;

    private String userId;

    private String userName;

    private String folderId;

    private String fileName;

    private String description;

    private String filePath;

    private Date createTime;

    private Date UpdateTime;
}
