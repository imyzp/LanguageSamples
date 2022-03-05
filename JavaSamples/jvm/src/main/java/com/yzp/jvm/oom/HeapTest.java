package com.yzp.jvm.oom;

import java.util.ArrayList;

/**
 * @ProjectName LanguageSamples
 * @Description 内存溢出测试,使用jvisualvm + 插件 visual gc 观察 堆里的老年代满后就会导致内存溢出
 * @Author yaozhenpeng
 * @Time 2022/3/5 19:37
 */
public class HeapTest {
    byte[] a = new byte[1024 * 100];//100KB

    public static void main(String[] args) throws InterruptedException {
        ArrayList<HeapTest> heapTests = new ArrayList<>();
        while (true){
            heapTests.add(new HeapTest());
            Thread.sleep(10);
        }
    }
}
