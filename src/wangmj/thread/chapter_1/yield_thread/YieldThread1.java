package wangmj.thread.chapter_1.yield_thread;

/**
 * yield()的作用是放弃当前CPU资源,让给其他的任务去占用CPU执行.但放弃的时长不确定
 */
public class YieldThread1 extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for (int i=0; i<50000; i++){
            Thread.yield();
            count = count + (i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时: " + (endTime - beginTime) + "ms");
    }

    public static void main(String[] args){
        YieldThread1 yieldThread1 = new YieldThread1();
        yieldThread1.start();
    }
}
