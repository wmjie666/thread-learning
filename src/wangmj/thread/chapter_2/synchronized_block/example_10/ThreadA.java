package wangmj.thread.chapter_2.synchronized_block.example_10;

public class ThreadA extends Thread {

    @Override
    public void run() {
        Service.printA();
    }
}
