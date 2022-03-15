package com.yzp.javasamples1_8.thread.base;

/**
 * (Join)待此线程执行完成后，再执行其他线程，其他线程阻塞
 */
public class JoinTest implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            System.out.println("线程vip来了"+i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // 启动我们的线程
        JoinTest joinTest = new JoinTest();
        Thread thread = new Thread(joinTest);
        thread.start();

        // 主线程
        for(int i=0;i<500;i++){
            if(i == 200){
                // 待此thread线程执行完成后，再执行main线程，main线程阻塞
                thread.join();//插队
            }
            System.out.println("main"+i);
        }
    }

}
