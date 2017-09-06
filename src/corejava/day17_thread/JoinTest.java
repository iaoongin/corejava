package corejava.day17_thread;

public class JoinTest extends Thread{

	public JoinTest(String name) {
		
		super(name);
	}
	
	@Override
	public void run() {
		
		for(int i = 1;i<=1000;i++) {
			
			System.out.println(getName()+" "+i);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		new JoinTest("A").start();
		
		for (int i = 0; i < 20; i++) {
			
			System.out.println(Thread.currentThread().getName()+" "+i);
			
			if(i==10) {
				JoinTest jt = new JoinTest("B");
				jt.start();
				jt.join(1);
			}
		}
	}
	
}
