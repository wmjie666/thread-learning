package wangmj.thread.chapter_2.synchronized_block.example_6;

public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.setUsernamePassword("a", "aa");
    }
}
