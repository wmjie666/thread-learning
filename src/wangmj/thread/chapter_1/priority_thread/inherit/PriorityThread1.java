package wangmj.thread.chapter_1.priority_thread.inherit;


public class PriorityThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("priorityThread1:  priority=" + this.getPriority());
    }

}
