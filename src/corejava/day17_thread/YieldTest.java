package corejava.day17_thread;

public class YieldTest extends Thread{

	@Override
	public void run() {
		
		for (int i = 0; i < 40; i++) {
			
			System.out.println(getName()+" 优先级为"+getPriority()+" "+i);
			
			if(i==20) {
				yield();
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		YieldTest yt1 = new YieldTest();
		YieldTest yt2 = new YieldTest();
		
		yt1.setPriority(MAX_PRIORITY);
		yt2.setPriority(MIN_PRIORITY);
		
		yt1.start();
		yt2.start();
	}
}
