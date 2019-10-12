package wangmj.thread.chapter_3.wait_notify.example_8;

import java.util.ArrayList;
import java.util.List;

/**
 * 程序抛异常是因为 threadAdd线程唤醒了两个 subtractThread线程，其中一个先获得锁的，执行了删除操作，导致list里面为空，而另一个再执行时，就会抛出索引溢出的异常
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        List<String> stringList = new ArrayList<>();
        String lock = new String();

        Subtract subtract = new Subtract(lock, stringList);
        ThreadSubtract subtractThread = new ThreadSubtract(subtract);
        subtractThread.setName("subtractThread");
        subtractThread.start();

        ThreadSubtract subtractThread2 = new ThreadSubtract(subtract);
        subtractThread2.setName("subtractThread2");
        subtractThread2.start();

        Thread.sleep(1000);

        Add add = new Add(lock, stringList);
        ThreadAdd threadAdd = new ThreadAdd(add);
        threadAdd.start();
    }
}
