package com.yzp.javasamples1_8.thread.base;

import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 *  启动线程的三种方法
 *  方法一：类继承Thread,重写run方法，通过类实例启动线程
 *  方法二：类实现Runnable,实现run方法，根据类实例化Thread然后执行start方法
 *  方法三：新建一个Callable类，实现Callable接口，实现call方法，根据Callable类，新建FutureTask类，根据futureTask类新建Thread类，执行thredd类的start方法执行线程
 *  区别：
 *     第二种对比于第一种
 *      更适合多线程实行相同任务，线程池接受Runnable类型的任务，不接受Thread类型的线程
 *      避免了单继承的局限性
 *     第三种对比前两种
 *      call方法有返回值，可以通过get方法获取到返回值后再执行其他业务逻辑
 *
 */
public class 创建线程 {
    public static void main(String[] args) throws InterruptedException {
        // 方法一
        Thread myThread = new MyThread();
        myThread.start();
        Thread.sleep(500);
        // 方法二
        Thread runThread = new Thread(new MyRunnable(), "线程1");
        runThread.start();
        Thread.sleep(500);
        // 方法三
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
