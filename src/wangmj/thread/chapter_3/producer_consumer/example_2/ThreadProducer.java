package wangmj.thread.chapter_3.producer_consumer.example_2;

public class ThreadProducer extends Thread {

    private Producer producer;

    public ThreadProducer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        producer.setValue();
    }

}
