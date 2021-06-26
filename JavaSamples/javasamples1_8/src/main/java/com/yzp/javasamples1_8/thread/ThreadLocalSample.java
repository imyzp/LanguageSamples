package com.yzp.javasamples1_8.thread;

public class ThreadLocalSample {
    private static ThreadLocal<Integer> firstNum = new ThreadLocal<>();
    private static ThreadLocal<String> secondNum = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return "aa";
        }
    };
    private static ThreadLocal<Integer> thirdNum = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 31;
        }
    };
    private static ThreadLocal<String> forthNum = new InheritableThreadLocal<String>();


    public static void main(String[] args) {
        System.out.println("getNum: "+firstNum.get());
        firstNum.set(11);
        System.out.println("getNum: "+firstNum.get());
        secondNum.set("aachi");
        System.out.println("getNum: "+secondNum.get());
        System.out.println("getNum: "+thirdNum.get());

        forthNum.set("主线程创建的实例对象InheritableThreadLocal，通过这个子线程是可以获取的到的");
        System.out.println("getNum: "+forthNum.get());
        // 启动子线程
        Thread thread = new MyThread();
        thread.start();

    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println(forthNum.get());
            forthNum.set("子线程对InheritableThreadLocal重新赋值");
            System.out.println(forthNum.get());

            System.out.println("这种ThreadLocal是在主线程设置的，则子线程无法获取，是线程安全的"+firstNum.get());
            System.out.println("只能获取到static的，无法获取父线程的值 "+secondNum.get());
        }
    }
}
