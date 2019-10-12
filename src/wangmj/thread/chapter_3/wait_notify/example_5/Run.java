package wangmj.thread.chapter_3.wait_notify.example_5;

/**
 * 当线程是wait()状态时，调用线程对象的interrupt方法会出现InterruptedException异常
 *
 * 在执行同步代码块的过程中，遇到异常而导致终止时，锁也会被释放
 */
public class Run {
    public static void main(String[] args){
        try {
            Object lock = new Object();
            ThreadA a = new ThreadA(lock);
            a.start();
            Thread.sleep(5000);
            a.interrupt();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
