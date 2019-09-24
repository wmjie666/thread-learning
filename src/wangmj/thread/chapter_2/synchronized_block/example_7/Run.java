package wangmj.thread.chapter_2.synchronized_block.example_7;

/**
 * 类Service中的synchronized同步方法和synchronized(this)获得的都是类Service的对象锁，如果是同一个实例对象，则是同一个锁，有竞争关系
 * synchronized(非this对象)获得的不是类Service的实例对象锁，与synchronized同步方法和synchronized(this)不存在竞争关系
 *
 * synchronized(非this对象)的优点：如果在一个类中有很多个synchronized方法，这时虽然能实现同步，但会受到阻塞，影响效率。
 *                               但如果使用同步代码块synchronized(非this对象)，则它与同步方法和synchronized(this)是异步的，不与其他锁this同步方法争抢this锁，可大大提高效率
 */
public class Run {
    public static void main(String[] args){
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
