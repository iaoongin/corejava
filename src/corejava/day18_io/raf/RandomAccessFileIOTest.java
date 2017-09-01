package corejava.day18_io.raf;

import java.io.RandomAccessFile;

import org.junit.Test;

public class RandomAccessFileIOTest {

	@Test
	public void testRandomRead() throws Exception {
		RandomAccessFile raf = new RandomAccessFile("src/corejava/day18_io/raf/a.txt", "rw");
//		raf.seek(100);
		
		String line = "";
		for (int i = 0; i < 50; i++) {
			raf.write(i);
		}
//		while( (line=raf.readLine()) != null) {
//			System.out.println(line);
//		}
		
	}
}
