package wangmj.thread.chapter_2.synchronized_block.example_6;

public class Service {

    private String usernameParam;
    private String passwordParam;
    private String anyString = new String();

    public void setUsernamePassword(String username, String password){
        try {
//            String anyString = new String();  //如果使用这条语句，则synchronized(非this对象)采用的都是不同对象锁，不需要等待锁释放，会异步执行
            synchronized (anyString){
                System.out.println("线程名称为： " + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入同步块");
                usernameParam = username;
                Thread.sleep(3000);
                passwordParam = password;
                System.out.println("线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开同步块");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
