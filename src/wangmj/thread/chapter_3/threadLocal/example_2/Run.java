package wangmj.thread.chapter_3.threadLocal.example_2;

/**
 * 验证ThreadLocal的隔离性，三个线程各自能正确娶到各自set的数据
 */
public class Run {
    public static void main(String[] args){
        try {
            ThreadA a = new ThreadA();
            ThreadB b = new ThreadB();

            a.start();
            b.start();

            for (int i=0; i<100; i++){
                Tools.t1.set("Main" + (i+1));
                System.out.println("Main get value=" + Tools.t1.get());
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
