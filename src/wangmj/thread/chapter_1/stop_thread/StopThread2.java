package wangmj.thread.chapter_1.stop_thread;

/**
 * isInterrupted()：测试线程Thread对象是否已经是中断状态，但不清除中断状态标志
 */
public class StopThread2 extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i=0; i<50000; i++){
            System.out.println("i=" + (i+1));
        }
    }

    public static void main(String args[]){
        try {
            StopThread2 stopThread2 = new StopThread2();
            stopThread2.start();
            Thread.sleep(100);
            stopThread2.interrupt();
            System.out.println("第1次调isInterrupted: " + stopThread2.isInterrupted());
            System.out.println("第2次调isInterrupted: " + stopThread2.isInterrupted());
        }catch (Exception e){
            System.out.println("catch exception");
            e.printStackTrace();
        }
        System.out.println("end");
    }

}
