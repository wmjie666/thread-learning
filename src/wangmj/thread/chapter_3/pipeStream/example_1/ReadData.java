package wangmj.thread.chapter_3.pipeStream.example_1;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReadData {

    public void readMethod(PipedInputStream input){
        try {
            System.out.println("read: ");
            byte[] byteArray = new byte[20];
            int readLength = input.read(byteArray);   //当input中没有数据可读时，处于阻塞状态，直到由数据可读，一次读取byteArray长度的内容
            while (readLength != -1){
                String newData = new String(byteArray, 0, readLength);
                System.out.println(newData);
                readLength = input.read(byteArray);
            }
            System.out.println();
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
