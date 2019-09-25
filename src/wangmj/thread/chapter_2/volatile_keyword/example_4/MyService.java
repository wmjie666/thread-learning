package wangmj.thread.chapter_2.volatile_keyword.example_4;

import java.util.concurrent.atomic.AtomicLong;

public class MyService {

    public static AtomicLong atomicLong = new AtomicLong();

    public void addNum(){
        System.out.println(Thread.currentThread().getName() + " 加了100之后的值是： " + atomicLong.addAndGet(100));
        atomicLong.addAndGet(1);
    }

}
