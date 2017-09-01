package corejava.day18_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TranscodingTest {

	public static void main(String[] args) {

		File file = new File("R:\\JD1708\\corejava\\corejava_day19\\exercise\\exercise3\\a.txt");
		
		//需要替换的字符串
		String oldStr = "*****  ******";
		//新字符串
		String newStr = "核心提示：第十二任台湾地区领导人选举今日举行，马萧(马英九、萧万长)竞选总部统计宣称已获得超过700万张选票，自行宣布当选。 ";
		//临时保存文件内容
		String txt = "";
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		
		try {
			//输入流
			fis = new FileInputStream(file);
			
			isr = new InputStreamReader(fis,"UTF-8");
			
			char[] cbuf = new char[32];
			
			while( (isr.read(cbuf)) != -1) {
				
				txt+=new String(cbuf);
				
			}
			
			//替换字符串
			txt=txt.replace(oldStr, newStr);
			
			//输出流
			fos = new FileOutputStream(file);
			
			osw = new OutputStreamWriter(fos, "GBK");
			
			osw.write(txt);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(osw!=null) {
				try {
					osw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(isr!=null) {
				try {
					isr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fis!=null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
