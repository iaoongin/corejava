package exercises;

public class PrintRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(Thread.currentThread().getName() + ": " + i);
		}
		System.out.println(Thread.currentThread().getName() + "完成");
	}

}
