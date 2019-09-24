package wangmj.thread.chapter_2.synchronized_method.example_2;

/**
 * 线程A和B都调用同一个对象myObject的方法methodA,即存在共享资源访问,有synchronized声明的方法一定是排队运行的
 */
public class Main {
    public static void main(String[] args){
        MyObject myObject = new MyObject();
        ThreadA a = new ThreadA(myObject);
        a.setName("A");
        ThreadA b = new ThreadA(myObject);
        b.setName("B");
        a.start();
        b.start();
    }
}
