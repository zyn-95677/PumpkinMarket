package com.zyn.pumpkinmarket.model.param;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ListFolderParam {

    private String userId;

    private int limit;

    private int offset;

}
