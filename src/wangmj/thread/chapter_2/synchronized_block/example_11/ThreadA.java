package wangmj.thread.chapter_2.synchronized_block.example_11;

public class ThreadA extends Thread {

    private Service service;

    public ThreadA(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.print("AA");
//        service.print(new Object());
    }
}
