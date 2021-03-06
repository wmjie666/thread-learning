package wangmj.thread.chapter_1;

/**
 * 线程执行的随机性
 */
public class MyThread2 extends Thread{
    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++){
                int time = (int)Math.random() * 1000;
                Thread.sleep(time);
                System.out.println("run " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]){    //线程在等待时，cpu就会去执行其他的线程人物
        MyThread2 myThread2 = new MyThread2();
        myThread2.setName("myThread2");
        myThread2.start();
        try {
            for (int i=0; i<10; i++){
                int time = (int)Math.random() * 1000;
                Thread.sleep(time);
                System.out.println("main " + Thread.currentThread().getName());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
