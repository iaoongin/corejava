package corejava.day19_net;


import java.io.Closeable;
import java.io.IOException;

public class ClosableUtils {

	public static void close(Closeable closeable) {
		if(closeable!=null) {
			try {
				closeable.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
