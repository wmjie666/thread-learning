package wangmj.thread.chapter_4.producer_consumer.example_2;

/**
 * 多个生产者和消费者
 * 本例中使用了一个condition，导致生产者有可能唤醒生产者，就又会在while条件中循环一遍，不是真正意义上的交替打印
 */
public class Run {
    public static void main(String[] args){
        MyService myService = new MyService();

        ProducerThread[] pThreads = new ProducerThread[10];
        ConsumerThread[] cThreads = new ConsumerThread[10];

        for (int i=0; i<10; i++){
            pThreads[i] = new ProducerThread(myService);
            cThreads[i] = new ConsumerThread(myService);

            pThreads[i].start();
            cThreads[i].start();
        }
    }
}
