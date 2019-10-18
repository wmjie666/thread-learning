package wangmj.thread.chapter_4.otherMethod.tryLock;

/**
 * ReentrantLock.tryLock(): 表示用来尝试获取锁，如果获取成功，返回true，如果获取失败(即锁已被其他线程获取),则返回false。这个方法会立即返回，在拿不到锁时也不会一直等待
 * ReentrantLock.tryLock(long timeout, TimeUnit unit): 在超时等待时间内，没有被中断，且成功获取锁，则返回true，否则返回false
 */
public class Run {
    public static void main(String[] args){
        MyService myService = new MyService();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                myService.waitMethod();
            }
        };
        Thread t1 = new Thread(runnable);
        t1.setName("A");
        t1.start();

        Thread t2 = new Thread(runnable);
        t2.setName("B");
        t2.start();
    }
}
