package wangmj.thread.chapter_2.synchronized_block.example_9;

public class MyObject {

    synchronized public void speedPrintString(){
        System.out.println("speedPrintString: getLock time=" + System.currentTimeMillis() + " run ThreadName=" + Thread.currentThread().getName());
        System.out.println("--------------------");
        System.out.println("speedPrintString: releaseLock time=" + System.currentTimeMillis() + " run ThreadName" + Thread.currentThread().getName());
    }

}
