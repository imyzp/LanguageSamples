package com.yzp.javasamples1_8.thread.base.variable.threadlocal_eg;

import org.junit.Test;

/**
 * 高并发、多线程下的使用
 */
public class ThreadLocalEg5 {

    private String name;

    /**
     *
     * 多线程间共使用tmp变量，造成如下现象：
     * Thread-0t 拿到数据：Thread-0
     * Thread-1t 拿到数据：Thread-1
     * Thread-2t 拿到数据：Thread-3
     * Thread-3t 拿到数据：Thread-3
     */
    @Test
    public  void test() {
        ThreadLocalEg5 tmp = new ThreadLocalEg5();
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

    /**
     * 使用 synchronized 解决了问题，但是 synchronized 常用于多线程数据共享的问题，而非多线程数据隔离的问题。synchronized属于重量级锁，比较影响性能
     * 原理：同步机制采用 "以时间换空间" 的方式，只提供了一份变量，让不同线程排队访问，多个线程之间同步访问资源
     */
    @Test
    public  void solveOne() {
        ThreadLocalEg5 tmp = new ThreadLocalEg5();
        for (int i = 0; i < 4; i++) {
            Thread thread = new Thread(() -> {
                synchronized (tmp) {
                    tmp.setName(Thread.currentThread().getName());
                    System.out.println(Thread.currentThread().getName()
                            + "t" + tmp.getName());
                }
            });
            thread.setName("Thread-" + i);
            thread.start();
        }
    }

    public String getName() {
        return name;
    }

    public ThreadLocalEg5 setName(String name) {
        this.name = name;
        return this;
    }
}
