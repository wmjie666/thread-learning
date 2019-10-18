package wangmj.thread.chapter_5.timer_timerTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 本例也是测试多个TimerTask任务及延时：Task是被放入队列中的，得一个一个顺序执行，前面任务的执行时间会影响后面的任务的开始执行时间
 */
public class Run4 {

    private static Timer timer = new Timer();

    public static class MyTask1 extends TimerTask{

        @Override
        public void run() {
            try {
                System.out.println("1 begin 运行了！时间为： " + new Date());
                Thread.sleep(20000);
                System.out.println("1 end 运行了！时间为： " + new Date());
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static class MyTask2 extends TimerTask{

        @Override
        public void run() {
            System.out.println("2 begin 运行了！时间为： " + new Date());
            System.out.println("运行了！时间为： " + new Date());
            System.out.println("1 end 运行了！时间为： " + new Date());
        }
    }

    public static void main(String[] args){
        try {
            MyTask1 task1 = new MyTask1();
            MyTask2 task2 = new MyTask2();

            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            String dateString1 = "2019-10-18 11:41:00";
            String dateString2 = "2019-10-18 11:42:00";

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
