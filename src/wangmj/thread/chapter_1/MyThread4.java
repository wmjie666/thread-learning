package wangmj.thread.chapter_1;

/**
 * 自定义线程类中的实例变量共享的情况
 */
public class MyThread4 extends Thread {

    private int count=5;

    @Override //要解决线程安全问题，需要让线程同步，在run方法前加上synchronized关键字，synchronized可以在任意对象和方法上加锁，加锁的这称为互斥区或临界区
    public void run() {
        super.run();
        count--;
        System.out.println("由" + this.currentThread().getName() + "计算：count=" + count);
    }

    public static void main(String[] args){   //多线程都调用myThread4的run方法，count被共享，会有线程安全问题
        MyThread4 myThread4 = new MyThread4();
        Thread a = new Thread(myThread4, "A");
        Thread b = new Thread(myThread4, "B");
        Thread c = new Thread(myThread4, "C");
        Thread d = new Thread(myThread4, "D");
        Thread e = new Thread(myThread4, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
