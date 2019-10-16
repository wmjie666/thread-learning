package wangmj.thread.chapter_3.producer_consumer.example_7;

public class Consumer {

    private MyStack myStack;

    public Consumer(MyStack myStack) {
        this.myStack = myStack;
    }

    public void popService(){
        myStack.pop();
    }
}
