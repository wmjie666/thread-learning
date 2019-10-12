package wangmj.thread.chapter_3.producer_consumer.example_2;

public class Producer {

    private Object lock;

    public Producer(Object lock) {
        this.lock = lock;
    }

    public void setValue(){
        try {
            synchronized (lock){
                while (!ValueObject.value.equals("")){
                    System.out.println(Thread.currentThread().getName() + " 开始Waiting");
                    lock.wait();
                }
                System.out.println(Thread.currentThread().getName() + " runnable");
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                ValueObject.value = value;
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
