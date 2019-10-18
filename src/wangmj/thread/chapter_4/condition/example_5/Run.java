package wangmj.thread.chapter_4.condition.example_5;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 实现对Condition的排序规划
 */
public class Run {

    volatile private static int nextPrintWho = 1;
    private static ReentrantLock lock = new ReentrantLock();
    final private static Condition conditionA = lock.newCondition();
    final private static Condition conditionB = lock.newCondition();
    final private static Condition conditionC = lock.newCondition();

    public static void main(String[] args){

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 1){
                        conditionA.await();
                    }
                    for (int i=0; i<3; i++){
                        System.out.println("t1 " + (i+1));
                    }
                    nextPrintWho = 2;
                    conditionB.signalAll();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 2){
                        conditionB.await();
                    }
                    for (int i=0; i<3; i++){
                        System.out.println("t2 " + (i+1));
                    }
                    nextPrintWho = 3;
                    conditionC.signalAll();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    lock.lock();
                    while (nextPrintWho != 3){
                        conditionC.await();
                    }
                    for (int i=0; i<3; i++){
                        System.out.println("t3 " + (i+1));
                    }
                    nextPrintWho = 1;
                    conditionA.signalAll();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });

        Thread[] aArray = new Thread[5];
        Thread[] bArray = new Thread[5];
        Thread[] cArray = new Thread[5];
        for (int i=0; i<5; i++){
            aArray[i] = new Thread(t1);
            bArray[i] = new Thread(t2);
            cArray[i] = new Thread(t3);
            aArray[i].start();
            bArray[i].start();
            cArray[i].start();
        }
    }
}
