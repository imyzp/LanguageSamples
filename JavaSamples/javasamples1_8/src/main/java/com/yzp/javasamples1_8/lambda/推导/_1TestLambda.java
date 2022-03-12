package com.yzp.javasamples1_8.lambda.推导;

/**
 * 推导无参的lambda表达式
 */
public class _1TestLambda {
    public static void main(String[] args) {
        // 方式1
        Ilike like = new Like();
        like.lambda();
        // 方式2
        Ilike like2 = new Like2();
        like2.lambda();

        // 4 局部内部类
        class Like3 implements Ilike{
            @Override
            public void lambda() {
                System.out.println("i like lambda3");
            }
        }
        // 方式3
        Ilike like3 = new Like3();
        like3.lambda();

        // 5 匿名内部类，没有类的名称，必须借助接口或者父类
        Ilike like4 = new Ilike() {
            @Override
            public void lambda() {
                System.out.println("i like lambda4");

            }
        };
        // 方式4
        like4.lambda();

        // 6 用lambda简化
        Ilike like5 = () -> {
            System.out.println("i like lambda5");
        };
        // 方式5
        like5.lambda();
    }
    //3 静态内部类
    static class Like2 implements Ilike{
        @Override
        public void lambda() {
            System.out.println("i like lambda2");
        }
    }
}
