package test;

import org.junit.Test;

public class 可变参数 {

	@Test
	public void a_test() throws Exception {
		new A0916();
	}
	
	@Test
	public void b_test() throws Exception {
		new B0916();
	}
}

class A0916{
	
	public A0916(int[]... a) {
		System.out.println("可变参数构造器");
	}
	
}

class B0916{
	public B0916() {
		System.out.println("无参构造器");
	}
	
	public B0916(int[]... a) {
		System.out.println("可变参数构造器");
	}
	
}