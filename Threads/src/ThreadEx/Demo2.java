
package ThreadEx;

/**
 *
 * @author jagadeesh
 */
public class Demo2 {
    public static void main(String[] args) {
        Runner2 r=new Runner2();
        Thread t1 = new Thread(r);
        t1.start();
        Thread t2 = new Thread(r);
        t2.start();
    }
}
