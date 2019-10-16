package wangmj.thread.chapter_3.pipeStream.example_2;

import java.io.PipedReader;
import java.io.PipedWriter;

/**
 * 两个线程通过管道流进行字符数据传输
 */
public class Run {

    public static void main(String[] args){
        try {
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedReader inputStream = new PipedReader();
            PipedWriter outputStream = new PipedWriter();

//            inputStream.connect(outputStream);
            outputStream.connect(inputStream);

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
