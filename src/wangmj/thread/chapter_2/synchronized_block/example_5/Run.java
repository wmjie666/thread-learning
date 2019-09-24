package wangmj.thread.chapter_2.synchronized_block.example_5;

/**
 * 当一个线程访问object的一个synchronized(this)同步代码块时，其他线程对同一个object中的所有其他synchronized(this)同步代码块的访问将被阻塞。
 * synchronized使用的是对象锁，同一个对象就是同一个锁
 */
public class Run {
    public static void main(String[] args){
        ObjectService objectService = new ObjectService();
        ThreadA a = new ThreadA(objectService);
        a.setName("a");
        a.start();
        ThreadB b = new ThreadB(objectService);
        b.setName("b");
        b.start();
    }
}
