package corejava.day18_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PropertiesFile {
	
	public static void main(String[] args) {
		
		System.out.println("输入属性名...");
		
		Scanner sc = new Scanner(System.in);
		
		String key = sc.nextLine();
		
		sc.close();
		
		File file = new File("R:\\JD1708\\corejava\\corejava_day19\\exercise\\exercise2\\message");
		
		FileReader fr = null;
		
		BufferedReader br = null;
		try {
			
			fr = new FileReader(file);
			
			br = new BufferedReader(fr);
			
			String str = "";
			
			boolean flag = false;
			
			while((str=br.readLine())!=null) {
				//以等号拆分
				String[] strs = str.split("=");
				if(strs[0].equals(key)) {
					System.out.println(strs[1]);
					flag = true;
				}
			}
			
			if(!flag) {
				System.out.println("没有找到");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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

