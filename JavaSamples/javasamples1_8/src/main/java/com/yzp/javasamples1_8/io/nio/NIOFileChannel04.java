package com.yzp.javasamples1_8.io.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * 1. 实例要求：
 * 2. 使用 `FileChannel`（通道）和方法 `transferFrom`，完成文件的拷贝
 * 3. 拷贝一张图片
 * 4. 代码演示
 */
public class NIOFileChannel04 {
    public static void main(String[] args) throws Exception {

        //创建相关流
        FileInputStream fileInputStream = new FileInputStream("F:\\yzp\\BaiduNetdiskWorkspace\\node\\mySource\\工作文件\\20210629\\source.png");
        FileOutputStream fileOutputStream = new FileOutputStream("F:\\yzp\\BaiduNetdiskWorkspace\\node\\mySource\\工作文件\\20210629\\des.png");

        //获取各个流对应的 FileChannel
        FileChannel sourceCh = fileInputStream.getChannel();
        FileChannel destCh = fileOutputStream.getChannel();

        //使用 transferForm 完成拷贝
        destCh.transferFrom(sourceCh, 0, sourceCh.size());

        //关闭相关通道和流
        sourceCh.close();
        destCh.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
