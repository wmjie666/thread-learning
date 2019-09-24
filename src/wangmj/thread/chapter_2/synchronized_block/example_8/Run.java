package wangmj.thread.chapter_2.synchronized_block.example_8;

/**
 * 两个线程对MyOneList的操作 getSize和add实际上是异步的，由MyService实现，导致了脏读。
 *
 * 总结：同步块中的代码执行是同步的，但是线程何时去执行同步块却是异步的，这种情况会导致脏读。只有让线程执行同步块也是同步的，才能解决脏读问题
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyOneList list = new MyOneList();
        ThreadA a = new ThreadA(list);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(list);
        b.setName("B");
        b.start();
        Thread.sleep(6000);
        System.out.println("listSize=" + list.getSize());
    }
}
