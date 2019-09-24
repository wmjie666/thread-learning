package wangmj.thread.chapter_2.synchronized_block.example_10;

public class ThreadB extends Thread {

    @Override
    public void run() {
        Service.printB();
    }
}
