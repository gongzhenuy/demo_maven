package com.sinosdx.maven.service.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.concurrent.TimeUnit;

@Service
public class RedisService {

    private Logger logger = LoggerFactory.getLogger(RedisService.class);

    @Autowired
    private StringRedisTemplate redisTemplate;
    /**
     * save(Redis缓存存储)
     * @param value
     * @param key
     * @param times 过期时间，单位秒（值为null时缺省设置 30分钟）
     * void
     * @exception
     * @since  1.0.0
     */
    public void save(final String value, final String key, final Integer times) {
        redisTemplate.opsForValue().set(key, value, times, TimeUnit.SECONDS);
    }

    public String read(final String key) {
        String value = redisTemplate.opsForValue().get(key);
        logger.info("读取缓存key：{}，值：{}", key, value);
        return value;
    }

    /**
     * 判断是否存在key值
     * @param key 缓存key
     * @return boolean
     */
    public boolean exists(final String key){
        return redisTemplate.hasKey(key);
    }

    public void delete(final String key) {
        redisTemplate.delete(key);
    }

    /**
     * 更新缓存key生存时间
     * @param key key
     * @param times 时间
     */
    public void expire(final String key, final Integer times) {
        Integer time = 30*60;
        if(times != null){
            time = times;
        }
        redisTemplate.expire(key, time, TimeUnit.SECONDS);
    }

    /**
     * 将一个或多个值 value 插入到列表 key 的表头
     *
     * @param key   key
     * @param value string value
     * @return 执行 listPushHead 命令后，列表的长度。
     */
    public Long listPushHead(final String key, final String value) {
        return redisTemplate.opsForList().leftPush(key, value);
    }

    /**
     * 从列表尾部弹出一个元素
     *
     * @param key
     * @return
     */
    public String listBPopTail(final String key) {
        return redisTemplate.opsForList().rightPop(key);
    }

    /**
     * 返回通配key
     * @return list
     */
    public Set<String> hasKeys(String pattern){
        return redisTemplate.keys(pattern);
    }


    /**
     *
     * @param key
     * @return
     */
    public long decr(final String key, Long num) {
        return redisTemplate.opsForValue().increment(key, 0 - num);
    }

    public long incr(final String key, Long num) {
        return redisTemplate.opsForValue().increment(key, num);
    }

    public long getExpire(String key){
        return redisTemplate.getExpire(key);
    }

    /**
     * 上锁
     * 将键值对设定一个指定的时间timeout.
     *
     * @param key
     * @param timeout 键值对缓存的时间，单位是秒
     * @return 设置成功返回true，否则返回false
     */
    public  boolean tryLock(String key, String value, long timeout) {
        //底层原理就是Redis的setnx方法
        boolean isSuccess = redisTemplate.opsForValue().setIfAbsent(key, value);
        if (isSuccess) {
            //设置分布式锁的过期时间
            redisTemplate.expire(key, timeout, TimeUnit.SECONDS);
        }
        return isSuccess;
    }
}
