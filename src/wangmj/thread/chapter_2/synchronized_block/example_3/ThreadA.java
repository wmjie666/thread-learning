package wangmj.thread.chapter_2.synchronized_block.example_3;

public class ThreadA extends Thread {

    private Task task;

    public ThreadA(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();
    }
}
