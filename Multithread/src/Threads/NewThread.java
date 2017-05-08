package Threads;

/**
 * Created by pageup on 11/27/2015.
 */
public class NewThread implements Runnable{
    @Override
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" - "+i);
        }
    }
}