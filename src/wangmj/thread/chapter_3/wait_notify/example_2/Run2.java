package wangmj.thread.chapter_3.wait_notify.example_2;

/**
 * wait()方法是Object类的方法，会将当前线程置入“预执行队列”中，在wait()所在的代码行处停止执行，直到接到notify通知或被中断为止
 * 在调用wait()方法之前，线程必须获得 调用wait()方法的对象 的对象级别锁，即只能在同步代码块或同步方法中调用wait()方法。
 * wait()方法执行后，当前线程就会释放对象锁，进入等待状态，并与其他等待该对象锁的线程竞争，直到重新获得notify()释放的锁
 *
 * notify()方法也必须在同步块或同步方法中执行，即notify()被调用之前，线程也必须获得该对象的对象级别锁
 */
public class Run2 {
    public static void main(String[] args){
        try {
            String lock = new String();
            System.out.println("同步代码块上面");
            synchronized (lock){
                System.out.println("同步代码块第一行");
                lock.wait();
                System.out.println("wait下的代码");
            }
            System.out.println("同步代码块结束后的第一行");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
