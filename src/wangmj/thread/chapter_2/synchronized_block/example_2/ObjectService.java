package wangmj.thread.chapter_2.synchronized_block.example_2;

public class ObjectService {

    public void serviceMethod(){
        try {
            synchronized (this){
                System.out.println("begin time=" + System.currentTimeMillis());
                Thread.sleep(2000);
                System.out.println("end time=" + System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
