package wangmj.thread.chapter_3.producer_consumer.example_4;

import java.util.ArrayList;
import java.util.List;

public class MyStack {

    private List<String> list = new ArrayList<>();

    synchronized public void push(){
        try {
            if (list.size() == 1){
                System.out.println("生产者"+ Thread.currentThread().getName() + " wait()");
                this.wait();
            }
            list.add("" + Math.random());
            System.out.println("生产者"+ Thread.currentThread().getName() +"被唤醒，并插入" + list.get(0) + ",并唤醒一个线程");
            this.notify();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public String pop(){
        String returnValue = "";
        try {
            if (list.size() == 0){
                System.out.println("消费者：" + Thread.currentThread().getName() + " wait()");
                this.wait();
            }
            returnValue = list.get(0);
            System.out.println("消费者：" + Thread.currentThread().getName() + "被唤醒，获取" + returnValue + ",并唤醒一个线程");
            list.remove(0);
            this.notify();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return returnValue;
    }

}
