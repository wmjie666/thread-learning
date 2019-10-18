package wangmj.thread.chapter_4.reentrantReadWriteLock.example_3;

public class ThreadB extends Thread {

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
    
}
