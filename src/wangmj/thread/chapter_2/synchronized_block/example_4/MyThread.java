package wangmj.thread.chapter_2.synchronized_block.example_4;

public class MyThread extends Thread {

    private Task task;

    public MyThread(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        super.run();
        task.doLongTask();
    }
}
