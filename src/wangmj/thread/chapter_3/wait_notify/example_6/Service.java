package wangmj.thread.chapter_3.wait_notify.example_6;

public class Service {

    public void testMethod(Object lock){
        try{
            synchronized (lock){
                System.out.println("begin wait() ThreadName=" + Thread.currentThread().getName());
                lock.wait();
                System.out.println("end wait() ThreadName=" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
