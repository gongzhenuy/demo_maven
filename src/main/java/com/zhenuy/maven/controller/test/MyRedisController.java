package com.zhenuy.maven.controller.test;

import com.zhenuy.maven.service.redis.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Date 2022/1/14 9:55
 * @Author gongzhenyu
 * @Describe
 */
@RestController
public class MyRedisController {

    //@Autowired
    private RedisService redisService;

    //setter注入
    /*@Autowired
    public void setRedisService(RedisService redisService) {
        this.redisService = redisService;
    }*/

    //构造器注入
    @Autowired
    public MyRedisController(RedisService redisService) {
        this.redisService = redisService;
    }

    @GetMapping("/redis/createRedis")
    public void createRedis() {
        //测试redis 有序集合 sorts set
//        redisService.zSet("key1","zhangsan",5);
//        redisService.zSet("key1","lisi",6);
//        redisService.zSet("key1","wangliu",4);
//        redisService.zSet("key1","wangqi",8);
//        redisService.zSet("key1","wangba",3);

        //测试redis list集合
        redisService.lSet("key2", "zhangsan");
//        redisService.lSet("key2", "lisi");
//        redisService.lSet("key2", "wangwu");

        //测试redis hash
        Map<String, Object> map = new HashMap<>();
        map.put("id", "1");
        map.put("name", "dongdong");
        map.put("age", "3");
        redisService.hset("myhash1", "keyhash", "aaa");
        redisService.hset("myhash1", "keyhash2", map);
        redisService.hmset("myhash1", map);
    }

    @GetMapping("/redis/getRedis")
    public Object getRedis(@Param("value") Integer value) {
//        Set<ZSetOperations.TypedTuple<Object>> sets = redisService.zRange("key1", value);
//        //正序取出前几的数据
//        Set<Object> key1 = redisService.zReverseRange("key1", Long.valueOf(value));
//        Set<ZSetOperations.TypedTuple<Object>> key2 = redisService.zReverseRangeByScore("key1", value);
//        //倒序取出前几的数据
//        Set<ZSetOperations.TypedTuple<Object>> key4 = redisService.zReverseRangeWithScores("key1", value);

        List<Object> key2 = redisService.lGet("key2", 0L, -1L);

        System.out.println(key2);
        return key2;
    }

    @GetMapping("/redis/getLpop")
    public Object getLpop(@Param("value") Integer value) {
        Object key2 = redisService.lpop("key2");
        return key2;
    }


    /**
     * @Author gongzhenyu
     * @Date 2022/1/17 17:21
     * @Describe 加锁
     */
    @GetMapping("/redis/lock")
    public Boolean lock() {
        return redisService.lock("mylock", "123456", 60 * 10);
    }


    /**
     * @Author gongzhenyu
     * @Date 2022/1/14 16:03
     * @Describe 必须key和value相同才能解锁
     */
    @GetMapping("/redis/unlock")
    public void unlock() {
        redisService.unLock("mylock", "1");
    }


}
