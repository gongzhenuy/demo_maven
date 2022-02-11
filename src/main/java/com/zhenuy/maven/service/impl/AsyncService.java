package com.zhenuy.maven.service.impl;

import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.*;

/**
 * @Date 2022/1/17 17:35
 * @Author gongzhenyu
 * @Describe 测试线程池异步
 */
@Service
public class AsyncService {

    private static final Logger logger = LoggerFactory.getLogger(AsyncService.class);

    @Autowired
    @Qualifier("asyncServiceExecutor")
    private Executor executor;

    @Async("asyncServiceExecutor")
    public void executeAsync() throws InterruptedException {
        logger.info("start executeAsync");
        Thread.sleep(1000 * 70);
        System.out.println("异步线程要做的事情");
        System.out.println("可以在这里执行批量插入等耗时的事情");

        logger.info("end executeAsync");
    }


    /**
     * @Author gongzhenyu
     * @Date 2022/1/19 17:02
     * @Describe Executors工具类
     */
    public void testExecutors() {
        /**
         * newFixedThreadPool,newSingleThreadExecutor因为使用linkedBlockingQueue,
         * linkedBlockingQueue默认为无界队列，队列长度为Integer.MAX_VALUE，可能导致队列中请求处理堆积，耗费内存，甚至OOM
         */
        Executors.newFixedThreadPool(2);//可定长线程池
        Executors.newSingleThreadExecutor();//单线程池

        /**
         *newCachedThreadPool和newScheduledThreadPool中的最大线程池为Integer.MAX_VALUE，可能导致创建非常多的线程，
         * 浪费资源，甚至OOM
         */
        Executors.newCachedThreadPool();//可缓存线程池，能灵活回收空闲线程，若无可回收，则新建线程
        Executors.newScheduledThreadPool(2); //能定长并支持定时的线程池


        /**
         * java.util.concurrent 中加入了 BlockingQueue(b la k q) 接口和五个阻塞队列类
         */
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(2);//一个由链表节点支持的可选有界队列。
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(2); //一个由数组支持的有界队列。
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();//一个由优先级堆支持的无界优先级队列。
        DelayQueue delayQueue = new DelayQueue();//一个由优先级堆支持的、基于时间的调度队列。
        SynchronousQueue synchronousQueue = new SynchronousQueue(); //一个利用 BlockingQueue 接口的简单聚集（rendezvous）机制。

    }


    /**
     * synchronized( c 亏 l z d)
     */
    @SneakyThrows
    public void testCompletableFuture(){
        logger.info("aaaaaaaaaaaaaaaaaa-----");
        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            logger.info("supplyAsync " + Thread.currentThread().getName());
            return "hello";
        }, executor).thenApplyAsync(s -> {
            logger.info(s + "world");
            return "hhh";
        }, executor);
        cf.thenRunAsync(() -> {
            logger.info("ddddd");
        });
        cf.thenRun(() -> {
            logger.info("ddddsd");
        });
        cf.thenRun(() -> {
            logger.info("ccccc"+Thread.currentThread().getName());
            logger.info("dddaewdd");
        });
        logger.info("cf.get()-----"+cf.get());
        CompletableFuture.runAsync(()->{
            logger.info("CompletableFuture.runAsync---------"+Thread.currentThread().getName());
        },executor);
        logger.info("bbbbbbbbbbbbbbbbb-----");
    }

}
