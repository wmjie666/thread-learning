package wangmj.thread.chapter_2.synchronized_method.example_5;

public class MyThread extends Thread {

    @Override
    public void run() {
        MyService myService = new MyService();
        myService.service1();
    }
}
