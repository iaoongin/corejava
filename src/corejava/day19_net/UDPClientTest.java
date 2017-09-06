package corejava.day19_net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClientTest {

	public static void main(String[] args) {
		
		DatagramSocket ds = null;
		
		try {
			//1,创建客户端的ds
			ds = new DatagramSocket();
			
			//2,创建发送给服务器的数据包
			byte[] buf = new byte[1024];
			InetAddress address = InetAddress.getByName("127.0.01");
			DatagramPacket dp = new DatagramPacket(buf, buf.length, address, 10008);
			
			//3,发送数据包
			ds.send(dp);
			
			//4,构建服务器发送过来的数据包
			dp = new DatagramPacket(buf, buf.length);
			
			//5,接收数据包
			ds.receive(dp);
			String str = new String(buf);
			
			System.out.println("客户端接收数据: "+str);
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			//6,关闭资源
			if(ds!=null) ds.close();
		}
		
	}
}
