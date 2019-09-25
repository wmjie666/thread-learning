package wangmj.thread.chapter_2.volatile_keyword.example_3;

/**
 * 除了使用synchronized关键字实现同步，还可以用原子类实现：AtomicBoolean、AtomicInteger、AtomicLong等
 */
public class Run {
    public static void main(String[] args){
        AddCountThread addCountThread = new AddCountThread();
        Thread t1 = new Thread(addCountThread);
        t1.start();

        Thread t2 = new Thread(addCountThread);
        t2.start();

        Thread t3 = new Thread(addCountThread);
        t3.start();

        Thread t4 = new Thread(addCountThread);
        t4.start();

        Thread t5 = new Thread(addCountThread);
        t5.start();
    }
}
