package wangmj.thread.chapter_2.synchronized_block.example_8;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {

    private List<String> list = new ArrayList<>();

    synchronized public void add(String data){
        list.add(data);
    }

    synchronized public int getSize(){
        return list.size();
    }

}
