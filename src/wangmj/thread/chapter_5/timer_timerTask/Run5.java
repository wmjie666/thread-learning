package wangmj.thread.chapter_5.timer_timerTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * schedule(TimerTask task, Date firstTime, long period): 在指定的日期之后，按指定的间隔周期性的无限循环的执行某一任务
 */
public class Run5 {

    public static class MyTask extends TimerTask{

        @Override
        public void run() {
            System.out.println("运行了！时间为： " + new Date());
        }
    }

    public static void main(String[] args){
        try {
            MyTask myTask = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2019-10-18 15:21:00";
            Timer timer = new Timer();
            Date date = sdf.parse(dateString);
            System.out.println("字符串时间： " + date.toLocaleString() + " 当前时间： " + new Date().toString());
            timer.schedule(myTask, date, 4000);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }


}
