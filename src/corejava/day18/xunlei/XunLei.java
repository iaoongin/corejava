package corejava.day18.xunlei;

import java.util.HashMap;
import java.util.Map;

public class XunLei {

	private String url;
	
	private String savePath;
	
	private int threadCounts = 3;
	
	
	
	/**
	 * 根据文件长度分割出每个线程下载的起始和结束点
	 * @param length
	 * @param count
	 * @return 一个起止点map
	 */
	public static Map<Long,Long> splitForPoint(long length,int count) {

		long[] bytes= new long[count];

		long per = length/count;

		Map<Long,Long> startStop = new HashMap<>();

		for(int i =0;i<bytes.length-1;i++) {
			startStop.put(i*per,(i+1)*per);
			bytes[i]=per;
		}
		bytes[bytes.length-1] =  per+length%count;
		startStop.put((bytes.length-1)*per,(bytes.length)*per+length%count);

		return startStop;
	}
}
