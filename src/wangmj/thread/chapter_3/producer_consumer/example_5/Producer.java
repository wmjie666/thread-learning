package wangmj.thread.chapter_3.producer_consumer.example_5;

public class Producer {

    private MyStack myStack;

    public Producer(MyStack myStack) {
        this.myStack = myStack;
    }

    public void pushService(){
        myStack.push();
    }

}
