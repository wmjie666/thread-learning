package wangmj.thread.chapter_3.producer_consumer.example_1;

public class Consumer {

    private Object lock;

    public Consumer(Object lock) {
        this.lock = lock;
    }

    public void getValue(){
        try {
            synchronized (lock){
                if (ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get的值是" + ValueObject.value);
                ValueObject.value = "";
                lock.notifyAll();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}
