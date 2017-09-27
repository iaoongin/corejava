package exercises;

public class SuperGetClass extends A{

	public static void main(String[] args) {
		
		SuperGetClass superGetClass = new SuperGetClass();
		
		System.out.println(superGetClass.getClass().getName());
		
		superGetClass.test();
		superGetClass.testSuper();
	}
	
	public void test() {
		System.out.println(super.getClass().getName());
	}
	public void testSuper() {
		System.out.println(getClass().getSuperclass().getName());
	}
}

class A{
	
}
