package com.yzp.javasamples1_8.thread.base.thread_variable.threadlocal_eg;

public class ThreadLocalEg4 {
    private static ThreadLocal<String> threadLocal = new InheritableThreadLocal<String>();

    public static void main(String[] args) throws InterruptedException {
        threadLocal.set("key");
        threadLocal.set("key");
        System.out.println("adfad");
//        Single instance = Single.getInstance();
//        MyThread myThread = new MyThread();
//        myThread.start();
//        MyThread myThread2 = new MyThread();
//        myThread2.start();

    }
    static class MyThread extends Thread{
        @Override
        public void run() {
            Single instance = Single.getInstance();
            try {
                instance.test();
            } catch (InterruptedException e) {

            }
        }
    }
    static class Single {
        private static Single instance;
        private static int apply;
        private Single(){}
        public static Single getInstance(){
            if(instance == null)
            {
                instance = new Single();
            }
            return instance;
        }

        /**
         * 模拟spring的controller
         */
        private void test() throws InterruptedException {
            System.out.println("test 开始"+apply++);
            threadLocal.set("key");
            System.out.println("test 处理业务逻辑");
            Thread.sleep(50000);
            threadLocal.remove();
            System.out.println("test 结束");
        }
    }
}
