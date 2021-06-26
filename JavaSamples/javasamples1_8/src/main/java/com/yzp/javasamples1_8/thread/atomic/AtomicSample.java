package com.yzp.javasamples1_8.thread.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicSample {
    public static AtomicInteger count = new AtomicInteger();

    public static void main(String[] args) {
        MyThread[] mythreadArray = new MyThread[100];
        for (int i = 0; i < 100; i++) {
            mythreadArray[i] = new MyThread();
        }

        for (int i = 0; i < 100; i++) {
            mythreadArray[i].start();
        }
        try {
            // 为了让前面的线程执行完
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("最后结果---" + count);
    }

    public static class MyThread extends Thread {

        private static void addCount() {
            for (int i = 0; i < 100; i++) {
                count.addAndGet(1);
            }
//            System.out.println("count=" + count);
        }

        @Override
        public void run() {
            addCount();
        }
    }
}
