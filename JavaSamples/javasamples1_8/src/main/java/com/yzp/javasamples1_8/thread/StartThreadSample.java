package com.yzp.javasamples1_8.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class StartThreadSample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("启动线程的三种方法");
        Thread myThread = new MyThread();
        myThread.start();

        Thread.sleep(500);
        new Thread(new MyRunnable(),"线程1").start();

        Thread.sleep(500);
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> integerFutureTask = new FutureTask<>(myCallable);
        new Thread(integerFutureTask,"三、自定义类实现Callable，根据此创建FutureTask对象，Thread根据FutureTask对象创建线程类调用start()方法").start();
        try {
            System.out.println("线程的返回值"+integerFutureTask.get());
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("一、自定义类继承Thread 重写 run 方法，调用start()方法");
        }
    }
    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("二、自定义类实现 Runnable，重写 run 方法，Thread依此创建线程类调用start()方法");
        }
    }
    static class MyCallable implements Callable<Integer>{
        @Override
        public Integer call() throws Exception {
            int i = 0;
            for(;i<100;i++)
            {
                System.out.println(Thread.currentThread().getName()+"  "+i);
            }
            return i;
        }
    }
}
