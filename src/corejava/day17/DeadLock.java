package corejava.day17;

public class DeadLock extends Thread{

	private static Integer a = 0;
	private static Integer b = 1;

	public DeadLock(String name) {

		super(name);

	}

	@Override
	public void run() {
		
		System.out.println(getName()+" is running ...");

		while(true) {
			
			if(getName().equals("A")) {

				synchronized (a) {
					synchronized (b) {
						System.out.println(getName());
					}
				}
			}else {
				synchronized (b) {
					synchronized (a) {
						System.out.println(getName());
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {

		DeadLock dl1 = new DeadLock("A");
		DeadLock dl2 = new DeadLock("B");

		dl1.start();
		dl2.start();
	}
}

