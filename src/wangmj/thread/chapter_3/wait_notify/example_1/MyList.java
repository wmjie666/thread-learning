package wangmj.thread.chapter_3.wait_notify.example_1;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    private List list = new ArrayList();

    public void add(){
        list.add("test");
    }

    public int size(){
        return list.size();
    }
}
