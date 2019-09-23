package wangmj.thread.chapter_1.stop_thread;

/**
 * 暴力停止: 使用stop方法停止,不推荐,强制停止会让一些清理工作得不到完成
 */
public class StopThread5 extends Thread {
    private int i = 0;

    @Override
    public void run() {
       try {
            while (true){
                i++;
                System.out.println("i=" + i);
            }
       }catch (Exception e){
           System.out.println("run catch");
            e.printStackTrace();
       }
    }

    public static void main(String args[]){
        try {
            StopThread5 stopThread5 = new StopThread5();
            stopThread5.start();
            Thread.sleep(1000);
            stopThread5.stop();
        }catch (Exception e){
            System.out.println("main catch");
            e.printStackTrace();
        }
    }
}
