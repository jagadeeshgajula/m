package ThreadSynchronizaion;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
    Processor proc1 = new Processor();
    proc1.start();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter return to stop.....");
        s.nextLine();
        proc1.shutdown();
        
    }
    
}
