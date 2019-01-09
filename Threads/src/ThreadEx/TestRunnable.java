package ThreadEx;

public class TestRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName() + " " + i + " Priority: "+ Thread.currentThread().getPriority());
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestRunnable ts = new TestRunnable();
		
		Thread t1 = new Thread(ts, "first");
		Thread t2 = new Thread(ts,"second");
		Thread t3 = new Thread(ts,"Therd");
		t1.setPriority(1);
		t2.setPriority(10);
		t3.setPriority(5);
		t1.start();
		t2.start();
		t3.start();

	}

}
