package wangmj.thread.chapter_3.wait_notify.example_2;

/**
 * wait()方法和notify()方法，是Object类方法，在被对象调用之前，当前线程必须获得该对象的对象级别锁，否则抛出IllegalMonitorStateException异常
 */
public class Run1 {
    public static void main(String[] args){
        try {
            String newString = new String("test");
            newString.wait();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
