package com.yzp.javasamples1_8.thread.base.thread_variable.threadlocal_eg;

import org.junit.Test;

/**
 * 高并发、多线程下的使用
 */
public class ThreadLocalEg5_1 {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    public String getName() {
        return threadLocal.get();
    }
    public void setName(String name) {
        threadLocal.set(name);
    }
    public void removeName(){
        threadLocal.remove();
    }

    /**
     * ThreadLocal 已经解决了多线程之间数据隔离的问题
     * 原理： ThreadLocal 采用 "以空间换时间" 的方式，为每个线程都提供了一份变量的副本，从而实现同时访问而互不干扰，多线程中让每个线程之间的数据相互隔离
     */
    @Test
    public  void solveTwo() {
        ThreadLocalEg5_1 tmp = new ThreadLocalEg5_1();
        for (int i = 0; i < 4; i++) {
            Thread thread = new Thread(() -> {
                tmp.setName(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getName() +
                        "t 拿到数据：" + tmp.getName());
            });
            thread.setName("Thread-" + i);
            thread.start();
        }
    }
}
