package wangmj.thread.chapter_3.inheritableThreadLocal.example_2;

/**
 * InheritableThreadLocal的childValue()方法，可以让子线程对继承下来的值进行修改
 *
 */
public class Run {
    public static void main(String[] args){
        try {
            for (int i=0; i<10; i++){
                System.out.println(" 在Main线程中取值=" + Tools.t1.get());
                Thread.sleep(100);
            }
            Thread.sleep(5000);
            ThreadA a = new ThreadA();
            a.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
