package wangmj.thread.chapter_2.volatile_keyword.example_2;

/**
 * 当线程中的addCount方法不是synchronized同步方法时，执行Run，最后的结果不是10000。所以count在多线程相加时，不是线程安全的
 * 当线程中的addCount方法是synchronized static方法时，多个线程同时竞争Class锁，所以是同步的，线程是安全的。
 *
 * volatile使用场景：主要场合是在多个线程中可以感知实例变量被更改了，并且可以获得最新的值使用，也就是用多线程读取共享变量时可以获得最新值使用，与同步无关，所以volatile不是线程安全的。
 */
public class Run {
    public static void main(String[] args){
        MyThread[] myThreadArray = new MyThread[100];
        for (int i=0; i<100; i++){
            myThreadArray[i] = new MyThread();
        }
        for (int i=0; i<100; i++){
            myThreadArray[i].start();
        }
    }
}
