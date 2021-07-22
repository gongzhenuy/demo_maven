package com.sinosdx.maven.controller;

import com.sinosdx.maven.dao.entity.HandleLog;
import com.sinosdx.maven.service.HandleLogService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (HandleLog)
 *
 * @Author gongzhenyu
 * @Date 2021-05-13 17:56:27
 */
@RestController
@RequestMapping("handleLog")
public class HandleLogController {

    @Resource
    private HandleLogService handleLogService;

    /**
     * @param id 主键
     * @return 单条数据
     * @Author gongzhenyu
     * @Describe 通过主键查询单条数据
     */
    @GetMapping("selectOne")
    public HandleLog selectOne(Integer id) {
        return this.handleLogService.queryById(id);
    }

}
