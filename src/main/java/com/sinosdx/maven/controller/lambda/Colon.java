package com.sinosdx.maven.controller.lambda;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Date 2020/12/1 11:15
 * @Author gongzhenyu
 * @Describe 测试lamdba 冒号用法 8
 */
public class Colon {


    /**
     * @Author gongzhenyu
     * @Date 2020/12/1 13:45
     * @Describe 引用静态方法
     */
    @Test
    public void test() {
        List<String> list = Arrays.asList("a", "b", "c", "d");
        list.forEach(Colon::print);

        //list.forEach((s)->Colon.print(s));

    }


    /**
     * @Author gongzhenyu
     * @Date 2020/12/1 14:28
     * @Describe 引用对象实例方法
     */
    @Test
    public void test2() {
        List<String> list = Arrays.asList("a", "b", "c", "e");
        list.forEach(new Colon()::print2);
    }

    /**
     * @Author gongzhenyu
     * @Date 2020/12/1 14:28
     * @Describe 引用对象实例方法
     */
    @Test
    public void test3() {
        List<String> list = Arrays.asList("a", "b", "c", "e");
        list.sort(String::compareToIgnoreCase);

    }

    public void test4(String id){
        System.out.println(id);
    }

    private static void print(String s) {
        System.out.println(s);
    }

    public void print2(String s) {
        System.out.println(s);
    }
}
