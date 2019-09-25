package wangmj.thread.chapter_2.volatile_keyword.example_1;

public class PrintString implements Runnable{

//    volatile private boolean isContinuePrint = true;
    private boolean isContinuePrint = true;   //这个变量会存在与公共堆栈和线程的私有栈中

    public boolean isContinuePrint() {  //在变量没有用volatile修饰时，实际上是从线程私有栈中取值
        return isContinuePrint;
    }

    public void setContinuePrint(boolean continuePrint) {  //set操作，实际上是更新的公共栈中的变量值
        isContinuePrint = continuePrint;
    }

    public void printStringMethod(){
        try {
            while (isContinuePrint == true){
                System.out.println("run printStringMethod threadName=" + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        printStringMethod();
    }
}
