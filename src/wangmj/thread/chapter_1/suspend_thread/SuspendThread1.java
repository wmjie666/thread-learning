package wangmj.thread.chapter_1.suspend_thread;

/**
 * 通过suspend()暂停线程,resume()恢复线程.这两个方法都不推荐,已过期
 */
public class SuspendThread1 extends Thread {

    private  long count = 0;

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    @Override
    public void run() {
        while (true){
            count++;
        }
    }

    public static void main(String[] args){
        try {
            SuspendThread1 suspendThread1 = new SuspendThread1();
            suspendThread1.start();
            Thread.sleep(1000);

            //A段
            suspendThread1.suspend();
            System.out.println("A=" + System.currentTimeMillis() + " count=" + suspendThread1.getCount());
            Thread.sleep(1000);
            System.out.println("A=" + System.currentTimeMillis() + " count=" + suspendThread1.getCount());

            //B段
            suspendThread1.resume();
            Thread.sleep(1000);

            //C段
            suspendThread1.suspend();
            System.out.println("C=" + System.currentTimeMillis() + " count=" + suspendThread1.getCount());
            Thread.sleep(1000);
            System.out.println("C=" + System.currentTimeMillis() + " count=" + suspendThread1.getCount());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
