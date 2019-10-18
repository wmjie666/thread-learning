package wangmj.thread.chapter_4.otherMethod.hasQueuedThread;

/**
 * lock.hasQueuedThread(Thread)：查询指定线程是否正在等待获取此锁
 * lock.hasQueuedThreads()：查询是否有线程正在等待获取此锁
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
        Thread t1 = new Thread(runnable);
        t1.start();
        Thread.sleep(500);
        Thread t2 = new Thread(runnable);
        t2.start();
        Thread.sleep(500);
        System.out.println(service.lock.hasQueuedThread(t1));
        System.out.println(service.lock.hasQueuedThread(t2));
        System.out.println(service.lock.hasQueuedThreads());
    }
}
