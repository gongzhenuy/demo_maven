package com.sinosdx.maven.controller;

import com.sinosdx.maven.dao.entity.RoleMenu;
import com.sinosdx.maven.service.RoleMenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色菜单表(RoleMenu)
 *
 * @Author gongzhenyu
 * @Date 2021-03-04 13:43:14
 */
@RestController
@RequestMapping("roleMenu")
public class RoleMenuController {

    @Resource
    private RoleMenuService roleMenuService;

    /**
     * @param id 主键
     * @return 单条数据
     * @Author gongzhenyu
     * @Describe 通过主键查询单条数据
     */
    @GetMapping("selectOne")
    public RoleMenu selectOne(@RequestParam Long id) {
        return this.roleMenuService.queryById(id);
    }

    @GetMapping("queryAllByLimit")
    public List<RoleMenu> queryAllByLimit(@RequestParam int offset, @RequestParam int limit) {
        return this.roleMenuService.queryAllByLimit(offset,limit);
    }

}
