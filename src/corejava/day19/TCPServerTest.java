package corejava.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerTest {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket s = null;
		OutputStream os = null;
		InputStream is = null;

		//1，创建serverSocket
		try {
			//只开启一个serverSocket
			ss = new ServerSocket(10008);

			try {

				//2，等待客户端发送过来的socket
				s = ss.accept();

				//3,
				os  = s.getOutputStream();
				is = s.getInputStream();
				//4，封装流
				BufferedReader br = new BufferedReader(new InputStreamReader(is));
				PrintStream ps = new PrintStream(os);
				
				//读数据线程
				new ReadThread(br).start();

				//写入数据线程
				new WriteThread(ps).start();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				//只开启一个socket，不能关流
				//				ClosableUtils.close(is);
				//				ClosableUtils.close(s);
			}


		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			ClosableUtils.close(ss);
		}
	}
}