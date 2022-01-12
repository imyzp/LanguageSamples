package com.yzp.javasamples1_8.ascii;


/**
 * ASCII编码测试
 */
public class AsciiTest {
    public static void main(String[] args) {
        char[] chars = "user_name".toCharArray();
        chars[0]-=32;
        System.out.println(String.valueOf(chars));
    }

}
