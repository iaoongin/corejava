package corejava.day18_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileIOStreamTest {

	public static void main(String[] args) {
		
		
		
		String filePath = "C:\\Users\\XHX\\Desktop\\qaq.txt";
		File file = new File(filePath);
		FileInputStream fis = null;
		OutputStream os = System.out;
		
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		try {
			
			fis = new FileInputStream(filePath);
			
			byte[] buf = new byte[1024];
			int len = 0;
			while( (len=fis.read(buf))!=-1){
//				System.out.println(len);
				os.write(buf);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if(fis!=null) {
				
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
