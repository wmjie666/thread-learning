package wangmj.thread.chapter_1.stop_thread;

/**
 * 在沉睡中停止: 在sleep方法中进行停止,会抛出异常
 */
public class StopThread4 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run begin");
            Thread.sleep(1000*5);
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("在沉睡中被停止: 中断状态被置为:" + this.isInterrupted());
        }
    }

    public static void main(String[] args){
        try {
            StopThread4 stopThread4 = new StopThread4();
            stopThread4.start();
            Thread.sleep(200);
            stopThread4.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
