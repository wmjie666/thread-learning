package wangmj.thread.chapter_3.threadLocal.example_3;

/**
 * 再次验证ThreadLocal的隔离性
 */
public class Run {
    public static void main(String[] args){
        try {
            ThreadA a = new ThreadA();
            a.start();
            Thread.sleep(1000);
            ThreadB b = new ThreadB();
            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
