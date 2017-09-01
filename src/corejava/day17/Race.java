package corejava.day17;

public class Race{

	public static void main(String[] args) {
		
		RabbitAndTurtle tor = new RabbitAndTurtle("----乌龟");
		RabbitAndTurtle rab = new RabbitAndTurtle("兔子----");
		tor.start();
		rab.start();

	}
}

class RabbitAndTurtle extends Thread{

	private static boolean isRunning = false;

	public RabbitAndTurtle(String name) {
		super(name);
	}

	@Override
	public void run() {
		isRunning = true;
		while(isRunning) {
//			double d = Math.random();
		}
		for(int i = 0;isRunning&&i<=100;i++) {
			System.out.println(Thread.currentThread().getName()+" 跑了 "+i+"米");
		}
		isRunning = false;
	}
	
}
