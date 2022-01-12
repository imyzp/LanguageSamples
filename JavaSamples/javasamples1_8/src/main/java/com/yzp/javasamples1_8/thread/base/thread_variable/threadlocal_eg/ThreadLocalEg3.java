package com.yzp.javasamples1_8.thread.base.thread_variable.threadlocal_eg;

/**
 * 控制子线程可以获取主线程设置的值，子线程修改值，主线程的值不变
 */
public class ThreadLocalEg3 {

    private static ThreadLocal<String> forthNum = new InheritableThreadLocal<String>();


    public static void main(String[] args) throws InterruptedException {
        forthNum.set("主线程创建的实例对象InheritableThreadLocal，通过这个子线程是可以获取的到的");
        System.out.println("main--getNum: "+forthNum.get());
        // 启动子线程
        Thread thread = new MyThread();
        thread.start();
        Thread.sleep(10_000);
        System.out.println("main--getNum: "+forthNum.get());

    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println(forthNum.get());
            forthNum.set("子线程对InheritableThreadLocal重新赋值");
            System.out.println(forthNum.get());
        }
    }
}
