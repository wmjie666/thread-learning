package wangmj.thread.chapter_1;

/**
 * 自定义线程类中的实例变量不共享的情况
 */
public class MyThread3 extends Thread{

    private int count = 5;

    public MyThread3(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        try {
            while (count > 0){
                count--;
                System.out.println("由" + this.currentThread().getName() + "计算： count=" + count);
                Thread.sleep(300);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){         //各自线程计算各自的count，互不影响
        MyThread3 a = new MyThread3("A");
        MyThread3 b = new MyThread3("B");
        MyThread3 c = new MyThread3("C");
        a.start();
        b.start();
        c.start();
    }
}
