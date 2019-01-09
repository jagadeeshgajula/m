
package ThreadsConcept;

public class RacerDemo {
    public static void main(String[] args) {
        Racer racer = new Racer();
        Thread tortoiseThread = new Thread(racer,"Tortoise");
        Thread hareThread = new Thread(racer,"Hare");
        // to start threads start() method is used
        tortoiseThread.start();
        hareThread.start();
    }
    
}
