package wangmj.thread.chapter_2.synchronized_block.example_12;

public class Service2 {

    Object object1 = new Object();
    Object object2 = new Object();

    public void methodA(){
        synchronized (object1){
            System.out.println("methodA begin");
            boolean isContinueRun = true;
            while (isContinueRun){}
            System.out.println("methodA end");
        }
    }

    public void methodB(){
        synchronized (object2){
            System.out.println("methodB begin");
            System.out.println("methodB end");
        }
    }

}
