package com.yzp.javasamples1_8.thread.并发.取钱;

/**
 * 银行取钱
 * 问题：多个人从同一个账户取钱，造成一个账户钱被取成负数
 */
public class ExpBankProblem01 {
    public static void main(String[] args) {
        Account account = new Account(100, "结婚基金");
        Drawing you = new Drawing(account,50,"你");
        Drawing girlFriend = new Drawing(account,100,"girlFriend");

        you.start();
        girlFriend.start();
    }
}
// 账户
class Account {
    // 余额
    int money;
    // 卡名
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
// 银行模拟取款
class Drawing extends Thread{
    // 账户
    Account account;
    // 取了多少钱
    int drawingMoney;
    // 现在手里有多少钱
    int nowMoney;

    public Drawing(Account account, int drawingMoney, String name) {
        super(name);
        this.account=account;
        this.drawingMoney=drawingMoney;
    }


    @Override
    public void run() {
        // 判断有没有钱
        if(account.money-drawingMoney<0){
            System.out.println(Thread.currentThread().getName()+"钱不够了，取不了");
            return;
        }

        // 模拟延时，放大事情的问题发生概率
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        // 卡内余额 = 余额 - 取得钱
        account.money=account.money-drawingMoney;
        // 手里的钱
        nowMoney = nowMoney + drawingMoney;

        System.out.println(account.name+"余额为："+account.money);
        System.out.println("手里钱："+nowMoney);
    }
}
