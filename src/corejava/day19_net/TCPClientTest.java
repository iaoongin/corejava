package corejava.day19_net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Scanner;

public class TCPClientTest {

	public static void main(String[] args) {

		Socket socket = null;
		InputStream is = null;
		OutputStream os = null;
		BufferedReader br = null;
		PrintStream ps = null;
		//1,创建客户端的socket
		try {
			//只开启一个
			socket = new Socket("127.0.0.1", 10008);
		} catch (UnknownHostException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {

			//2,获取输入输出流
			is = socket.getInputStream();
			os = socket.getOutputStream();

			//3,封装流
			br = new BufferedReader(new InputStreamReader(is));
			ps = new PrintStream(os);

			//4,读写数据
				//读数据线程
			new ReadThread(br).start();

				//写入数据线程
			new WriteThread(ps).start();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//5，关闭资源
			//				ClosableUtils.close(br);
			//				ClosableUtils.close(bw);
			//				ClosableUtils.close(socket);
		}
	}
}
