package com.zyn.pumpkinmarket.repository.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zyn.pumpkinmarket.model.entity.FolderEntity;
import com.zyn.pumpkinmarket.repository.Db.FoldersDbRepository;
import com.zyn.pumpkinmarket.repository.FilesRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class FilesRepositoryImpl implements FilesRepository {

    @Resource
    private FoldersDbRepository foldersDbRepository;


    @Override
    public Page<FolderEntity> listFolderByUserId(String userId, int offset, int limit) {
        if (StringUtils.isEmpty(userId)) {
            return null;
        }
        return foldersDbRepository.listFolderByUserId(userId, offset, limit);
    }
}
