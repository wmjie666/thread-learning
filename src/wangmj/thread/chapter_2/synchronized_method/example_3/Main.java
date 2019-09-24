package wangmj.thread.chapter_2.synchronized_method.example_3;

/**
 * 当MyObject对象中methodA有synchronized,而methodB没有时,线程A和线程B可以异步执行,尽管线程A先持有了object对象的锁,但是线程B依旧可以调用非synchronized方法
 *
 * 当Myobject对象中methodA和methodB都有synchronized时,由于synchronized产生的是对象锁,所以线程A和线程B会同步执行
 */
public class Main {
    public static void main(String[] args){
        MyObject myObject = new MyObject();
        ThreadA a = new ThreadA(myObject);
        a.setName("A");
        ThreadB b = new ThreadB(myObject);
        b.setName("B");
        a.start();
        b.start();
    }
}
