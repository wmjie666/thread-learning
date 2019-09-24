package wangmj.thread.chapter_2.synchronized_block.example_1;

/**
 * synchronized方法的弊端：线程A调用同步方法执行较长时间时，线程B需要一直等待
 * 线程A和线程B一起执行完耗时6秒，原因在于task的同步方法是依次执行的
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
