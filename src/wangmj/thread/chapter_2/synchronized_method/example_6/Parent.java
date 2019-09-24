package wangmj.thread.chapter_2.synchronized_method.example_6;

public class Parent {

    public int count = 10;

    synchronized public void operateParentMethod(){
        try {
            count--;
            System.out.println("main print count=" + count);
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
