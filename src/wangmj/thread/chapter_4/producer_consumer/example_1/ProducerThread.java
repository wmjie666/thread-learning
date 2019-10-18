package wangmj.thread.chapter_4.producer_consumer.example_1;

public class ProducerThread extends Thread {

    private MyService myService;

    public ProducerThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i=0; i<Integer.MAX_VALUE; i++){
            myService.set();
        }
    }

}
