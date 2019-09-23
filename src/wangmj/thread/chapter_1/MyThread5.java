package wangmj.thread.chapter_1;

/**
 * 测试Thread.currentThread().getName()
 */
public class MyThread5 extends Thread {

    public MyThread5(){
        System.out.println("-----MyThread5 begin-----");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("-----MyThread5 end-----");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("-----run begin-----");
        System.out.println("Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("this.getName()=" + this.getName());
        System.out.println("-----run end-----");
    }

    public static void main(String[] args){
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("AA");
        Thread t = new Thread(myThread5, "T");
        t.start();
    }
}
