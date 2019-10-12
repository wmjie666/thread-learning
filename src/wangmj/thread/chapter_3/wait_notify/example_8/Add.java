package wangmj.thread.chapter_3.wait_notify.example_8;

import com.sun.beans.decoder.ValueObject;

import java.util.List;

public class Add {

    private List<String> list;
    private String lock;

    public Add(String lock, List<String> list) {
        this.lock = lock;
        this.list = list;
    }

    public void add(){
        synchronized (lock){
            list.add("test");
            lock.notifyAll();
        }
    }

}
