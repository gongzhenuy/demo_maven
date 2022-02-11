package com.sinosdx.maven.controller.test;

import com.sinosdx.maven.dao.from.HandleLogFrom;
import com.sinosdx.maven.dao.po.HandleLog;
import com.sinosdx.maven.service.HandleLogService;
import com.sinosdx.saic.tools.message.bpm.BpmService;
import com.sinosdx.saic.tools.message.bpm.base.BpmBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 *
 * @Author gongzhenyu
 * @Date 2021-05-13 17:56:27
 */
@RestController
@RequestMapping("/handle")
public class HandleLogController {

    @Autowired
    private BpmService bpmService;

    @Autowired
    private BpmBase bpmBase;

    @Resource(name = "HandleLogService1")
//    @Autowired
//    @Qualifier("HandleLogService1")
    private HandleLogService handleLogService;
    /**
     * @Resource 默认按bean的名称匹配，找不到时按type,当一个接口有多个实现类时，可能就需要指定类的名称
     * @Autowired 按byType的方式匹配，当相同对象只有一个时，可以正确匹配，但是
     * 当有两个相同类在不同包下同时存在，这个时候就只能配合使用@Qualifier，将byType转换成byName进行匹配
     */

    /**
     * @param id 主键
     * @return 单条数据
     * @Author gongzhenyu
     * @Describe 通过主键查询单条数据
     */
    @GetMapping("/selectOne")
    public HandleLog selectOne(@RequestParam Integer id) {
        return handleLogService.queryById(id);
    }


    /**
     * @Author gongzhenyu
     * @Date 2022/1/14 14:40
     * @Describe 分页
     */
    @GetMapping("/selectList")
    public Object selectList(@RequestBody HandleLogFrom handleLogFrom) {
        return handleLogService.selectList(handleLogFrom);
    }


    /**
     * @Author gongzhenyu
     * @Date 2022/1/14 15:47
     * @Describe 分页查询走xml
     */
    @GetMapping("/selectList2")
    public Object selectList2(@RequestBody HandleLogFrom handleLogFrom) {
        return handleLogService.queryAllByLimit(handleLogFrom.getPage(), handleLogFrom.getLimit());
    }

    @GetMapping("/testTools")
    public void testTools(){
        System.out.println("bpmBase.getDomain() = " + bpmBase.getDomain());
        bpmService.queryDepartment("11",null);
    }


}
