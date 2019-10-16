package wangmj.thread.chapter_3.inheritableThreadLocal.example_1;

/**
 * InheritableThreadLocal可以在子线程中取得父线程继承下来的值
 *
 * 本例中子线程A和父线程Main取的默认值相同
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
