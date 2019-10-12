package wangmj.thread.chapter_3.wait_notify.example_6;

public class MyThread extends Thread {

    private Object lock;

    public MyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        Service service = new Service();
        service.testMethod(lock);
    }

}
