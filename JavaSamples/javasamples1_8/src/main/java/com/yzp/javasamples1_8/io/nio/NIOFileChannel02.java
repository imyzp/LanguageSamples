package com.yzp.javasamples1_8.io.nio;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 1. 使用前面学习后的 `ByteBuffer`（缓冲）和 `FileChannel`（通道），将 `file01.txt` 中的数据读入到程序，并显示在控制台屏幕
 * 2. 假定文件已经存在
 * 3. 代码演示
 */
public class NIOFileChannel02 {
    public static void main(String[] args) throws Exception {

        //创建文件的输入流
        File file = new File("F:\\yzp\\BaiduNetdiskWorkspace\\node\\mySource\\工作文件\\20210628\\file01.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        //通过 fileInputStream 获取对应的 FileChannel -> 实际类型 FileChannelImpl
        FileChannel fileChannel = fileInputStream.getChannel();

        //创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)file.length());

        //将通道的数据读入到 Buffer
        fileChannel.read(byteBuffer);

        //将 byteBuffer 的字节数据转成 String
        System.out.println(new String(byteBuffer.array()));
        fileInputStream.close();
    }
}
