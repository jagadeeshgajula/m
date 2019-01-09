/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadYield;
public class YeildRunnable implements Runnable {

@Override
 public void run() {

 System.out.println("Current Thread:"+Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority());
 Thread.yield();
 System.out.println("Current Thread:"+Thread.currentThread().getName()+" Priority "+Thread.currentThread().getPriority()+" -End");

 }

}
