package com.sinosdx.maven.controller.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Date 2020/11/24 15:31
 * @Author gongzhenyu
 * @Describe
 */
@RestController
public class RabbitSendController {

//    @Autowired
//    private AmqpTemplate amqpTemplate;

//    @RequestMapping("/send")
//    public String send(){
//        String content="Date:"+new Date();
//        amqpTemplate.convertAndSend("lyhTest1",content);
//        return content;
//    }
}
