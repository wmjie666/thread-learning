package wangmj.thread.chapter_3.threadLocal.example_5;

/**
 * ThreadLocal的默认值，针对各个线程是各有一份,各个线程取到的默认时间不同
 */
public class Run {
    public static void main(String[] args){
        try {
            for (int i=0; i<10; i++){
                System.out.println(" 在Main线程中取值=" + Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
