package corejava.day17;

public class RunStartTest extends Thread{

	@Override
	public void run() {
		
//		System.out.println(this.getName());
		while(true){
		System.out.println(Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		RunStartTest runStartTest = new RunStartTest();
//		runStartTest.run();
		runStartTest.setDaemon(true);
		runStartTest.start();
		
		for(int i = 0 ;i<10;i++) {
			System.out.println(i);
		}
//		runStartTest.start();
	}
}
