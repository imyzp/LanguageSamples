package com.yzp.javasamples1_8.thread.base;

/**
 * 线程优先级测试
 */
public class PriorityTest implements Runnable{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"---->"+Thread.currentThread().getPriority());

        PriorityTest priorityTest = new PriorityTest();

        Thread thread1 = new Thread(priorityTest);
        Thread thread2 = new Thread(priorityTest);
        Thread thread3 = new Thread(priorityTest);
        Thread thread4 = new Thread(priorityTest);
        Thread thread5 = new Thread(priorityTest);
        Thread thread6 = new Thread(priorityTest);

        // 设置线程优先级，在启动
        thread1.start();

        thread2.setPriority(1);
        thread2.start();

        thread3.setPriority(4);
        thread3.start();

        thread4.setPriority(Thread.MAX_PRIORITY);
        thread4.start();

        // 超过优先级取值范围报错
        thread5.setPriority(11);
        thread5.start();

        thread6.setPriority(-1);
        thread6.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"---->"+Thread.currentThread().getPriority());
    }
}
