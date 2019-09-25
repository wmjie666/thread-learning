package wangmj.thread.chapter_2.synchronized_block.example_13;

/**
 * 多线程死锁：不同的线程都在等待根本不可能释放的锁，从而导致所有的任务都无法继续完成
 * 示例中线程t1和线程t2都在等待对方已经获得的锁，产生了死锁。工具查看：jdk的bin目录下  命令jsp查看线程Run的ID，然后执行命令 jstack -l ID 查看堆栈
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        DeadThread deadThread = new DeadThread();
        deadThread.setFlag("a");

        Thread t1 = new Thread(deadThread);
        t1.start();

        Thread.sleep(100);
        deadThread.setFlag("b");

        Thread t2 = new Thread(deadThread);
        t2.start();
    }
}
