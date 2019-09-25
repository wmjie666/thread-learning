package wangmj.thread.chapter_2.volatile_keyword.example_5;

/**
 * 多个线程访问同一个对象的实例变量，各个线程之间没有可视性，都是访问的各自线程私有栈，而对变量的修改体现在公共栈，所以各个线程获取到值不是最新的值
 * 解决：对实例变量采用volatile,或者采用synchronized(obj)代码块
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.start();

        Thread.sleep(1000);

        ThreadB b = new ThreadB(service);
        b.start();

        System.out.println("已经发起停止的命令了");
    }
}
