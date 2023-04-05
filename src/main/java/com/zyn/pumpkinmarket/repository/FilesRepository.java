package com.zyn.pumpkinmarket.repository;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zyn.pumpkinmarket.model.entity.FolderEntity;

public interface FilesRepository {
    Page<FolderEntity> listFolderByUserId(String userId, int offset, int limit);
}
