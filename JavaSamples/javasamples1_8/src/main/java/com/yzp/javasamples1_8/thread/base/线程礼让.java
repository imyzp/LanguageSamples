package com.yzp.javasamples1_8.thread.base;

/**
 * 【：让当前正在执行的线程暂停变成就绪状态，cpu重新调度
 */
public class 线程礼让 implements Runnable{
    public static void main(String[] args) {
        线程礼让 yieldTest = new 线程礼让();

        new Thread(yieldTest,"a").start();
        new Thread(yieldTest,"b").start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        // 礼让
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"线程停止执行");
    }
}
