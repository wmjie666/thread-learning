package wangmj.thread.chapter_2.synchronized_block.example_10;

public class ThreadC extends Thread {

    private Service service;

    public ThreadC(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.printC();
    }
}
