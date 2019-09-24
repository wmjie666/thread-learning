package wangmj.thread.chapter_2.synchronized_method.example_1;

/**
 * 测试synchronized同步方法
 * 当多个线程访问同一个对象时: 哪个线程先执行带synchronized关键字的方法,哪个线程就持有该方法所属对象的锁Lock,其他线程就需要等待
 * 下面示例的线程访问的不是同一个对象,所以synchronized方法执行没有同步效果,而是各自执行,也没有非线程安全问题
 */
public class Main2 {
    public static void main(String[] args){
        HasSelfPrivateNum hasSelfPrivateNum1 = new HasSelfPrivateNum();
        HasSelfPrivateNum hasSelfPrivateNum2 = new HasSelfPrivateNum();
        ThreadA threadA = new ThreadA(hasSelfPrivateNum1);
        threadA.start();
        ThreadB threadB = new ThreadB(hasSelfPrivateNum2);
        threadB.start();
    }
}
