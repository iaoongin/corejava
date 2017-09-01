package corejava.day18.xunlei;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class MyXunLei {

	public static void main(String[] args) throws Exception {
		
		//url 资源地址
		
		String urlname = "http://localhost:8089/share/ws.zip";
//		String urlname = "http://localhost:8089/share/lanter.exe";
//		String urlname = "http://localhost:8089/share/new.jpg";
		
		//保存文件地址
		File target = new File("C:\\Users\\XHX\\Desktop\\cpoy-"+generateFileName(urlname));
		
		//启用连接获取文件大小
		URL url = new URL(urlname);
		URLConnection connection = url.openConnection();
		
		long length = connection.getContentLengthLong();
		
		System.out.println(length);
		
		RandomAccessFile raf = new RandomAccessFile(target, "rw");
		//创建相同大小的
		raf.setLength(length);
		raf.close();
		
//		拆分出每块的起止位置
//		Map<Long, Long> map = XunLei.splitForPoint(length, 1);
//		
//		System.out.println(map);
//		
//		Set<Long> set = map.keySet();
		
		//单线程测试
		DownThread thread = new DownThread(urlname, target, 0, length);
		
		thread.start();
		
//		for (Long l : set) {
//			//启用多个连接，多线程下载
//			URL url2 = new URL(urlname);
//			HttpURLConnection connection2 = (HttpURLConnection)url2.openConnection();
//			int code = connection2.getResponseCode();
//			System.out.println(code);
//			if(code==200) {
//				InputStream is0 = url2.openStream();
//				new DownThread(is0, target, l, map.get(l)).start();
//			}
//		}
		
	}
	
	@Test
	public void testURLStream() throws Exception {
		String urlname = "http://localhost:8089/share/new.jpg";
		InputStream is0 = new URL(urlname).openStream();
		FileOutputStream fos = new FileOutputStream("C:\\Users\\XHX\\Desktop\\testURLStream.jpg");
		byte[] b = new byte[1024];
		while(is0.read(b)!=-1) {
			fos.write(b);
		}
		fos.close();
	}
	
	@Test
	public void testGFN() {
		System.out.println(generateFileName("http://localhost:8089/share/ws.zip"));
	}
	
	/**
	 * 根据url生成文件名
	 * @param urlName
	 * @return 文件名
	 */
	public static String generateFileName(String urlName) {
		
		String[] str = urlName.split("[/]");
		
		return str[str.length-1];
		
		
	}
}
