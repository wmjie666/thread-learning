package wangmj.thread.chapter_2.volatile_keyword.example_4;

/**
 * 原子类的addAndGet()方法是原子的，但是两次调用这个方法之间并不是原子的，所以也是非线程安全的。在addNum()前加上synchronized关键字可解决
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        MyThread[] array = new MyThread[5];

        for (int i=0; i<array.length; i++){
            array[i] = new MyThread(myService);
        }

        for (int i=0; i<array.length; i++){
            array[i].start();
        }
        Thread.sleep(1000);
        System.out.println(myService.atomicLong.get());
    }
}
