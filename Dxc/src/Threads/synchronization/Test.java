package Threads.synchronization;

public class Test extends Thread {
	public void run() {
		
		for(int i=0;i<6;i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			
			

		}
		
		
	}
	public static void main(String[] args) {
		Test t1=new Test();
		Test t2=new Test();
		t1.start();
		t2.start();
		
	}
}
