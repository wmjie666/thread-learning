package wangmj.thread.chapter_4.FIFO.example;

/**
 * Lock分公平锁和非公平锁
 * 公平锁：线程获取锁的顺序是按照线程加锁的顺序来分配的，即先来先得的FIFO先进先出顺序
 * 非公平锁：一种获取锁的抢占机制，是随机获得锁的，和公平锁不一样的就是先来的不一定先得到锁，这可能造成某些线程一直拿不到锁，结果也就是不公平了
 *
 * 本例中 isFair=true时，为公平锁，各线程获取锁是有序的
 *       isFair=false时，为非公平锁，各线程获取锁是无序的
 */
public class RunFair {
    public static void main(String[] args){

        final Service service = new Service(true);
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("线程 " + Thread.currentThread().getName() + " 运行了");
                service.serviceMethod();
            }
        };
        Thread[] threads = new Thread[10];
        for (int i=0; i<10; i++){
            threads[i] = new Thread(runnable);
        }
        for (int i=0; i<10; i++){
            threads[i].start();
        }

    }
}
