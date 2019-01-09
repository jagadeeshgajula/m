package ThreadEx;

public class Test extends Thread{

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName() + " "+i);
		}
	}
	
	public static void main(String args[])
	{
		Test t1 = new Test();
		Test t2 = new Test();
		t1.start();
		t2.start();
	}
}
