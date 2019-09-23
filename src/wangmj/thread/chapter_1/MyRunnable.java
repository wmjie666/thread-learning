package wangmj.thread.chapter_1;

/**
 * 实现runnable接口的使用
 */
public class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("运行中");
    }


    public static void main(String[] args){
        Runnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);  //thread的构造方法可以传递实现了runnable接口的类，同时thread也实现了runnable，所以thread可以由另一个thread调用run方法
        thread.start();
        System.out.println("end");
    }
}
