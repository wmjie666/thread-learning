package wangmj.thread.chapter_1.priority_thread.inherit;


public class PriorityThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("priorityThread2:  priority=" + this.getPriority());
        PriorityThread1 priorityThread1 = new PriorityThread1();
        priorityThread1.start();
    }
}
