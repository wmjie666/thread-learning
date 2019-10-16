package wangmj.thread.chapter_3.join.example_2;

/**
 * 在join过程中，如果当前线程被中断，则当前线程出现异常。 join()方法和interrupt()方法如果彼此遇到，会出现异常
 *
 * 当B线程出现异常的时候，但是A线程还在继续执行，因为A线程并未出现异常
 */
public class Run {
    public static void main(String[] args){
        try {
            ThreadB threadB = new ThreadB();
            threadB.start();

            Thread.sleep(500);

            ThreadC threadC = new ThreadC(threadB);
            threadC.start();

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
