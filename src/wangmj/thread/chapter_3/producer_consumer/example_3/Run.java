package wangmj.thread.chapter_3.producer_consumer.example_3;

/**
 * 一个生产者和一个消费者，操作一个list，size=1，无限循环。生产者和消费者会交替循环存取
 */
public class Run {
    public static void main(String[] args){
        MyStack myStack = new MyStack();

        Producer producer = new Producer(myStack);
        Consumer consumer = new Consumer(myStack);

        ProducerThread pThread = new ProducerThread(producer);
        ConsumerThread cThread = new ConsumerThread(consumer);

        pThread.start();
        cThread.start();
    }
}
