package wangmj.thread.chapter_4.reentrantLock.example_1;

/**
 * ReentrantLock类和synchronized关键字一样，都能实现线程之间的同步，并且ReentrantLock比synchronized更加灵活，扩展性更强
 *
 * lock()方法获取锁，unlock()方法释放锁
 */
public class Run {
    public static void main(String[] args){
        MyService myService = new MyService();

        MyThread t1 = new MyThread(myService);
        MyThread t2 = new MyThread(myService);
        MyThread t3 = new MyThread(myService);
        MyThread t4 = new MyThread(myService);
        MyThread t5 = new MyThread(myService);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
