package wangmj.thread.chapter_3.threadLocal.example_5;

import java.util.Date;

public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

}
