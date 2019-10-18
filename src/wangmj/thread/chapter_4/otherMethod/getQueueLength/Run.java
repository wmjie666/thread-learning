package wangmj.thread.chapter_4.otherMethod.getQueueLength;

/**
 * java中每个对象都有两个池： 锁池、等待池
 * 锁池：如果一个线程要进入synchronized代码块或者执行lock()后的代码，则需要获得对象锁，但是当对象锁被其他线程获得，则当前线程会进入该对象的锁池中。在锁池中的线程都会取竞争该对象锁
 * 等待池：如果一个线程执行了Object.wait()方法或者Condition.await()方法，该线程就会释放所持有的对象锁，并进入该对象的等待池。等待池中的线程不会去竞争对象锁，而是等待被唤醒，当被唤醒后，才进入锁池，可以竞争对象锁
 *
 * lock.getQueueLength()方法：返回正在等待该对象锁 的线程个数，即锁池中的线程个数
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {

        final Service service = new Service();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                service.serviceMethod1();
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
        System.out.println("有线程数：" + service.lock.getQueueLength() + "个在等待获取锁");
    }

}
