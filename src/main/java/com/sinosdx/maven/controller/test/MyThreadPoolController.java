package com.sinosdx.maven.controller.test;

import com.sinosdx.maven.service.impl.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Date 2022/1/14 16:52
 * @Author gongzhenyu
 * @Describe
 */
@RestController
@RequestMapping("/thread")
public class MyThreadPoolController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/async")
    public void async() throws InterruptedException {
        asyncService.executeAsync();
    }


    @GetMapping("/testCompletableFuture")
    public void testCompletableFuture() {
        asyncService.testCompletableFuture();
    }

}
