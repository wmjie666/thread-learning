package wangmj.thread.chapter_3.wait_notify.example_1;

/**
 * 线程A和线程B没有通过wait和notify进行通信，而是线程B通过while来检测条件，这样会浪费CPU
 */
public class Run {
    public static void main(String[] args){
        MyList myList = new MyList();
        ThreadA threadA = new ThreadA(myList);
        threadA.setName("A");
        threadA.start();

        ThreadB threadB = new ThreadB(myList);
        threadB.setName("B");
        threadB.start();
    }

}
