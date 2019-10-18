package wangmj.thread.chapter_4.reentrantReadWriteLock.example_2;

/**
 * 下面例子为写写互斥，即同一时刻只能由一个线程获得写锁
 *
 */
public class Run {
    public static void main(String[] args){
        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.setName("A");

        ThreadB b = new ThreadB(service);
        b.setName("B");

        a.start();
        b.start();
    }
}
