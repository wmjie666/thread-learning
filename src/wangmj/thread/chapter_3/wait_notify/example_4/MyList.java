package wangmj.thread.chapter_3.wait_notify.example_4;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    private static List list = new ArrayList();

    public static void add(){
        list.add("test");
    }

    public static int size(){
        return list.size();
    }
}
