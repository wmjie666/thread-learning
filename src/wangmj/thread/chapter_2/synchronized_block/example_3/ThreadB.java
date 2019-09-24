package wangmj.thread.chapter_2.synchronized_block.example_3;

public class ThreadB extends Thread {

    private Task task;

    public ThreadB(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime2 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime2 = System.currentTimeMillis();
    }
}
