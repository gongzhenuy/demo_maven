package com.sinosdx.maven.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

/**
 * @Date 2020/11/24 15:30
 * @Author gongzhenyu
 * @Describe
 */
@Repository
public class RabbitMqConfig {

    @Bean
    public Queue Queue1() {
        return new Queue("lyhTest1");
    }
}
