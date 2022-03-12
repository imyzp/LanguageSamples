package com.yzp.javasamples1_8.thread.并发.买票;

/**
 * 买火车票
 * 问题：多个线程操作同一资源的情况下，不同人获取到了同一张票，造成数据紊乱
 */
public class ExpTicketProblem01 implements Runnable{
    private int ticketNums = 10;
    @Override
    public void run() {
        while(true){
            if(ticketNums<=0)
            {
                break;
            }
            // 模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketNums--+"票");
        }
    }

    public static void main(String[] args) {
        ExpTicketProblem01 expTicket01 = new ExpTicketProblem01();
        new Thread(expTicket01,"小明").start();
        new Thread(expTicket01,"老师").start();
        new Thread(expTicket01,"黄牛党").start();
    }
}
