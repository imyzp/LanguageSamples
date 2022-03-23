package com.yzp.javasamples1_8.thread.base.多线程变量.threadlocal_eg;

/**
 * 主线程设置的变量，控制子线程无法获取
 */
public class ThreadLocalEg1 {
    private static ThreadLocal<Integer> firstNum = new ThreadLocal<>();

    public static void main(String[] args) {
        System.out.println("getNum: "+firstNum.get());
        firstNum.set(11);
        firstNum.set(22);
        System.out.println("getNum: "+firstNum.get());
        // 启动子线程
        Thread thread = new ThreadLocalEg3.MyThread();
        thread.start();
    }
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("这种ThreadLocal是在主线程设置的，则子线程无法获取，是线程安全的"+firstNum.get());
        }
    }
}
