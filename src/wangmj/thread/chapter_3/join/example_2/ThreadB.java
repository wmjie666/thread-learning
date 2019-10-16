package wangmj.thread.chapter_3.join.example_2;

public class ThreadB extends Thread {

    @Override
    public void run() {
        try {
            ThreadA a = new ThreadA();
            a.start();
            System.out.println("线程B开始调用join()");
            a.join();
            System.out.println("线程B在run end处打印了");
        }catch (InterruptedException e){
            System.out.println("线程B在catch处打印了");
            e.printStackTrace();
        }
    }
}
