package wangmj.thread.chapter_1.priority_thread.rule;

/**
 * 优先级高的线程会被优先执行,但不代表一定是高优先级的全部执行完之后再执行低优先级的,即CPU尽量将执行资源让给优先级高的线程
 * 优先级具有随机性,即优先级高的线程不一定每次都是最先执行
 * 线程执行顺序与优先级有关,和代码顺序无关,同时优先级高,也不一定每次都最先执行
 */
public class Main {
    public static void main(String[] args){
        for (int i=0; i<5; i++){
            PriorityThread3 priorityThread3 = new PriorityThread3();
            priorityThread3.setPriority(1);
            priorityThread3.start();
            PriorityThread4 priorityThread4 = new PriorityThread4();
            priorityThread4.setPriority(10);
            priorityThread4.start();
        }
    }
}
