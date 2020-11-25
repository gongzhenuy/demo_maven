package com.sinosdx.maven.controller.mongo;

import com.sinosdx.maven.dao.po.MongoPo;
import com.sinosdx.maven.service.mongo.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2020/11/12 18:06
 * @Author gongzhenyu
 */
@RestController
public class MongoController {

    @Autowired
    private MongoService mongoService;

    @GetMapping(value="/test1")
    public void saveTest() throws Exception {
        MongoPo mgtest=new MongoPo();
        mgtest.setId(11);
        mgtest.setAge(33);
        mgtest.setName("ceshi");
        mongoService.saveTest(mgtest);
    }

    @GetMapping(value="/test2")
    public MongoPo findTestByName(){
        MongoPo mgtest= mongoService.findTestByName("ceshi");
        System.out.println("mgtest is "+mgtest);
        return mgtest;
    }

    @GetMapping(value="/test3")
    public void updateTest(){
        MongoPo mgtest=new MongoPo();
        mgtest.setId(11);
        mgtest.setAge(44);
        mgtest.setName("ceshi2");
        mongoService.updateTest(mgtest);
    }

    @GetMapping(value="/test4")
    public void deleteTestById(){
        mongoService.deleteTestById(11);
    }

}
