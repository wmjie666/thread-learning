package wangmj.thread.chapter_4.otherMethod.getWaitQueueLength;

/**
 * lock.getWaitQueueLength(condition)方法：返回 等待与此锁相关的给定条件的condition的线程数。即等待池中condition条件的线程数
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.waitMethod();
            }
        };
        Thread[] threads = new Thread[10];
        for (int i=0; i<10; i++){
            threads[i] = new Thread(runnable);
        }
        for (int i=0; i<10; i++){
            threads[i].start();
        }
        Thread.sleep(2000);
        service.notifyMethod();
    }
}
