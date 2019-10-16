package wangmj.thread.chapter_3.join.example_3;

public class ThreadA extends Thread {

    private ThreadB b;

    public ThreadA(ThreadB b) {
        this.b = b;
    }

    @Override
    public void run() {
        try {
            synchronized (b){
                b.start();

                //sleep方法不释放锁，则在sleep结束之前，线程b的同步方法无法被其他线程调用
//                Thread.sleep(6000);

                //join方法释放对象锁，则在join的过程中，线程b的同步方法可以被其他线程调用
                b.join();
                for (int i=0; i<Integer.MAX_VALUE; i++){
                    String newString = new String();
                    Math.random();
                }
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
