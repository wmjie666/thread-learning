package wangmj.thread.chapter_4.otherMethod.getWaitQueueLength;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service {

    public ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void waitMethod(){
        try {
            lock.lock();
            condition.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void notifyMethod(){
        try {
            lock.lock();
            System.out.println("有" + lock.getWaitQueueLength(condition) + "个线程正在等待condition");
        }finally {
            lock.unlock();
        }
    }
}
