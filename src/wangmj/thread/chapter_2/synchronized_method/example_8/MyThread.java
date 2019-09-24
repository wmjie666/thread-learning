package wangmj.thread.chapter_2.synchronized_method.example_8;

public class MyThread extends Thread {

    private Sub sub;

    public MyThread(Sub sub) {
        this.sub = sub;
    }

    @Override
    public void run() {
        sub.serviceMethod();
    }
}
