package wangmj.thread.chapter_3.wait_notify.example_9;

/**
 * 备份数据库到A 和 备份数据库到B 各10各线程，交替进行
 *
 * 交替打印的原理:
 * 1、使用了标记 private volatile boolean prevIsA = false;
 * 2、while进行条件循环
 * 3、notifyAll()唤醒
 */
public class Run {
    public static void main(String[] args){
        DBTools dbTools = new DBTools();
        for (int i=0; i<10; i++){
            new BackupBThread(dbTools).start();
            new BackupAThread(dbTools).start();
        }
    }

}
