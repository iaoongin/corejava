package corejava.day18.xunlei;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RandomAccessFileTest {


	public static void main(String[] args) throws Exception {

		File source = new File("C:\\Users\\XHX\\Desktop\\1.jpg");

		File target = new File("C:\\Users\\XHX\\Desktop\\xfd2.jpg");

		RandomAccessFile raf = new RandomAccessFile(target, "rw");

		System.out.println(source.length());

		raf.setLength(source.length());
		
		raf.close();

		int count = 10;

		Map<Long, Long> map = splitForPoint(source.length(), count);

		Set<Long> keySet = map.keySet();

		System.out.println(map);

//				new DownThread(source, target, 0, 37931).start();
//				new DownThread(source, target, 37931, 75863).start();

		for (Long l : keySet) {
			FileInputStream fis = new FileInputStream(source);
			new RAFDownThread(fis, target, l, map.get(l)).start();
		}

	}

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
