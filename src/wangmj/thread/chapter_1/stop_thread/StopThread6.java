package wangmj.thread.chapter_1.stop_thread;

/**
 * 使用return停止线程: 如果是停止状态,则return
 */
public class StopThread6 extends Thread {

    @Override
    public void run() {
        while (true){
            if (this.isInterrupted()){
                System.out.println("停止了");
                return;
            }
            System.out.println("timer=" + System.currentTimeMillis());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        StopThread6 stopThread6 = new StopThread6();
        stopThread6.start();
        Thread.sleep(100);
        stopThread6.interrupt();
    }
}
