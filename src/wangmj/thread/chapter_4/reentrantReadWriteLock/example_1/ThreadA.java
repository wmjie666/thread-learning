package wangmj.thread.chapter_4.reentrantReadWriteLock.example_1;

public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }

}
