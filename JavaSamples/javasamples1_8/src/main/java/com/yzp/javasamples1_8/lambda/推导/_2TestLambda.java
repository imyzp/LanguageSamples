package com.yzp.javasamples1_8.lambda.推导;

public class _2TestLambda {
    public static void main(String[] args) {
        // 根据无参lambda的推导，可推导出
        Ilove love = (int a)->{
            System.out.println("i love you-->"+a);
        };
        love.love(520);

        // 简化参数类型
        Ilove love1 = (a) -> {
            System.out.println("i love you-->"+a);
        };
        love1.love(521);

        // 简化括号
        Ilove love2 = a -> {
            System.out.println("i love you-->"+a);
        };
        love2.love(522);

        // 去掉花括号
        // 只有一行代码的情况下才能简化为一行，如果有多行需要用大括号包裹
        Ilove love3 = a -> System.out.println("i love you-->"+a);
        love3.love(523);
    }
}
