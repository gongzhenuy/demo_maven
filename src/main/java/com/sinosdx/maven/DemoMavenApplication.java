package com.sinosdx.maven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.sinosdx.maven.mybatis.mapper")
@SpringBootApplication
@EnableAsync
@EnableScheduling
public class DemoMavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMavenApplication.class, args);
    }

}
