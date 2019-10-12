package wangmj.thread.chapter_3.wait_notify.example_1;

public class ThreadB extends Thread {

    private MyList list;

    public ThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        System.out.println("线程B开始");
        try {
            while (true){
                System.out.println(this.list.size());
                if (this.list.size() >= 5){
                    System.out.println("==5了，线程B要退出了！");
                    throw new InterruptedException();
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
