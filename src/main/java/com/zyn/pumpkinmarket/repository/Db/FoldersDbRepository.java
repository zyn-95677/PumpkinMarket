package com.zyn.pumpkinmarket.repository.Db;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zyn.pumpkinmarket.model.entity.FolderEntity;

public interface FoldersDbRepository extends IService<FolderEntity> {

    Page<FolderEntity> listFolderByUserId(String userId, int offset, int limit);
}
