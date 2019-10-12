package wangmj.thread.chapter_3.wait_notify.example_6;

public class NotifyThread extends Thread {

    private Object lock;

    public NotifyThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock){
//            lock.notify();
//            lock.notify();
//            lock.notify();
//            lock.notify();

            lock.notifyAll();  //唤醒所有线程
        }
    }
}
