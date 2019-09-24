package wangmj.thread.chapter_2.synchronized_method.example_1;

/**
 * 方法内的变量都是线程安全的,因为这些变量都是私有的
 * 对象中的实例变量,如果被多个线程共同访问,则可能出现"非线程安全"问题. 在方法前加上synchronized关键字即可,synchronized取得的是对象锁
 */
public class Main {
    public static void main(String[] args){
        HasSelfPrivateNum hasSelfPrivateNum = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(hasSelfPrivateNum);
        threadA.start();
        ThreadB threadB = new ThreadB(hasSelfPrivateNum);
        threadB.start();
    }
}
