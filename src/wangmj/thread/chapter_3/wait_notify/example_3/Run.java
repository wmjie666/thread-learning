package wangmj.thread.chapter_3.wait_notify.example_3;

/**
 *  在执行notify()方法后，当前线程并不会立刻释放该对象锁，而是要等到同步代码块或同步方法执行完毕，才会释放对象锁，此时，wait()状态的线程才可以竞争获得锁
 *  当第一个wait()的线程竞争到了notify()释放的锁，并且该wait()线程也执行完了，此时，它会释放对象锁，但是如果它没有调用notify()方法，则其他wait()该对象锁的线程由于没有得到notify()通知，会一直处于等待状态
 *
 *  wait()是当前线程停止，notify()唤醒等待该对象锁的其中一个wait()线程继续运行
 */
public class Run {
    public static void main(String[] args){
        try {
            Object lock = new Object();
            MyThreadA threadA = new MyThreadA(lock);
            threadA.start();
            Thread.sleep(3000);
            MyThreadB threadB = new MyThreadB(lock);
            threadB.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
