package test;

public class 强转 {

	public static void main(String[] args) {
/*		B b = new B();
		A a = (A) b;*/
		
		B b1 = new A();
		A a1 = (A) b1;
		b1 = (B)a1;
		b1.say();
		
	}
	
}
class A extends B{
	
}

class B{
	
	public void say() {
		System.out.println("B");
	}
	
}