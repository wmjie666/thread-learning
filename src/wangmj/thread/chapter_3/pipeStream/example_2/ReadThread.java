package wangmj.thread.chapter_3.pipeStream.example_2;

import java.io.PipedReader;

public class ReadThread extends Thread {

    private ReadData read;
    private PipedReader input;

    public ReadThread(ReadData read, PipedReader input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        read.readMethod(input);
    }
}
