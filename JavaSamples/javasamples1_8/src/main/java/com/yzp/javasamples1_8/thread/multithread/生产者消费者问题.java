package com.yzp.javasamples1_8.thread.multithread;

import org.junit.Test;

import java.util.concurrent.LinkedBlockingQueue;

public class 生产者消费者问题 {
    @Test
    public  void test() throws InterruptedException {

        LinkedBlockingQueue<String> d = new LinkedBlockingQueue(10);
        Consumer consumer = new Consumer(d);
        new Thread(consumer).start();
        for(int i = 0; i<100; i++)
        {
            System.out.println("生产a"+i);
            d.put("a"+i);
        }
    }
    class Consumer implements Runnable{
        LinkedBlockingQueue<String> d;

        public Consumer(LinkedBlockingQueue<String> d) {
            this.d = d;
        }

        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(50000);
                    String take = d.take();
                    System.out.println("消费"+take);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
