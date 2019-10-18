package wangmj.thread.chapter_4.condition.example_1;

/**
 * ReentrantLock类借助Condition对象可以实现 等待/通知 模式，和关键字synchronized与wait()和notify()/notifyAll()相结合一样
 *
 * ReentrantLock和Condition的结合 比 synchronized与wait()和notify()/notifyAll()的结合 更好，更灵活。
 * Condition类可以实现多路通知功能，也就是在一个Lock对象里面可以创建多个Condition(即对象监视器)实例，线程对象可以注册在指定的Condition中，从而可以有选择的进行线程通知，在线程调度上更加灵活
 *
 * 使用notify()/notifyAll()方法进行通知时，被通知的线程时JVM随机选择的。synchronized就相当于整个Lock对象只有一个单一的Condition对象，所有的线程都注册在它一个对象身上。所以notifyAll()通知时，是通知所有waiting线程，效率很低。
 */
public class Run {
    public static void main(String[] args){
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
    }

}
