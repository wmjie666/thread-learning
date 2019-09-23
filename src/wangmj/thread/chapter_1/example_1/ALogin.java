package wangmj.thread.chapter_1.example_1;

public class ALogin extends Thread {

    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("a", "aa");
    }
}
