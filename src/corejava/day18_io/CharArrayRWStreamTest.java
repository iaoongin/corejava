package corejava.day18_io;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayRWStreamTest {

	public static void main(String[] args) {
		
		char[] array1 = "安徽华为氯化钠哈我可能看".toCharArray();
		char[] array2 = new char[array1.length];
		
		CharArrayReader car = new CharArrayReader(array1);
		
		CharArrayWriter caw = new CharArrayWriter();
		try {
			//array1读取到array2
			car.read(array2);
			System.out.println(new String(array2));
			
			//array2读取到caw
			caw.write(new String(array2)+"q");
			System.out.println(caw.toString());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
