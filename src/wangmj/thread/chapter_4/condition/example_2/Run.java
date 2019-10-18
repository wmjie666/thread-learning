package wangmj.thread.chapter_4.condition.example_2;

/**
 * Object类中的wait()方法相当于Condition类中的await()方法
 * Object类中的wait(long timeout)方法相当于Condition类中的await(long time, TimeUnit unit)方法
 * Ojbect类中的notify()方法相当于Condition类中的signal()方法
 * Ojbect类中的notifyAll()方法相当于Condition类中的signalAll()方法
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.start();
        Thread.sleep(3000);
        myService.signal();
    }
}
