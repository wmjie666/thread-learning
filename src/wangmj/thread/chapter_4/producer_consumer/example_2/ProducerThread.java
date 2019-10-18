package wangmj.thread.chapter_4.producer_consumer.example_2;

public class ProducerThread extends Thread {

    private MyService myService;

    public ProducerThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i=0; i<200; i++){
            myService.set();
        }
    }

}
