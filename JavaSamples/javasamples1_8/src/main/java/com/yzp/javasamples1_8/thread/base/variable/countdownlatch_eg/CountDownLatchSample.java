package com.yzp.javasamples1_8.thread.base.variable.countdownlatch_eg;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchSample extends Thread {
    CountDownLatch countDownLatch = new CountDownLatch(1);

    public static void main(String[] args) {
        Thread th = new CountDownLatchSample();
        Thread t1 = new Thread(th, "Mythread");
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }

    public void run() {
        Mythread1 th2 = new Mythread1();
        Thread t2 = new Thread(th2, "Mythread1");
        t2.start();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.currentThread().getName());
    }

    class Mythread1 extends Thread {
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.currentThread().getName());
            countDownLatch.countDown();
        }

    }
}
