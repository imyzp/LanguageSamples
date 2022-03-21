package com.yzp.javasamples1_8.thread.base;

import java.util.stream.Stream;

public class _2WaitTest {
    private final static Object lock = new Object();

    public static void main(String[] args) {
        Stream.of("线程1","线程2").forEach(n -> new Thread(n){
            @Override
            public void run() {
//                WaitSample.testWait();
//                WaitSample.testWait2();
            }
        }.start());

        // 测试锁对象
        new Thread() {
            public void run() {
                testWait3();
            }
        }.start();
        //，解锁对象
        new Thread(){
            public void run(){
                notifyWait();
            }
        }.start();

    }

    /**
     * 还在wait中，其它线程也可以进入
     */
    private static void testWait(){
        synchronized (lock){
            try {
                System.out.println(Thread.currentThread().getName()+"正在执行");
                lock.wait(10_000);
                System.out.println(Thread.currentThread().getName()+"wait结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 会报错，wait一定要配置synchronized，也就是锁住对象后才能使用
     */
    private static void testWait2() {
        try {
            System.out.println(Thread.currentThread().getName() + "正在执行");
            lock.wait(10_000);
            System.out.println(Thread.currentThread().getName() + "wait结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * wait()不指定时间，直到被唤醒
     */
    private static void testWait3(){
        synchronized(lock){
            try {
                System.out.println("一直在等待中。。。");
                lock.wait();
                System.out.println("被唤醒了");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 唤醒被锁的对象
     */
    private static void notifyWait(){
        synchronized(lock){
            try {
                Thread.sleep(5_000);
                lock.notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
