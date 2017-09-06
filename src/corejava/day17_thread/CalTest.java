package corejava.day17_thread;

public class CalTest{

	public static void main(String[] args) {

		Result res = new Result();

		Calculator calculator = new Calculator(res);
		calculator.setName("calculator");

		Printer printer = new Printer(res);
		printer.setName("printer");

		calculator.start();
		printer.start();

	}
}

//计算
class Calculator extends Thread{

	private Result res;

	public Calculator(Result res) {
		this.res = res;
	}

	@Override
	public void run() {
		System.out.println(getName()+" is starting....");
		int sum = 0;
		for(int i = 1;i<=100;i++) {
			sum+=i;
		}
		synchronized (res) {
			res.setVal(sum);
			res.setFlag(true);
			res.notifyAll();
		}


		System.out.println(getName()+" is end");
	}
}

//打印
class Printer extends Thread{

	private Result res;

	public Printer(Result res) {
		this.res = res;
	}

	@Override
	public void run() {

		System.out.println(getName()+" is starting....");

		while(!res.isFlag()) {
			try {
				synchronized (res) {
					res.wait();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("result is "+res.getVal());

		System.out.println(getName()+" is end");
	}
}
