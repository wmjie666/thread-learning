package wangmj.thread.chapter_4.otherMethod.getHoldCount;

/**
 * lock.getHoldCount()方法：查询当前线程保持 此 锁定 的个数， 即调用lock()方法的次数
 */
public class Run {
    public static void main(String[] args){
        Service service = new Service();
        service.serviceMethod1();
    }
}
