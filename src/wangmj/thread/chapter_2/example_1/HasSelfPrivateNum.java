package wangmj.thread.chapter_2.example_1;

public class HasSelfPrivateNum {

    private int num = 0;

    synchronized public void addNum(String username){
        try {
            if (username.equals("a")){
                num = 100;
                System.out.println("a set over");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("b set over");
            }
            System.out.println("username=" + username + " num=" + num);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
