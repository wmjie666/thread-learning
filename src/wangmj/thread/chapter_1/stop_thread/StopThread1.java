package wangmj.thread.chapter_1.stop_thread;

/**
 * 调用interrupt()方法仅仅是在当前线程中打印一个停止标记，并不是真的停止线程
 */
public class StopThread1 extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i=0; i<50000; i++){
            System.out.println("i=" + (i+1));
        }
    }

    public static void main(String[] args){
        try {
            StopThread1 stopThread1 = new StopThread1();
            stopThread1.start();
            Thread.sleep(2000);
            stopThread1.interrupt(); //该方法执行后，run方法依旧会继续执行完
        }catch (Exception e){
            System.out.println("throw exception");
            e.printStackTrace();
        }
    }
}
