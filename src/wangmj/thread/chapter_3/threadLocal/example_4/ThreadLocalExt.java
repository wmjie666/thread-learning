package wangmj.thread.chapter_3.threadLocal.example_4;

public class ThreadLocalExt extends ThreadLocal {

    @Override
    protected Object initialValue() {
        return "我是默认值，第一次get不再是null";
    }

}
