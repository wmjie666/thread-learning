package wangmj.thread.chapter_3.wait_notify.example_7;

/**
 * wait(long)方法：等待某一时间内是否有线程对锁进行唤醒，如果没有，则超过这个时间自动唤醒
 */
public class MyRunnable {

    private static Object lock = new Object();

    private static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                synchronized (lock){
                    System.out.println("wait begin time=" + System.currentTimeMillis());
                    lock.wait(5000);
                    System.out.println("wait end time=" + System.currentTimeMillis());
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    };

    private static Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock){
                System.out.println("notify begin time=" + System.currentTimeMillis());
                lock.notify();
                System.out.println("notify end time=" + System.currentTimeMillis());
            }
        }
    };

    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(runnable);
        t.start();

        //在wait时间内，由其他线程唤醒，如果不执行下面的代码，则线程会在wait时间之后自动唤醒
        Thread.sleep(2000);
        Thread notify = new Thread(runnable2);
        notify.start();

    }

}
