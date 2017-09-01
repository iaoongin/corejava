package corejava.day18_io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedIOStreamTest {

	public static void main(String[] args) {
		
		writeStr("C:\\Users\\XHX\\Desktop\\qaq.txt");
	}
	
	public static void writeStr(String filePath) {
		
		String txt = "豆腐皮";
		
		File f = new File(filePath);
		
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		BufferedOutputStream bos = null;
		
		FileOutputStream fos = null;
		
		try {
			
			fos = new FileOutputStream(f);
			bos = new BufferedOutputStream(fos);
			
			bos.write(txt.getBytes());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			if(bos!=null) {
				
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
			if(fos!=null) {
				
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
