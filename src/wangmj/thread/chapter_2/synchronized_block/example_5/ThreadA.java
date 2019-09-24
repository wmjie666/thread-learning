package wangmj.thread.chapter_2.synchronized_block.example_5;

public class ThreadA extends Thread {

    private ObjectService objectService;

    public ThreadA(ObjectService objectService) {
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethodA();
    }

}
