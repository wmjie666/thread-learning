package wangmj.thread.chapter_1.priority_thread.inherit;

/**
 * 线程优先级1-10,值越大优先级越高.
 * 线程优先级具有继承性,A线程启动B线程,则B线程的优先级和A一样
 */
public class Main {
    public static void main(String[] args){
        System.out.println("main thread priority=" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);   //全部继承main线程的优先级
        System.out.println("main thread priority=" + Thread.currentThread().getPriority());
        PriorityThread2 priorityThread2 = new PriorityThread2();
        priorityThread2.start();
    }
}
