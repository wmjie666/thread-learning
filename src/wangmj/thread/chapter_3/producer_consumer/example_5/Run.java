package wangmj.thread.chapter_3.producer_consumer.example_5;

/**
 * 一个生产者和多个消费者。
 *
 * 条件判断用while循环，唤醒用notifyAll()方法
 */
public class Run {
    public static void main(String[] args){
        MyStack myStack = new MyStack();

        Producer producer = new Producer(myStack);

        Consumer consumer1 = new Consumer(myStack);
        Consumer consumer2 = new Consumer(myStack);
        Consumer consumer3 = new Consumer(myStack);
        Consumer consumer4 = new Consumer(myStack);
        Consumer consumer5 = new Consumer(myStack);

        ProducerThread pThread = new ProducerThread(producer);
        pThread.setName("A");
        pThread.start();

        ConsumerThread cThread1 = new ConsumerThread(consumer1);
        cThread1.setName("1");
        ConsumerThread cThread2 = new ConsumerThread(consumer2);
        cThread2.setName("2");
        ConsumerThread cThread3 = new ConsumerThread(consumer3);
        cThread3.setName("3");
        ConsumerThread cThread4 = new ConsumerThread(consumer4);
        cThread4.setName("4");
        ConsumerThread cThread5 = new ConsumerThread(consumer5);
        cThread5.setName("5");

        cThread1.start();
        cThread2.start();
        cThread3.start();
        cThread4.start();
        cThread5.start();
    }
}
