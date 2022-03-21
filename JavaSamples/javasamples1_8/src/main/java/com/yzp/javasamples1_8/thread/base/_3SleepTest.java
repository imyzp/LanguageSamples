package com.yzp.javasamples1_8.thread.base;

import java.util.stream.Stream;

public class _3SleepTest {
    private final static Object lock = new Object();

    public static void main(String[] args) {
        Stream.of("线程1","线程2").forEach(n -> new Thread(n){
            @Override
            public void run() {
//                SleepSample.testSleep();
                _3SleepTest.testSleep2();
            }
        }.start());

    }

    /**
     * 在sleep结束后其它线程才会被执行
     */
    private static void testSleep(){
        synchronized (lock){
            try {
                System.out.println(Thread.currentThread().getName()+"正在执行");
                Thread.sleep(10_000);
                System.out.println(Thread.currentThread().getName()+"休眠结束");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 在sleep中其它线程也会执行，与 com.yzp.xmind.java1_8.thread.WaitSample#testWait() 方法一致
     */
    private static void testSleep2() {
        try {
            System.out.println(Thread.currentThread().getName() + "正在执行");
            Thread.sleep(10_000);
            System.out.println(Thread.currentThread().getName() + "休眠结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
