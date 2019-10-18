package wangmj.thread.chapter_4.producer_consumer.example_1;

/**
 *  一个生产者和一个消费者交替打印
 */
public class Run {
    public static void main(String[] args){
        MyService myService = new MyService();

        ProducerThread pThread = new ProducerThread(myService);
        pThread.start();

        ConsumerThread cThread = new ConsumerThread(myService);
        cThread.start();
    }
}
