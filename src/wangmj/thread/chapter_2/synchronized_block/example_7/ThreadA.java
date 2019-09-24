package wangmj.thread.chapter_2.synchronized_block.example_7;

public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.a();
    }
}
