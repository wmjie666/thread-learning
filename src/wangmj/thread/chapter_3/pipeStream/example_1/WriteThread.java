package wangmj.thread.chapter_3.pipeStream.example_1;

import java.io.PipedOutputStream;

public class WriteThread extends Thread {

    private WriteData writeData;
    private PipedOutputStream output;

    public WriteThread(WriteData writeData, PipedOutputStream output) {
        this.writeData = writeData;
        this.output = output;
    }

    @Override
    public void run() {
        writeData.writeMethod(output);
    }

}
