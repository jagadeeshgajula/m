package ThreadSynchronizaion;

public class Processor extends Thread{
    private boolean running = true;
    @Override
    public void run()
    {
        while(running){
            System.out.println("Hello");
        }
    }
    
    public void shutdown(){
        running = false;
        System.out.println("shutdown");
    }
}
