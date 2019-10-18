package wangmj.thread.chapter_5.timer_timerTask;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *  Timer.schedule(TimerTask task, Date time): 在指定的日期执行一次某个任务
 *
 *  本例中TimerTask任务执行的时间晚于当前时间
 *
 *  从Timer的构造方法可以看到，创建一个Timer实例，就会启动一个新的线程，这个线程不是守护线程，会一直运行。本例中的表现是在任务线程执行完之前和之后，main线程一直处于运行状态
 */
public class Run1 {

//    private static Timer timer = new Timer();
    private static Timer timer = new Timer(true); //让Timer新开的线程变成守护线程。这种情况下，main运行结束后就会结束进程，TimerTask的任务也不会被运行，因为进程都已经结束了

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
            String dateString = "2019-10-18 11:16:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间： " + dateRef.toLocaleString() + " 当前时间： " + new Date().toString());
            timer.schedule(myTask, dateRef);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

}
