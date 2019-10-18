package wangmj.thread.chapter_4.reentrantReadWriteLock.example_1;

/**
 * ReentrantReadWriteLock与ReentrantLock的比较： ReentrantLock具有完全互斥排他的效果，即同一时间只有一个线程在执行ReentrantLock.lock()方法后面的任务。
 *                                              这样做虽然保证了实例变量的线程安全性，但是效率非常低下。而ReentrantReadWriteLock通过读写锁可以提高效率。
 * ReentrantReadWriteLock有两个锁，即读锁和写锁。读锁也称为共享锁，写锁也称为排他锁。多个读锁之间不互斥，读锁与写锁互斥，写锁与写锁互斥。
 * 在没有线程进行写操作时，进行读操作的多个线程都可以获得读锁，而进行写操作的线程只有在获取写锁之后才可以写入。
 * 即多个线程可以同时进行读操作，但是同一时刻只允许一个线程进行写操作
 *
 * 下面例子为读读共享，同时获得读锁
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
