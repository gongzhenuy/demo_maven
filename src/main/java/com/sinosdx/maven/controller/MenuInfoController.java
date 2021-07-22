package com.sinosdx.maven.controller;

import com.sinosdx.maven.dao.entity.MenuInfo;
import com.sinosdx.maven.service.MenuInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 菜单表(MenuInfo)
 *
 * @Author gongzhenyu
 * @Date 2021-03-04 15:28:24
 */
@RestController
@RequestMapping("menuInfo")
public class MenuInfoController {

    @Resource
    private MenuInfoService menuInfoService;

    /**
     * @param id 主键
     * @return 单条数据
     * @Author gongzhenyu
     * @Describe 通过主键查询单条数据
     */
    @GetMapping("selectOne")
    public MenuInfo selectOne(Integer id) {
        return this.menuInfoService.queryById(id);
    }

}
