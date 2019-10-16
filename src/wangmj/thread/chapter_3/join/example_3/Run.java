package wangmj.thread.chapter_3.join.example_3;

/**
 * Thread.sleep(long)方法不释放对象锁
 * join()方法释放对象锁，当前线程的同步方法可以被其他线程调用
 */
public class Run {
    public static void main(String[] args){
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            Thread.sleep(1000);
            ThreadC c = new ThreadC(b);
            c.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
