package wangmj.thread.chapter_4.producer_consumer.example_2;

public class ConsumerThread extends Thread {

    private MyService myService;

    public ConsumerThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i=0; i<200; i++){
            myService.get();
        }
    }

}
