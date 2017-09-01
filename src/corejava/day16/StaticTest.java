package corejava.day16;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StaticTest {

	static List<String> list = new ArrayList<>();
	
	Map<List<String>,String> map;
	
	final int i ;
	{
		i=0;
	}
	public void test() {
		
		final int a;
		a=0;
		System.out.println(a);
		
	}
	
	{
		System.out.println(" block");
	}
	
	public StaticTest() {
//		i = 0;
	}
	public StaticTest(int b) {
//		i = b;
	}
	public static void main(String[] args) {
		
	}
}
