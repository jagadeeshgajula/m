/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadEx;

/**
 *
 * @author jagadeesh
 */
public class Runner extends Thread {

   
    public void run() {
        for(int i=0; i<10; i++)
        {
            try {
                System.out.println(Thread.currentThread().getName()+"  "+i);
                if(Thread.currentThread().getName().equals("Thread-0")&&i==5)
                {
                Thread.sleep(1000*20);
                }
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            
            
        }
    }
    
    
    
}
