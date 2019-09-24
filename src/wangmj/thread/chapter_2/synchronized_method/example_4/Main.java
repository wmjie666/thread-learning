package wangmj.thread.chapter_2.synchronized_method.example_4;

/**
 * setValue还未全部执行完时，getValue被调用，产生脏读现象。
 * 解决办法：在getValue方法前加上synchronized关键字，使方法同步，setValue和getValue会被依次执行
 */
public class Main {
    public static void main(String[] args){
        try {
            PublicVar publicVar = new PublicVar();
            ThreadA a = new ThreadA(publicVar);
            a.start();
            Thread.sleep(200);
            publicVar.getValue();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
