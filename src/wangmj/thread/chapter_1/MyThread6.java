package wangmj.thread.chapter_1;

/**
 * 测试isAlive()方法，判断当前线程是否处于活动状态
 */
public class MyThread6 extends Thread{

    @Override
    public void run() {
        super.run();
        System.out.println("run=" + this.isAlive());
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread6 myThread6 = new MyThread6();
        System.out.println("begin: " + myThread6.isAlive());
        myThread6.start();
//        Thread.sleep(1000); //sleep是让当前正在执行的线程在指定时间内处于休眠状态
        System.out.println("end: " + myThread6.isAlive());
    }

}
