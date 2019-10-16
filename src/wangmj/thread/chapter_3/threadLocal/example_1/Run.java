package wangmj.thread.chapter_3.threadLocal.example_1;

/**
 * ThreadLocal主要解决的是变量在不同线程间的隔离性，也就是不同线程拥有自己的值，不同线程中的值可以放入ThreadLocal类中进行保存
 */
public class Run {

    public static ThreadLocal t1 = new ThreadLocal();

    public static void main(String[] args){
        if (t1.get() == null){
            System.out.println("从未放过值");
            t1.set("我的值");
        }
        System.out.println(t1.get());
        System.out.println(t1.get());
    }
}
