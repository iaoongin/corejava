package corejava.day17;

public class Account {

	private double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public static void main(String[] args) {
		Account acc = new Account(10000);
		new People("girl",acc).start();
		new People("boy",acc).start();
	}

	public double withdraw(double amount) {
		if(amount<0||amount>balance) {
			throw new RuntimeException("余额不足");
		}
		balance -= amount;

		return amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}

class People extends Thread{

	private Account acc;

	public People(String name,Account acc) {
		super(name);
		this.acc = acc;
	}

	@Override
	 public void run() {
		try {
			synchronized (acc) {
				System.out.println(getName()+" 取出 "+acc.withdraw(10000)+"余额"+acc.getBalance());
			}
		}catch(RuntimeException e) {
			System.out.println(getName()+"取钱时"+e.getMessage());
		}
	}

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
}
