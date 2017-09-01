package corejava.day19;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServerTest {

	public static void main(String[] args) {
		
		DatagramSocket ds = null;
		try {
			//1,创建服务器端
			ds = new DatagramSocket(10008);
			
			//2，准备一个数据包,用来接收客户端发送过来的数据包
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			
			//3,接收数据包
			System.out.println("waiting...");
			ds.receive(dp);
			
			//4,获取客户端的ip和端口号
			InetAddress address = dp.getAddress();
			String host = address.getHostAddress();
			int port = dp.getPort();
			System.out.println("服务器获取数据："+host+":"+port);
			
			//5，准备发给客户端的数据包
			buf = "hello world".getBytes();
			dp = new DatagramPacket(buf, buf.length, address,port);
			
			//6，发送数据包
			ds.send(dp);
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//7,关闭资源
			
			if(ds!=null) ds.close();
		}
	}
}
