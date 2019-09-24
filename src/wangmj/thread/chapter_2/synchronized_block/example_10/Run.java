package wangmj.thread.chapter_2.synchronized_block.example_10;

/**
 * 关键字synchronized用在static静态方法上时，是对当前的 java文件对应的Class类进行持锁
 * 关键字synchronized用在非static静态方法上，是给对象上锁
 * 上面两种情况是不同的锁，一个是Class锁，一个是对象锁，不是竞争关系
 * 注意一种情况： synchronized(Service.class) 和 synchronized static 是一样的，都加持Class锁
 */
public class Run {
    public static void main(String[] args){
        Service service = new Service();
        ThreadA a = new ThreadA();
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB();
        b.setName("B");
        b.start();
        ThreadC c = new ThreadC(service);
        c.setName("C");
        c.start();
    }
}
