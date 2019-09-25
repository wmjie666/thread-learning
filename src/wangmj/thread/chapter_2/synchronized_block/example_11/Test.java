package wangmj.thread.chapter_2.synchronized_block.example_11;

/**
 * 数据类型String具有常量池缓存的功能，虽然定义的是不同变量，但有可能指向的是同一个常量，所以synchronized(string)不建议使用，而是用new Object()作为参数
 */
public class Test {
    public static void main(String[] args){
        String a = "a";
        String b = "a";
        System.out.println(a==b);
    }
}
