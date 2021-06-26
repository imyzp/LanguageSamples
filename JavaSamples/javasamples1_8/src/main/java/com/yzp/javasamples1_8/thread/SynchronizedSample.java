package com.yzp.javasamples1_8.thread;

public class SynchronizedSample {
    public static void main(String[] args) {
        MyObject object = new MyObject();

        //线程A与线程B 持有的是同一个对象:object，
        ThreadA a = new ThreadA(object);
        ThreadB b = new ThreadB(object);
        a.start();
        b.start();
    }

    public static class MyObject {

        synchronized public void methodA() {
            //do something....
            try {
                Thread.sleep(3000);
                System.out.println("执行methodA");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        synchronized public void methodB() {
            //do some other thing
            System.out.println("执行 methodB");

        }

         public void methodC() {
            //do some other thing
            System.out.println("执行 methodC");

        }
    }

    public static class ThreadA extends Thread {

        private MyObject object;

        public ThreadA(MyObject object) {
            this.object = object;
        }

        @Override
        public void run() {
            object.methodA();
        }
    }

    public static class ThreadB extends Thread {

        private MyObject object;

        public ThreadB(MyObject object) {
            this.object = object;
        }

        @Override
        public void run() {
//            object.methodC();
            object.methodB();
        }
    }
}
