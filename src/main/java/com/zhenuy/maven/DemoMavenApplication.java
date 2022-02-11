package com.zhenuy.maven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

//@EnableCaching //开启spring-cache缓存
@MapperScan("com.zhenuy.maven.dao.mapper")
//去除mogodb默认启动
@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@EnableAsync
@EnableScheduling
public class DemoMavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMavenApplication.class, args);
    }

}
