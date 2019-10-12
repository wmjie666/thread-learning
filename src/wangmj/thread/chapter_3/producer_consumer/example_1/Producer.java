package wangmj.thread.chapter_3.producer_consumer.example_1;

public class Producer {

    private Object lock;

    public Producer(Object lock) {
        this.lock = lock;
    }

    public void setValue(){
        try {
            synchronized (lock){
                if (!ValueObject.value.equals("")){
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "_" + System.nanoTime();
                System.out.println("set的值是" + value);
                ValueObject.value = value;
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
