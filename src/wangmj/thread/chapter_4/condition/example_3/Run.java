package wangmj.thread.chapter_4.condition.example_3;

/**
 * awaitA()和awaitB()都用的同一个condition，signalAll()方法可以全部唤醒，但无法选择性唤醒，此时需要用到多个condition
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        a.setName("A");
        a.start();

        ThreadB b = new ThreadB(myService);
        b.setName("B");
        b.start();

        Thread.sleep(3000);
        myService.signalAll();
    }
}
