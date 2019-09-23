package wangmj.thread.chapter_1.stop_thread;

/**
 * 异常停止: 先判断是否是中断状态,如果是,则抛出异常来停止线程
 */
public class StopThread3 extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i=0; i<50000; i++){
                if (this.isInterrupted()){
                    System.out.println("已经是停止状态了,我要退出了");
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i+1));
            }
            System.out.println("for后面的语句");
        }catch (InterruptedException e){
            System.out.println("进入run方法中的catch了");
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        try {
            StopThread3 stopThread3 = new StopThread3();
            stopThread3.start();
            Thread.sleep(200);
            stopThread3.interrupt();
        }catch (InterruptedException e){
            System.out.println("main的catch");
            e.printStackTrace();
        }
    }
}
