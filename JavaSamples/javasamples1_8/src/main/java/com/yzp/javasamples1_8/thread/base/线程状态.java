package com.yzp.javasamples1_8.thread.base;

/**
 * 线程状态测试：Thread.State
 */
public class 线程状态 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i=0;i<5;i++)
            {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("//////");
        });

        // 观察状态
        Thread.State state = thread.getState();
        // new
        System.out.println(state);

        thread.start();
        state = thread.getState();
        // run
        System.out.println(state);

        // 线程没有终止是，一直观察它状态
        while (state != Thread.State.TERMINATED){
            Thread.sleep(100);
            state=thread.getState();
            System.out.println(state);
        }


    }
}
