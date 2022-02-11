package com.zhenuy.maven.controller.test;

import com.sinosdx.saic.tools.message.config.MessageFactory;
import com.sinosdx.saic.tools.message.email.EmailUtils;
import com.sinosdx.saic.tools.message.qywx.QywxUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Date 2021/10/21 12:15
 * @Author gongzhenyu
 * @Describe
 */
public class TestQywxPush {

    static ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(8, 8, 60, TimeUnit.SECONDS, new LinkedBlockingQueue<>(30));

    public static void main(String[] args) {
        poolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                Map<String, String> message=new HashMap<>();
                message.put("title","nihao");
                message.put("description","nihao");
                message.put("url","www.baidu.com");
                message.put("content","nihao");

                QywxUtils qywxUtils = MessageFactory.qywxUtils();
                qywxUtils.sendMessage("1000037","","GongZhenYu","","text","",message);

                EmailUtils emailUtils= MessageFactory.emailUtils();
                emailUtils.sendEmail("你好","你好","111@.com","集团", Arrays.asList("zhenyu.gong@qq.com"));
            }
        });
    }
}
