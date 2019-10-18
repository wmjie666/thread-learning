package wangmj.thread.chapter_4.otherMethod.hasWaiters;

/**
 * lock.hasWaiters(condition)：查询是否有线程正在等待与此锁有关的condition，即等待池中是否有线程等待与此锁有关的condition
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
