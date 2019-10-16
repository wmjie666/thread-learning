package wangmj.thread.chapter_3.join.example_1;

/**
 * join()方法作用：使主线程无限期阻塞，等待子线程对象销毁后，再继续执行主线程
 *
 * join()方法的用途：在很多情况下，主线程创建并启动子线程，如果子线程执行时间很长，则主线程往往会早于子线程结束之前结束。
 *                  如果希望主线程等子线程执行完之后再执行，比如主线程需要等子线程处理后的一个返回结果，则需要用到join()方法
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();

//        Thread.sleep();
        System.out.println("我想当myThread对象执行完毕之后再执行，但上面的sleep()应该睡多久了，这是无法确定的");

        //采用join()方法解决问题
//        myThread.join();
//        System.out.println("我想当myThread对象执行完毕之后再执行, 我做到了");
    }
}
