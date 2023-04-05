package com.zyn.pumpkinmarket.controller;

import com.zyn.pumpkinmarket.business.FolderBusinessService;
import com.zyn.pumpkinmarket.model.ListFolderResp;
import com.zyn.pumpkinmarket.model.param.ListFolderParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/folder")
@Slf4j
@CrossOrigin
public class FolderController {

    @Resource
    private FolderBusinessService folderBusinessService;

    @GetMapping("/listFolder")
    @ResponseBody
    public ListFolderResp listFolder(@RequestParam("userId") String userId,
                                     @RequestParam("limit") int limit, @RequestParam("offset") int offset) {
        ListFolderParam param = ListFolderParam.builder()
                .userId(userId)
                .offset(offset)
                .limit(limit)
                .build();
        return folderBusinessService.listFolder(param);
    }
}
