package wangmj.thread.chapter_4.reentrantReadWriteLock.example_3;

/**
 * 下面例子为读写互斥，即先读，后写，是互斥的
 *
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        Thread.sleep(1000);

        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
