package corejava.day18_io;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		
		File file = new File("src/setting.properties");
		File dir = new File("src");
		
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		System.out.println(file.getParent());
		
		System.out.println(dir.getPath());
		System.out.println(dir.getAbsolutePath());
		System.out.println(dir.getName());
		System.out.println(dir.length());
		
	}
}
