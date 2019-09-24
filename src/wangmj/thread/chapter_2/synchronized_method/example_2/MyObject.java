package wangmj.thread.chapter_2.synchronized_method.example_2;

public class MyObject {

    synchronized public void methodA(){
        try {
            System.out.println("begin methodA threadName=" + Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
