package wangmj.thread.chapter_1.example_1;

public class LoginServlet {

    private static String username;
    private static String password;

    synchronized public static void doPost(String usernameRef, String passwordRef){
        try {
            username = usernameRef;
            if (username.equals("a")){
                Thread.sleep(5000);
            }
            password = passwordRef;
            System.out.println("threadName = " + Thread.currentThread().getName() + ": username=" + username + "; password=" + password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
