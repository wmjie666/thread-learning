package wangmj.thread.chapter_1;

/**
 * getId()取得线程的唯一标志
 */
public class MyThread7 extends Thread {

    public static void main(String[] args){
        Thread runThread = new Thread();
        System.out.println(runThread.getName() + "::" + runThread.getId());
    }
}
