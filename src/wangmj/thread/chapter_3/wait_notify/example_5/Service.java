package wangmj.thread.chapter_3.wait_notify.example_5;

public class Service {

    public void testMethod(Object lock){
        try {
            System.out.println("begin wait()");
            lock.wait();
            System.out.println("end wait()");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("出现异常了，因为wait状态的线程被interrupt了");
        }
    }

}
