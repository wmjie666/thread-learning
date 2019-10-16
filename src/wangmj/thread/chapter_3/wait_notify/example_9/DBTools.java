package wangmj.thread.chapter_3.wait_notify.example_9;

public class DBTools {

    private volatile boolean prevIsA = false;

    synchronized public void backupA(){
        try {
            while (prevIsA == true){
                this.wait();
            }
            for (int i=0; i<5; i++){
                System.out.println("*****************");
            }
            prevIsA = true;
            this.notifyAll();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    synchronized public void backupB(){
        try {
            while (prevIsA == false){
                this.wait();
            }
            for (int i=0; i<5; i++){
                System.out.println("||||||||||||||||||");
            }
            prevIsA = false;
            this.notifyAll();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
