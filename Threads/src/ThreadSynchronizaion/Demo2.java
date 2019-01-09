package ThreadSynchronizaion;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo2 {

    private int count = 0;
    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        d1.doWork();
    }
    public synchronized void increment(){
        count++;
    }
    public void doWork(){
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i = 0;i<1000;i++){
                    increment();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                for(int i = 0;i<1000;i++){
                    increment();
                }
            }
        });
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Demo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Count "+count);
    }
}
