package wangmj.thread.chapter_2.synchronized_block.example_9;

/**
 * service中的同步块和myObject对象中的同步方法，竞争的都是同一个MyObject对象锁，所以是竞争关系，执行顺序是同步的
 *
 * 时刻谨记synchronized方法和synchronized代码块产生的是对象锁，判断多线程是否同步，就判断多线程是否竞争的是同一个对象锁
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        MyObject myObject = new MyObject();
        ThreadA a = new ThreadA(service, myObject);
        a.setName("A");
        a.start();
        Thread.sleep(100);
        ThreadB b = new ThreadB(myObject);
        b.setName("B");
        b.start();
    }
}
