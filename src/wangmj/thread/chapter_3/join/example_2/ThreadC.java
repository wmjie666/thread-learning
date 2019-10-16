package wangmj.thread.chapter_3.join.example_2;

public class ThreadC extends Thread {

    private ThreadB threadB;

    public ThreadC(ThreadB threadB) {
        this.threadB = threadB;
    }

    @Override
    public void run() {
        System.out.println("线程C中断线程B");
        threadB.interrupt();
    }

}
