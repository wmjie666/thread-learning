package wangmj.thread.chapter_2.synchronized_block.example_7;

public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.b();
    }
}
