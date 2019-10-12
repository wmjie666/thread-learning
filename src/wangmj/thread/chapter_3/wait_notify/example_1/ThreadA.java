package wangmj.thread.chapter_3.wait_notify.example_1;

public class ThreadA extends Thread{

    private MyList list;

    public ThreadA(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        System.out.println("线程A开始");
        try {
            for (int i=0; i<10; i++){
                list.add();
                System.out.println("添加了" + (i+1) + "个元素");
                Thread.sleep(1000);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
