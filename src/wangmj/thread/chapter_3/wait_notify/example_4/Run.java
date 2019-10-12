package wangmj.thread.chapter_3.wait_notify.example_4;

/**
 * wait()执行后会立刻释放锁，同时进入等待状态
 * notify()执行后不立刻释放锁，而是等代码块执行完之后，再释放锁。如果发出notify()操作时，并没有处于等待状态的线程，则该通知会被忽略
 *
 * wait()方法使调用该方法的线程释放共享资源的锁，然后从运行状态退出，进入等待队列，直到被再次唤醒
 * notify()方法可以随机唤醒等待队列中等待同一个共享资源的一个线程，并使该线程退出等待队列，进入可运行状态。即notify()仅通知一个线程
 * notifyAll()方法可以使所有正在等待队列中等待同一共享资源的全部线程从等待状态退出，进入可运行状态。此时，优先级最高的线程先执行，也可能是随机执行。
 */
public class Run {
    public static void main(String[] args){
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            ThreadB b = new ThreadB(lock);
            b.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
