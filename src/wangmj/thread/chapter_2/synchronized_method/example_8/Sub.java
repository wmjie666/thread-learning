package wangmj.thread.chapter_2.synchronized_method.example_8;

public class Sub extends Parent {

    @Override
    public void serviceMethod(){
        try {
            System.out.println("sub begin sleep threadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("sub end sleep threadName=" + Thread.currentThread().getName() + " time=" + System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
