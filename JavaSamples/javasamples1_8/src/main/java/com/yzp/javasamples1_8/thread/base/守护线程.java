package com.yzp.javasamples1_8.thread.base;

/**
 * 测试守护线程：
 *  daemon 默认是false表示用户线程，正常的线程都是用户线程
 *         设置true表示守护线程。
 *  虚拟机必须等待用户线程执行完毕，不用等待守护线程执行完，用户线程执行完虚拟机停止，守护线程随着虚拟机停止而停止
 */
public class 守护线程 {
    public static void main(String[] args) {
        God god = new God();
        You you = new You();

        Thread thread = new Thread(god);
        // 默认是false表示用户线程，正常的线程都是用户线程
        thread.setDaemon(true);
        // 守护线程启动
        thread.start();

        // 用户线程启动
        Thread thread1 = new Thread(you);
        thread1.start();
    }
}
// 上帝
class God implements Runnable{
    @Override
    public void run() {
        while (true)
        {
            System.out.println("上帝保佑着你");
        }
    }
}
// 你
class You implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 36500; i++) {
            System.out.println("你一生都开心的活着");
        }
        System.out.println("======goodbye word !======");
    }
}
