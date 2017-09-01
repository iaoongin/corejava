package corejava.day18_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CopyTest {

	public static void main(String[] args) throws Exception {

		String path = "C:\\Users\\XHX\\Desktop\\qaq.txt";

		File file = new File(path);

		File f1 = new File(path.substring(0, path.length()-4)+"-1.txt");
		File f2 = new File(path.substring(0, path.length()-4)+"-2.txt");
		File f3 = new File(path.substring(0, path.length()-4)+"-3.txt");
		List<File> list = new ArrayList<>();

		list.add(f1);
		list.add(f2);
		list.add(f3);

		FileInputStream fis = null;

		fis = new FileInputStream(file);

		FileOutputStream fos1 = new FileOutputStream(f1);
		FileOutputStream fos2 = new FileOutputStream(f2);
		FileOutputStream fos3 = new FileOutputStream(f3);
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=fis.read(buf))!=-1) {

			fos1.write(len);
			fos2.write(len);
			fos3.write(len);

		}
		
		fos1.close();
		fos2.close();
		fos3.close();
		fis.close();

	}
}
