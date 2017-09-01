package corejava.day16;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest {

	//可以重载
	public static void main(String args) {
		
	}
	
	public static void main(String[] args) {
		
		List<? extends Number> list = new ArrayList<Number>();
		
		Integer i = 1;
		
//		list.add(1);	//不能传int
//		list.add(i);	//不能传Integer
//		list.add((Number)i);	//不能传Number
		try {
			list.get(0);
		}catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		List<? super Integer> li = new ArrayList<Object>();
		
		Number n = new Integer(1);
		
//		li.add(new Short(1));	
		li.add(i);
		li.add(2);
//		li.add(new Object());
//		li.add(n);	//不能add(Number)
		
		Integer in = (Integer)li.get(0);
		System.out.println(in);
	}
}
