package wangmj.thread.chapter_1.priority_thread.rule;

public class PriorityThread4 extends Thread {

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        long addResult = 0;
        for (int j=0; j<10; j++){
            for (int i=0; i<5000; i++){
                addResult = addResult + i;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("****************** priorityThread4 use time : " + (endTime-beginTime));
    }
}
