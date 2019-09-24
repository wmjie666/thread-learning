package wangmj.thread.chapter_2.synchronized_method.example_5;

public class MyService {

    synchronized public void service1(){
        System.out.println("service1");
        service2();
    }

    synchronized public void service2(){
        System.out.println("service2");
        service3();
    }

    synchronized public void service3(){
        System.out.println("service3");
    }

}
