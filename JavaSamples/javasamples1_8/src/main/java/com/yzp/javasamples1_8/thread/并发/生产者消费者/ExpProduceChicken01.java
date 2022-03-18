package com.yzp.javasamples1_8.thread.并发.生产者消费者;

/**
 * 管程法：notifyAll、wait
 * 生产者消费者互相通知：生产者生产产品放到容器中，达到n只就暂停生产，消费者看到容器中有产品就开始消费
 */
public class ExpProduceChicken01 {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();

        new Productor(container).start();
        new Consumer(container).start();
    }
}
// 生产者
class Productor extends Thread{
    SynContainer container;
    public Productor(SynContainer container){
        this.container=container;
    }
    // 生产
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            container.push(new Chicken(i));
            System.out.println("生产了"+i+"只鸡");
        }
    }
}
// 消费者
class Consumer extends Thread{
    SynContainer container;
    public Consumer(SynContainer container){
        this.container=container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("消费了-->"+container.pop().id+"只鸡");
        }
    }
}
// 产品
class Chicken{
    // 产品编号
    int id;

    public Chicken(int id) {
        this.id = id;
    }
}
// 缓冲区
class SynContainer{
    // 需要一个容器大小
    Chicken[] chickens = new Chicken[10];
    // 容器计数器
    int count =0;

    // 生产者放入产品
    public synchronized void push(Chicken chicken){
        // 如果容器满了，就需要等待消费者消费
        if(count==chickens.length){
            // 通知消费者消费，生产等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 如果没有满，我们就需要丢入产品
        chickens[count]=chicken;
        count++;

        // 可以通知消费者消费了
        this.notifyAll();
    }
    // 消费者消费产品
    public synchronized Chicken pop(){
        // 判断能否消费
        if(count==0){
            // 等待生产者生产，消费者等待
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 如果可以消费
        count--;
        Chicken chicken = chickens[count];

        // 吃完了，通知生产者生产
        this.notifyAll();
        return chicken;
    }
}