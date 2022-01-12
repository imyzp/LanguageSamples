package com.yzp.javasamples1_8.thread.base.thread_variable.threadlocal_eg;

/**
 * 主线程设置的变量，控制子线程无法获取,只能取到已经初始化好的值
 */
public class ThreadLocalEg2 {
    private static ThreadLocal<String> secondNum = ThreadLocal.withInitial(() -> "aa");
    public static void main(String[] args) {
        secondNum.set("aachi");
        System.out.println("getNum: "+secondNum.get());

        // 启动子线程
        Thread thread = new ThreadLocalEg3.MyThread();
        thread.start();

    }
    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("只能获取到static的，无法获取父线程的值 "+secondNum.get());
        }
    }
}
