package wangmj.thread.chapter_3.wait_notify.example_6;

/**
 * notify()方法一次只随机通知一个线程进行唤醒，当多次调用notify()方法时，会随机唤醒多个线程
 *
 * notifyAll()方法会唤醒所有线程
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        MyThread a = new MyThread(lock);
        a.setName("A");
        a.start();

        MyThread b = new MyThread(lock);
        b.setName("B");
        b.start();

        MyThread c = new MyThread(lock);
        c.setName("C");
        c.start();

        Thread.sleep(1000);

        NotifyThread notifyThread = new NotifyThread(lock);
        notifyThread.start();
    }
}
