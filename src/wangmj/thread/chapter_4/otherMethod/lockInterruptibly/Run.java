package wangmj.thread.chapter_4.otherMethod.lockInterruptibly;

/**
 * lock.lockInterruptibly(): 如果当前线程未被中断，则获取锁，如果已经被中断，则出现异常。 而lock()不会抛异常
 *
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                myService.waitMethod();
            }
        };
        Thread t1 = new Thread(runnable);
        t1.setName("A");
        t1.start();

        Thread.sleep(500);

        Thread t2 = new Thread(runnable);
        t2.setName("B");
        t2.start();

        t2.interrupt();
        System.out.println("main end!");
    }
}
