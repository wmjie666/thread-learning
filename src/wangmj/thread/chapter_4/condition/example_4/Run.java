package wangmj.thread.chapter_4.condition.example_4;


/**
 * 多个Condition的使用
 * awaitA()和awaitB()用了不同的condition，signalAll_A()方法只能唤醒conditionA的线程
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
        myService.signalAll_A();
    }
}
