package wangmj.thread.chapter_3.wait_notify.example_8;

public class ThreadSubtract extends Thread {

    private Subtract subtract;

    public ThreadSubtract(Subtract subtract) {
        this.subtract = subtract;
    }

    @Override
    public void run() {
        subtract.subtract();
    }
}
