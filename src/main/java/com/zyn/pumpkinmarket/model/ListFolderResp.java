package com.zyn.pumpkinmarket.model;

import com.zyn.pumpkinmarket.model.entity.FolderEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ListFolderResp {

    long count;

    List<FolderEntity> folderEntityList;
}
