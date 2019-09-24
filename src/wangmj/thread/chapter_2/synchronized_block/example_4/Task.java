package wangmj.thread.chapter_2.synchronized_block.example_4;

public class Task {

    public void doLongTask(){
        for (int i=0; i<100; i++){
            System.out.println("noSynchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
        }
        System.out.println("");
        synchronized (this){
            for (int i=0; i<100; i++){
                System.out.println("synchronized threadName=" + Thread.currentThread().getName() + " i=" + (i+1));
            }
        }
    }

}
