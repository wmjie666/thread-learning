package wangmj.thread.chapter_2.volatile_keyword.example_5;

public class Service {

    private boolean isContinueRun = true;

    public void runMethod(){
        while (isContinueRun == true){
            System.out.println("循环中");
        }
        System.out.println("停下来了！");
    }

    public void stopMethod(){
        isContinueRun = false;
    }

}
