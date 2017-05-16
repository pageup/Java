package Threads;

/**
 * Created by pageup on 16/05/2017.
 */

public class Multithread implements Runnable {
    private int num;
    private Thread t;
    public Multithread(int num) {
        super();
        this.num = num;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){
        if(num <=3){
            System.out.println("I am " + num + " generation");
            Multithread t1 = new Multithread(num + 1);
            Multithread t2 = new Multithread(num + 1);
            Multithread t3 = new Multithread(num + 1);
        }
    }

}