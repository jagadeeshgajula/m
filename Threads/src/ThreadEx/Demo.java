
package ThreadEx;

public class Demo {
    public static void main(String[] args) {
        Runner r1 = new Runner();
        Runner r2 = new Runner();
        r1.start();
        r2.start();
    }
    
}
