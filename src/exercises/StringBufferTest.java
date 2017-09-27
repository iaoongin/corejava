package exercises;

import java.util.Date;

public class StringBufferTest {

	public static void main(String[] args) {
		
		StringBufferTest test = new StringBufferTest();
		
		System.out.println(test.timerString());
		System.out.println(test.timerStringBuffer());
	}
	
	public long timerString() {
		String str = "";
		Date date = new Date();
		long a = date.getTime();
		for (int i = 0; i < 10000; i++) {
			str += i;
		}
		date = new Date();
		long b = date.getTime();
		System.out.println(b+"  "+a);
		return b-a;
	}
	
	public long timerStringBuffer() {
		StringBuffer str = new StringBuffer("");
		Date date = new Date();
		long a = date.getTime();
		for (int i = 0; i < 10000; i++) {
			str.append(i);
		}
		date = new Date();
		long b = date.getTime();
		System.out.println(b+"  "+a);
		return b-a;
	}
}
