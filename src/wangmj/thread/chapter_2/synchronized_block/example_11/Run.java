package wangmj.thread.chapter_2.synchronized_block.example_11;

/**
 * String的两个值都是常量值 ”AA“，线程a和b都持有同样的锁，所以是同步，一直是A执行，B不执行。
 * 如果改成new Object()实例化一个Object对象，它是不会放入缓存，就可以解决上面的问题
 */
public class Run {
    public static void main(String[] args){
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();

        ThreadA b = new ThreadA(service);
        b.setName("B");
        b.start();
    }
}
