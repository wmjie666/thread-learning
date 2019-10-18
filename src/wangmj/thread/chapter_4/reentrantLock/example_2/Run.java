package wangmj.thread.chapter_4.reentrantLock.example_2;

/**
 * 调用lock.lock()代码的线程就持有了 ”对象监视器“，即对象锁，和synchronized关键字一样
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();

        ThreadA a1 = new ThreadA(myService);
        a1.setName("A1");
        a1.start();

        ThreadA a2 = new ThreadA(myService);
        a2.setName("A2");
        a2.start();

        Thread.sleep(100);

        ThreadB b1 = new ThreadB(myService);
        b1.setName("B1");
        b1.start();

        ThreadB b2 = new ThreadB(myService);
        b2.setName("B2");
        b2.start();
    }
}
