package wangmj.thread.chapter_3.wait_notify.example_9;

public class BackupBThread extends Thread {

    private DBTools dbTools;

    public BackupBThread(DBTools dbTools) {
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }

}
