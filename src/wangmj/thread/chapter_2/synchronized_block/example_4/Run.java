package wangmj.thread.chapter_2.synchronized_block.example_4;

/**
 * 不在synchronized块中就是异步执行，在synchronized块中就是同步执行
 */
public class Run {
    public static void main(String[] args){
        Task task = new Task();
        MyThread a = new MyThread(task);
        a.start();
        MyThread b = new MyThread(task);
        b.start();
    }
}
