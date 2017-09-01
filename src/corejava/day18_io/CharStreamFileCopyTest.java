package corejava.day18_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharStreamFileCopyTest {

	public static void main(String[] args) {
		
		File originFile = new File("C:\\Users\\XHX\\Desktop\\qaq.txt");
		
		File targetFile = new File("C:\\Users\\XHX\\Desktop\\aqa.txt");
		
		fileCopy(originFile, targetFile);
	}
	
	public static void fileCopy(File originFile,File targetFile) {
		
		if(!originFile.exists()) {
			throw new RuntimeException("源文件不存在");
		}
		
		if(!targetFile.exists()) {
			throw new RuntimeException("目标文件不存在");
		}else {
			if(!targetFile.canWrite()) {
				throw new RuntimeException("目标文件不可写");
			}
		}
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			fr = new FileReader(originFile);
			
			br = new BufferedReader(fr);
			
			String str = "";
			fw = new FileWriter(targetFile);
			pw = new PrintWriter(fw);
			
			while((str=br.readLine())!=null) {
				
				pw.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pw!=null) {
				pw.close();
			}
			if(fw!=null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fr!=null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
