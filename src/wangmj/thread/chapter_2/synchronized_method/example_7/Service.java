package wangmj.thread.chapter_2.synchronized_method.example_7;

public class Service {

    synchronized public void testMethod(){
        if (Thread.currentThread().getName().equals("A")){
            System.out.println("ThreadName=" + Thread.currentThread().getName() + " run beginTime=" + System.currentTimeMillis());
            int i=1;
            while (i == 1){
                if (("" + Math.random()).substring(0, 8).equals("0.123456")){
                    System.out.println("ThreadName=" + Thread.currentThread().getName() + " run exceptionTime=" + System.currentTimeMillis());
                    Integer.parseInt("a"); //抛出异常
                }
            }
        }else {
            System.out.println("Thread B run time=" + System.currentTimeMillis());
        }
    }

}
