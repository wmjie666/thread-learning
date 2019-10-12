package wangmj.thread.chapter_3.producer_consumer.example_2;

public class Consumer {

    private Object lock;

    public Consumer(Object lock) {
        this.lock = lock;
    }

    public void getValue(){
        try {
            synchronized (lock){
                while (ValueObject.value.equals("")){
                    System.out.println(Thread.currentThread().getName() + " 开始Waiting");
                    lock.wait();
                }
                System.out.println(Thread.currentThread().getName() + " runnable ");
                ValueObject.value = "";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
