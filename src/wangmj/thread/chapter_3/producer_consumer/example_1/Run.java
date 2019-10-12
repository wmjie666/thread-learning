package wangmj.thread.chapter_3.producer_consumer.example_1;

/**
 * 一个生产者和一个消费者，互相唤醒对方，线程交替执行
 */
public class Run {
    public static void main(String[] args){
        Object lock = new Object();

        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);

        ProducerThread producerThread = new ProducerThread(producer);
        ConsumerThread consumerThread = new ConsumerThread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
