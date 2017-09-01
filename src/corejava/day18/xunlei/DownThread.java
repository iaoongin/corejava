package corejava.day18.xunlei;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.net.URLConnection;

public class DownThread extends Thread{
	private String urlname;
	private InputStream is;
	private File target;
	private long start;
	private long end;

	public DownThread(String urlname, File target, long start, long end) {
		this.urlname = urlname;
		this.target = target;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		RandomAccessFile targetRaf = null;
		try {
			URL url = new URL(urlname);
			URLConnection connection = url.openConnection();
			
			connection.setReadTimeout(MAX_PRIORITY);
			
			is = connection.getInputStream();
			//为每个线程开启RandomAccessFile
			targetRaf = new RandomAccessFile(target, "rw");
			//都从start点读取写入
			is.skip(start);
			targetRaf.seek(start);
			byte[] buf = new byte[1024];
			while( is.read(buf) !=-1) {
				//目标文件指针超过结束点跳出循环，指针超过文件尾不会改变长度
				if(targetRaf.getFilePointer()>end) {
					break;
				}
				targetRaf.write(buf);
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(targetRaf!=null) {
				try {
					targetRaf.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(is!=null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
