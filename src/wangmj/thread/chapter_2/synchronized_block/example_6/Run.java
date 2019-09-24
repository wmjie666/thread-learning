package wangmj.thread.chapter_2.synchronized_block.example_6;

/**
 * 多个synchronized(非this对象)中的  ”非this对象“  是同一个对象时，也存在竞争关系，即同一个对象锁
 */
public class Run {
    public static void main(String[] args){
        Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
