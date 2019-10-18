package wangmj.thread.chapter_5.timer_timerTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 当TimerTask运行的时间早与当前时间，则立刻执行
 */
public class Run2 {

    private static Timer timer = new Timer();

    public static class MyTask extends TimerTask{

        @Override
        public void run() {
            System.out.println("运行了！时间为： " + new Date());
        }
    }

    public static void main(String[] args){
        try {
            Run1.MyTask myTask = new Run1.MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2019-10-18 11:16:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间： " + dateRef.toLocaleString() + " 当前时间： " + new Date().toString());
            timer.schedule(myTask, dateRef);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
