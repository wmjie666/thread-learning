package wangmj.thread.chapter_2.synchronized_method.example_7;

public class MyThread extends Thread {

    private Service service;

    public MyThread(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
