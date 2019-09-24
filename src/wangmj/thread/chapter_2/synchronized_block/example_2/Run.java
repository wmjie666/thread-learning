package wangmj.thread.chapter_2.synchronized_block.example_2;

/**
 * 当两个并发线程访问同一个对象的synchronized(this)同步代码块时，一段时间内只能有一个线程被执行，另一个线程必须等待
 */
public class Run {
    public static void main(String[] args){
        ObjectService objectService = new ObjectService();
        ThreadA a = new ThreadA(objectService);
        a.setName("A");
        a.start();
        ThreadA b = new ThreadA(objectService);
        b.setName("B");
        b.start();
    }
}
