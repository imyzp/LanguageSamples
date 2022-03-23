package com.yzp.javasamples1_8.thread.base.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExpThreadPool01 {
    public static void main(String[] args) {
        // 创建线程池服务
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        // 执行
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());

        // 关闭连接
        executorService.shutdown();
    }
}

class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
