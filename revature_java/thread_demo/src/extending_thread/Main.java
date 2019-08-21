package extending_thread;

public class Main {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Thread t = Thread.currentThread();
		t.setName("mymain");
		t.setPriority(6);
		System.out.println(Thread.currentThread());
		// System.out.println(7/0);
		MyThread t1=new MyThread();
		t1.setName("mt1");
		MyThread t2=new MyThread();
		t2.setName("mt2");
		MyThread t3=new MyThread();
		t3.setName("mt3");
		MyThread t4=new MyThread();
		t4.setName("mt4");
		MyThread t5=new MyThread();
		t5.setName("mt5");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		for (int i = 0; i < 3; i++) {
			System.out.println("Printing from "+Thread.currentThread().getName()+" value of i = "+i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		
	}
}
