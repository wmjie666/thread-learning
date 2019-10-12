package wangmj.thread.chapter_3.producer_consumer.example_1;

public class ProducerThread extends Thread {

    private Producer producer;

    public ProducerThread(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true){
            producer.setValue();
        }
    }
}
