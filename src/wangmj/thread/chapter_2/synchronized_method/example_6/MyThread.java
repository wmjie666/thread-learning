package wangmj.thread.chapter_2.synchronized_method.example_6;

public class MyThread extends Thread {

    @Override
    public void run() {
        Sub sub = new Sub();
        sub.operateSubMethod();
    }

}
