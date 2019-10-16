package wangmj.thread.chapter_3.producer_consumer.example_6;

/**
 * 多个生产者和一个消费者。
 *
 * 条件判断用while循环，唤醒用notifyAll()方法
 */
public class Run {
    public static void main(String[] args){
        MyStack myStack = new MyStack();

        Producer producer1 = new Producer(myStack);
        Producer producer2 = new Producer(myStack);
        Producer producer3 = new Producer(myStack);
        Producer producer4 = new Producer(myStack);
        Producer producer5 = new Producer(myStack);

        ProducerThread pThread1 = new ProducerThread(producer1);
        pThread1.setName("1");
        ProducerThread pThread2 = new ProducerThread(producer2);
        pThread2.setName("2");
        ProducerThread pThread3= new ProducerThread(producer3);
        pThread3.setName("3");
        ProducerThread pThread4 = new ProducerThread(producer4);
        pThread4.setName("4");
        ProducerThread pThread5 = new ProducerThread(producer5);
        pThread5.setName("5");

        pThread1.start();
        pThread2.start();
        pThread3.start();
        pThread4.start();
        pThread5.start();

        Consumer consumer = new Consumer(myStack);
        ConsumerThread cThread = new ConsumerThread(consumer);
        cThread.setName("A");
        cThread.start();
    }
}
