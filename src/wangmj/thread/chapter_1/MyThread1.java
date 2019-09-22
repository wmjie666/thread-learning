package wangmj.thread.chapter_1;

public class MyThread1 extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("my thread");
    }

    public static void main(String args[]){   //线程执行的时间是随机的，strart（）表示已经准备好，等待调用run方法
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        System.out.println("end");
    }

}
