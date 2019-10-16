package wangmj.thread.chapter_3.pipeStream.example_1;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管道流(pipeStream)是一种特殊的流，用于在不同线程间直接传送数据。一个线程发送数据到输出管道，另一个线程从输入管道中读数据。
 *
 * 用于线程间通信的管道流类：
 *     PipedInputStream 和 PipedOutputStream   字节流
 *     PipedReader 和 PipedWriter              字符流
 */
public class Run {
    public static void main(String[] args){
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();

            //这两行代码都是使两个Stream之间产生通信
            inputStream.connect(outputStream);
//            outputStream.connect(inputStream);

            ReadThread readThread = new ReadThread(readData, inputStream);
            readThread.start();

            Thread.sleep(2000);

            WriteThread writeThread = new WriteThread(writeData, outputStream);
            writeThread.start();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
