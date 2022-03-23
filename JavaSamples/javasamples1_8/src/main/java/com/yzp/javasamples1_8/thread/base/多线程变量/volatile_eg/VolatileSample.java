package com.yzp.javasamples1_8.thread.base.多线程变量.volatile_eg;

public class VolatileSample {
    public static void main(String[] args) {
        try {
            RunThread thread = new RunThread();
            thread.start();
            Thread.sleep(1000);
            thread.setRunning(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static class RunThread extends Thread {

        private volatile boolean isRunning = true;

        public boolean isRunning() {

            return isRunning;
        }

        public void setRunning(boolean isRunning) {
            this.isRunning = isRunning;
        }

        @Override
        public void run() {
            System.out.println("进入到run方法中了");
            while (isRunning == true) {
            }
            System.out.println("线程执行完成了");
        }
    }
}
