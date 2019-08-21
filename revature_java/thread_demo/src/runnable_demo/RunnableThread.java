package runnable_demo;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
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
