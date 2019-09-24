package wangmj.thread.chapter_2.synchronized_block.example_3;

/**
 * 对共享变量的写操作采用synchronized代码块可以解决整个方法使用synchronized关键字导致执行时间长的弊端
 * 一个线程访问对象的一个synchronized同步代码块时，另一个线程仍然可以访问该对象中非synchronized(this)同步代码块
 *
 */
public class Run {
    public static void main(String[] args){
        Task task = new Task();
        ThreadA a = new ThreadA(task);
        a.start();
        ThreadB b = new ThreadB(task);
        b.start();
        try {
            Thread.sleep(10000);  //等待两个线程执行完
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long beginTime = CommonUtils.beginTime1;
        if (CommonUtils.beginTime2 < CommonUtils.beginTime1){
            beginTime = CommonUtils.beginTime2;
        }
        long endTime = CommonUtils.endTime1;
        if (CommonUtils.endTime2 > CommonUtils.endTime1){
            endTime = CommonUtils.endTime2;
        }
        System.out.println("耗时： " + ((endTime-beginTime)/1000));
    }
}
