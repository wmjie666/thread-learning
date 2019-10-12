package wangmj.thread.chapter_3.wait_notify.example_8;

import java.util.List;

public class Subtract {

    private String lock;
    private List<String> list;

    public Subtract(String lock, List<String> list) {
        this.lock = lock;
        this.list = list;
    }

    public void subtract(){
        try {
            synchronized (lock){
                if (list.size() == 0){
                    System.out.println("wait begin ThreadName=" + Thread.currentThread().getName());
                    lock.wait();
                    System.out.println("wait end ThreadName=" + Thread.currentThread().getName());
                }
                list.remove(0);
                System.out.println("list size= " + list.size());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
