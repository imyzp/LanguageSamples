package com.yzp.javasamples1_8.jvm;

public class MemorySample {
    static Integer a = 127;
    static Integer b = 128;

    public static void main(String[] args) {
        System.out.println(a==b);
    }
}
