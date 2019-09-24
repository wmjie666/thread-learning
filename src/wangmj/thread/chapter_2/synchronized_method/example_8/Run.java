package wangmj.thread.chapter_2.synchronized_method.example_8;

/**
 * 同步不可以继承：父类的synchronized方法，子类复写时如果没有synchronized，则子类的这个方法不是同步方法
 */
public class Run {
    public static void main(String[] args){
        Sub sub = new Sub();
        MyThread a = new MyThread(sub);
        a.setName("A");
        a.start();
        MyThread b = new MyThread(sub);
        b.setName("B");
        b.start();
    }
}
