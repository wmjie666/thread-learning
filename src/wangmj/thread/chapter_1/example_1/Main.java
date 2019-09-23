package wangmj.thread.chapter_1.example_1;

public class Main {
    public static void main(String[] args){  //从结果看，出现了线程不安全问题。如果在doPost方法前加上synchronized关键字可解决
        ALogin a = new ALogin();
        a.setName("A");
        a.start();
        BLogin b = new BLogin();
        b.setName("B");
        b.start();
    }
}
