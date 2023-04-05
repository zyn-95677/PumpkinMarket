package com.zyn.pumpkinmarket.business;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zyn.pumpkinmarket.model.ListFolderResp;
import com.zyn.pumpkinmarket.model.entity.FolderEntity;
import com.zyn.pumpkinmarket.model.param.ListFolderParam;
import com.zyn.pumpkinmarket.repository.FilesRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("FolderBusinessService")
public class FolderBusinessService {

    @Resource
    private FilesRepository filesRepository;

    public ListFolderResp listFolder(ListFolderParam param) {
        String userId = param.getUserId();
        int offset = param.getOffset();
        int limit = param.getLimit();
        if (StringUtils.isEmpty(userId)) {
            return null;
        }
        Page<FolderEntity> folderEntityPage = filesRepository.listFolderByUserId(userId, offset, limit);
        List<FolderEntity> folderList = folderEntityPage.getRecords();
        long count = folderEntityPage.getTotal();

        return ListFolderResp.builder().folderEntityList(folderList).count(count).build();
    }
}
