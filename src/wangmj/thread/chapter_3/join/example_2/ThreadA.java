package wangmj.thread.chapter_3.join.example_2;

public class ThreadA extends Thread {

    @Override
    public void run() {
        System.out.println("线程A开始run");
        for (int i=0; i<Integer.MAX_VALUE; i++){
            String newString = new String();
            Math.random();
        }
    }

}
