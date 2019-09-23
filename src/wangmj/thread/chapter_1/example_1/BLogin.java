package wangmj.thread.chapter_1.example_1;

public class BLogin extends Thread {

    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("b", "bb");
    }
}
