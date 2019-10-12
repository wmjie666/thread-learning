package wangmj.thread.chapter_3.wait_notify.example_8;

public class ThreadAdd extends Thread {

    private Add add;

    public ThreadAdd(Add add) {
        this.add = add;
    }

    @Override
    public void run() {
        add.add();
    }
}
