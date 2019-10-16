package wangmj.thread.chapter_3.join.example_4;

/**
 * join方法的执行，需要获得对象锁，执行后释放对象锁。join方法里面调用了wait()方法
 */
public class Run {
    public static void main(String[] args){
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);

            a.start();
            b.start();
            b.join(2000);

            System.out.println("main end " + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
