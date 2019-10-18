package wangmj.thread.chapter_5.timer_timerTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer中允许有多个TimerTask任务
 * 本例是多个TimerTask任务及延时测试：TimerTask是以队列的方式一个一个被顺序执行的，所以执行的时间有可能和预期的时间不一致，因为前面的任务有可能消耗的时间较长，则后面的任务运行时间也会被延迟
 */
public class Run3 {

    private static Timer timer = new Timer();

    public static class MyTask1 extends TimerTask{

        @Override
        public void run() {
            System.out.println("运行了！ 时间为： " + new Date());
        }
    }

    public static class MyTask2 extends TimerTask{

        @Override
        public void run() {
            System.out.println("运行了！ 时间为： " + new Date());
        }
    }

    public static void main(String[] args){
        try {
            MyTask1 task1 = new MyTask1();
            MyTask2 task2 = new MyTask2();

            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String dateString1 = "2019-10-18 11:34:00";
            String dateString2 = "2019-10-18 11:35:00";

            Date date1 = sdf1.parse(dateString1);
            Date date2 = sdf2.parse(dateString2);

            System.out.println("字符串1时间： " + date1.toLocaleString() + " 当前时间： " + new Date().toString());
            System.out.println("字符串2时间： " + date1.toLocaleString() + " 当前时间： " + new Date().toString());

            timer.schedule(task1, date1);
            timer.schedule(task2, date2);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
