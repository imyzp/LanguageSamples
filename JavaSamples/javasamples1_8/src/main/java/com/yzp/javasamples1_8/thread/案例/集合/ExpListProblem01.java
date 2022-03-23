package com.yzp.javasamples1_8.thread.案例.集合;

import java.util.ArrayList;
import java.util.List;

/**
 * 不安全的集合
 * 问题：多个线程往集合中添加数据，导致往同一个位置添加了元素，结果元素变少
 */
public class ExpListProblem01 {
    public static void main(String[] args) {
        // 线程不安全的集合
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
