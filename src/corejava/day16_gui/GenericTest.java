package corejava.day16_gui;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

	public static void main(String[] args) {
		List<B> l1 = new ArrayList<>();
	//	l1.add(new A());
		
		List<A> l2 = new ArrayList<>();
		l1.add(new B());
	}
}

class A{
	
}

class B extends A{
	
}