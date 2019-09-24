package wangmj.thread.chapter_2.synchronized_method.example_6;

public class Sub extends Parent {

    synchronized public void operateSubMethod(){
        try {
            while (count > 0){
                count--;
                System.out.println("sub print count=" + count);
                Thread.sleep(100);
                this.operateParentMethod();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
