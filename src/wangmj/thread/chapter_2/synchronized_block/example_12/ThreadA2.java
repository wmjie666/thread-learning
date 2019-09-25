package wangmj.thread.chapter_2.synchronized_block.example_12;

public class ThreadA2 extends Thread{

    private Service2 service2;

    public ThreadA2(Service2 service2) {
        this.service2 = service2;
    }

    @Override
    public void run() {
        service2.methodA();
    }
}
