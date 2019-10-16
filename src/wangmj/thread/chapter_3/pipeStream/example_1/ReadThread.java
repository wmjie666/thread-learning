package wangmj.thread.chapter_3.pipeStream.example_1;

import java.io.PipedInputStream;

public class ReadThread extends Thread {

    private ReadData readData;
    private PipedInputStream input;

    public ReadThread(ReadData readData, PipedInputStream input) {
        this.readData = readData;
        this.input = input;
    }

    @Override
    public void run() {
        readData.readMethod(input);
    }

}
