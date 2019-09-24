package wangmj.thread.chapter_2.synchronized_method.example_6;

/**
 * synchronized的可重入锁也支持父子类的继承：子类完全可以通过可重入锁调用父类的同步方法
 */
public class Run {
    public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
