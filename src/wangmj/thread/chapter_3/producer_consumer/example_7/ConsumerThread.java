package wangmj.thread.chapter_3.producer_consumer.example_7;

public class ConsumerThread extends Thread {

    private Consumer consumer;

    public ConsumerThread(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true){
            consumer.popService();
        }
    }

}
