package wangmj.thread.chapter_3.producer_consumer.example_2;

public class ThreadConsumer extends Thread {

    private Consumer consumer;

    public ThreadConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public void run() {
        consumer.getValue();
    }
}
