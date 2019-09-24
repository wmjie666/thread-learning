package wangmj.thread.chapter_2.synchronized_method.example_1;

public class ThreadA extends Thread {

    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadA(HasSelfPrivateNum hasSelfPrivateNum) {
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        super.run();
        hasSelfPrivateNum.addNum("a");
    }
    
}
