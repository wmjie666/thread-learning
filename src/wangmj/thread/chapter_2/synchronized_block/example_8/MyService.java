package wangmj.thread.chapter_2.synchronized_block.example_8;


public class MyService {

    public MyOneList addServiceMethod(MyOneList list, String data){
        try {
//            synchronized (list){  //将getSize和add放入同步块，进行同步处理。两个线程都是对同一个list对象进行操作，是一个单例，所以可以作为对象锁
                if (list.getSize() < 1){
                    Thread.sleep(2000);
                    list.add(data);
                }
//            }
            if (list.getSize() < 1){
                Thread.sleep(2000);
                list.add(data);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return list;
    }

}
