package wangmj.thread.chapter_2.synchronized_block.example_12;

/**
 * 线程a和线程b都持有同一个对象锁，而线程a又是无限执行的，所以造成线程b无法执行，死锁了。此时可以用synchronized同步块解决：Service2
 */
public class Run {
    public static void main(String[] args){

        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();
        ThreadB b = new ThreadB(service);
        b.start();

//        Service2 service2 = new Service2();
//        ThreadA2 a2 = new ThreadA2(service2);
//        a2.start();
//        ThreadB2 b2 = new ThreadB2(service2);
//        b2.start();
    }
}
