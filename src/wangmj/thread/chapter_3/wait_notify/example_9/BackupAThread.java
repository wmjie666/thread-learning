package wangmj.thread.chapter_3.wait_notify.example_9;

public class BackupAThread extends Thread {

    private DBTools dbTools;

    public BackupAThread(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }

}
