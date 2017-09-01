package corejava.day16;

public class IntegerTest {

	public static void main(String[] args) {
		
		Integer i1 = 128;
		Integer i2 = 128;
		
		System.out.println(i1==i2);
		
		String s = "11111111111sdsddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
		String c = "11111111111sdsddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
		
		System.out.println(s==c);
		
		
		Character ch1 = 127;
		Character ch2 = 127;
		System.out.println(ch1==ch2);
	}
} 
