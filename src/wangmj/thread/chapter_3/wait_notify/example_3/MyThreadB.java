package wangmj.thread.chapter_3.wait_notify.example_3;

public class MyThreadB extends Thread {

    private Object lock;

    public MyThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                System.out.println("开始notify  time=" + System.currentTimeMillis());
                lock.notify();
                Thread.sleep(2000);
                System.out.println("结束notify  time=" + System.currentTimeMillis());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
