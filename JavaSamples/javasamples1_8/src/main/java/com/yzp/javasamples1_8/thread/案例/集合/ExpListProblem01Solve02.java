package com.yzp.javasamples1_8.thread.案例.集合;

import java.util.concurrent.CopyOnWriteArrayList;
/**
 * 不安全的集合
 * 问题：多个线程往集合中添加数据，导致往同一个位置添加了元素，结果元素变少
 * 解决：使用juc包下的集合CopyOnWriteArrayList，保证线程安全
 */
public class ExpListProblem01Solve02 {
    public static void main(String[] args) {
        // 线程安全的集合
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
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
