package wangmj.thread.chapter_3.producer_consumer.example_2;

/**
 * 这个例子中的多生产和多消费者，有可能出现假死现象，即全部线程都进入waiting状态。
 * 因为无法保证notify唤醒的是异类，即生产者notify有可能唤醒的是其他生产者线程，最后可能都在waiting状态
 *
 * 解决办法是将notify()方法替换成notifyAll()方法，唤醒所有的线程
 *
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);

        ThreadProducer[] threadProducer = new ThreadProducer[2];
        ThreadConsumer[] threadConsumer = new ThreadConsumer[2];

        for (int i=0; i<2; i++){
            threadProducer[i] = new ThreadProducer(producer);
            threadProducer[i].setName("生产者" + (i+1));

            threadConsumer[i] = new ThreadConsumer(consumer);
            threadConsumer[i].setName("消费者" + (i+1));

            threadConsumer[i].start();
            Thread.sleep(1000);
            threadProducer[i].start();
            Thread.sleep(1000);
        }
        Thread.sleep(5000);
        Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threadArray);  //enumerate()方法用于将对应活动线程的线程组及其子组复制到指定的数组中
        for (int i=0; i<threadArray.length; i++){
            System.out.println(threadArray[i].getName() + " " + threadArray[i].getState());
        }

    }
}
