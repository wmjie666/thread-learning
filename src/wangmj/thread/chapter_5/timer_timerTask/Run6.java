package wangmj.thread.chapter_5.timer_timerTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * TimerTask类的cancel()方法是将自身从任务队列中移除，其他任务不受影响
 *
 * Timer类的cancel()方法是将任务队列中的全部任务清空。但注意该方法有时并不一定会停止执行计划任务，而是正常执行，这是因为Timer类中的cancel()方法又是并没有争抢到queue锁，所以TimerTask类中的任务继续正常执行
 */
public class Run6 {

    private static Timer timer = new Timer();

    public static class MyTaskA extends TimerTask{

        @Override
        public void run() {
            System.out.println("A运行了！时间为： " + new Date());
//            this.cancel();  //TimerTask的cancel()
            timer.cancel();   //Timer的cancel()
        }
    }

    public static class MyTaskB extends TimerTask{

        @Override
        public void run() {
            System.out.println("B运行了！时间为： " + new Date());
        }
    }

    public static void main(String[] args){
        try {
            MyTaskA myTaskA = new MyTaskA();
            MyTaskB myTaskB = new MyTaskB();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2019-10-18 15:35:00";
            Date date = sdf.parse(dateString);
            System.out.println("字符串时间： " + date.toLocaleString() + " 当前时间： " + new Date().toString());
            timer.schedule(myTaskA, date, 4000);
            timer.schedule(myTaskB, date, 4000);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

}
