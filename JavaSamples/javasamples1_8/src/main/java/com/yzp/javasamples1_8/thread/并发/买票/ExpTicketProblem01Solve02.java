package com.yzp.javasamples1_8.thread.并发.买票;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 买火车票
 * 问题：多个线程操作同一资源的情况下，不同人获取到了同一张票，造成数据紊乱
 * 解决：增加ReentrantLock锁，手动加锁和释放锁
 */
public class ExpTicketProblem01Solve02 implements Runnable{
    private final ReentrantLock lock = new ReentrantLock();
    private int ticketNums = 10;
    boolean flag = true;

    public static void main(String[] args) {
        ExpTicketProblem01Solve02 expTicket01 = new ExpTicketProblem01Solve02();
        new Thread(expTicket01,"小明").start();
        new Thread(expTicket01,"老师").start();
        new Thread(expTicket01,"黄牛党").start();
    }

    @Override
    public void run() {
        while(flag){
            buy();
        }
    }
    //
    private  void buy() {
        try{
            // 加锁
            lock.lock();
            if(ticketNums<=0)
            {
                flag = false;
                return;
            }
            // 模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums--+"票");
        }finally {
            lock.unlock();
        }

    }

}
