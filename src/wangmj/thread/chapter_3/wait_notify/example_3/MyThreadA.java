package wangmj.thread.chapter_3.wait_notify.example_3;

public class MyThreadA extends Thread {

    private Object lock;

    public MyThreadA(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock){
                System.out.println("开始等待   wait time=" + System.currentTimeMillis());
                lock.wait();
                System.out.println("等待结束   wait time=" + System.currentTimeMillis());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
