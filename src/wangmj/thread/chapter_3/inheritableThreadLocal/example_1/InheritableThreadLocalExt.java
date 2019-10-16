package wangmj.thread.chapter_3.inheritableThreadLocal.example_1;

import java.util.Date;

public class InheritableThreadLocalExt extends InheritableThreadLocal {

    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

}
