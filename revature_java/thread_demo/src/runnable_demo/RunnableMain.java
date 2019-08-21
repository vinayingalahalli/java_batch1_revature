package runnable_demo;

public class RunnableMain {
	public static void main(String[] args) {
	
		RunnableThread r1=new RunnableThread();
		RunnableThread r2=new RunnableThread();
		RunnableThread r3=new RunnableThread();
		RunnableThread r4=new RunnableThread();
		RunnableThread r5=new RunnableThread();
		
		Thread t1=new Thread(r1, "run-1");
		Thread t2=new Thread(r2, "run-2");
		Thread t3=new Thread(r3, "run-3");
		Thread t4=new Thread(r4, "run-4");
		Thread t5=new Thread(r5, "run-5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
			t5.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
		System.out.println("Main ends here");
		
	}
}
