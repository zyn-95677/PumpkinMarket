package com.zyn.pumpkinmarket.repository.Db.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zyn.pumpkinmarket.dao.FolderDao;
import com.zyn.pumpkinmarket.model.entity.FolderEntity;
import com.zyn.pumpkinmarket.repository.Db.FoldersDbRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class FoldersDbRepositoryImpl extends ServiceImpl<FolderDao, FolderEntity> implements FoldersDbRepository {

    @Resource
    private FolderDao folderDao;

    @Override
    public Page<FolderEntity> listFolderByUserId(String userId, int offset, int limit) {
        QueryWrapper<FolderEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(FolderField.USER_ID, userId);
        wrapper.orderByAsc(FolderField.CREATE_TIME);
        Page<FolderEntity> page = new Page<>(offset / limit + 1, limit);
        return folderDao.selectPage(page, wrapper);
    }

    static class FolderField {

        static final String USER_ID = "user_id";

        static final String CREATE_TIME = "create_time";

    }
}
