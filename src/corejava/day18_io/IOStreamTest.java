package corejava.day18_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStreamTest {

	public static void main(String[] args){

		//输入流
		InputStream is = System.in;

		int read = 0;
		byte[] buf = new byte[16];
		int len = 0;
		try {
			//len返回写入buf的长度
			is.skip(2);
			while((len = is.read(buf))!=-1) {
				
				System.out.println(new String(buf,0,len));
				
				for (byte b : buf) {
					System.out.print(b+" ");
				}
				
			}
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(is!=null)
					is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//read(byte)
		
//		read = is.read(buf);
//		System.out.println(read);
//		
//		for (byte b : buf) {
//			System.out.println(b);
//		}
		
	//read()
//		while((read = is.read())!=-1) {
//			char c = (char) read;
//			System.out.println(c+" "+read);
//		}
		
		//输出流
/*		OutputStream os = System.out;
		
		String str = "hello world";
		
		try {
			//写出字节数组
//			os.write(str.getBytes());
			//写出单个字节
//			for (byte b : str.getBytes()) {
//				os.write(b);
//			}
			
			//边读边写
			byte[] b2 = new byte[32];
			int len2 = 0;
			while( (len2=is.read(b2))!=-1) {
				os.write(b2);
//				for (byte b : b2) {
//					os.write(b);
//				}
			}
			//保证完成写出
			os.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if(os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}*/
	}
	
}
