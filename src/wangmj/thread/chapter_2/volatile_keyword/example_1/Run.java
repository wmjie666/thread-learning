package wangmj.thread.chapter_2.volatile_keyword.example_1;

/**
 * 在JDK64bit环境下，是死循环，原因是printStringService的set操作，操作的是公共栈的变量值，而线程中的判断语句取的是线程私有栈的值。
 * 解决方法：变量用volatile关键字修饰。
 *
 * volatile: 只能修饰变量，增加了实例变量在多个线程之间的可见性，但它不是原子性，也即多个线程同时访问volatile变量时，并不是同步的，如果同时修改，就会出现非线程安全问题
 * synchronized: 可以修饰方法和代码块，可以保证原子性，即多线程访问时的同步阻塞，也保证可见性，因为它会保证私有内存和公共内存的数据同步。
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        PrintString printStringService = new PrintString();
        new Thread(printStringService).start();
        Thread.sleep(3000);
        System.out.println("我要停止它！stopThreadName=" + Thread.currentThread().getName());
        printStringService.setContinuePrint(false);
        Thread.sleep(3000);
    }
}
