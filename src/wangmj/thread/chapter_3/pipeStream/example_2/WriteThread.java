package wangmj.thread.chapter_3.pipeStream.example_2;

import java.io.PipedWriter;

public class WriteThread extends Thread {

    private WriteData writeData;
    private PipedWriter out;

    public WriteThread(WriteData writeData, PipedWriter out) {
        this.writeData = writeData;
        this.out = out;
    }

    @Override
    public void run() {
        writeData.writeMethod(out);
    }

}
