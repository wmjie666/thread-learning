package wangmj.thread.chapter_2.synchronized_method.example_5;

/**
 * synchronized是可重入锁：当一个线程获得了某个对象锁，还没释放时(还在方法内)，可以再次获得这个对象的锁，即可以调用这个对象其他的synchronized方法，而不用等待。如果是不可重入锁，就会造成死锁
 */
public class Run {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
