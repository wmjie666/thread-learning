package wangmj.thread.chapter_2.synchronized_block.example_9;

public class ThreadB extends Thread {

    private MyObject myObject;

    public ThreadB(MyObject myObject) {
        this.myObject = myObject;
    }

    @Override
    public void run() {
        super.run();
        myObject.speedPrintString();
    }
}
