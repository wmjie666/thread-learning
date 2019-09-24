package wangmj.thread.chapter_2.synchronized_method.example_7;

/**
 * 当一个线程执行的代码出现异常时，其所持有的锁会自动释放。实际上是同步方法抛出异常时，就跳出了该方法，方法结束，锁被释放。如果该方法内捕获了异常，则需要等方法执行结束才会释放锁
 */
public class Run {
    public static void main(String[] args){
        try {
            Service service = new Service();
            MyThread a = new MyThread(service);
            a.setName("A");
            a.start();
            Thread.sleep(500);
            MyThread b = new MyThread(service);
            b.setName("B");
            b.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
