package wangmj.thread.chapter_2.synchronized_block.example_3;

public class Task {

    private String data1;
    private String data2;

    public void doLongTimeTask(){
        try {
            System.out.println("begin task");
            Thread.sleep(3000);
            String tempData1 = "长时间处理任务后从远程返回的值1 threadName=" + Thread.currentThread().getName();
            String tempData2 = "长时间处理任务后从远程返回的值2 threadName=" + Thread.currentThread().getName();
            synchronized (this){
                data1 = tempData1;
                data2 = tempData2;
            }
            System.out.println(data1);
            System.out.println(data2);
            System.out.println("end task");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
