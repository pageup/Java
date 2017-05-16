package Threads;

/**
 * Created by pageup on 16/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        Thread thr1=new Thread(new NewThread(),"2 thread");
        Thread thr2=new Thread(new NewThread(),"3 thread");
        Thread thr3=new Thread(new NewThread(),"4 thread");
        thr1.start();
        thr2.start();
        thr3.start();
        System.out.println("Start program");
    }
}