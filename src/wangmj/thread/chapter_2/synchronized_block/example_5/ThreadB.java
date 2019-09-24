package wangmj.thread.chapter_2.synchronized_block.example_5;

public class ThreadB extends Thread {

    private ObjectService objectService;

    public ThreadB(ObjectService objectService) {
        this.objectService = objectService;
    }

    @Override
    public void run() {
        super.run();
        objectService.serviceMethodB();
    }
}
