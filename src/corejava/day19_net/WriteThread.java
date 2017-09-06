package corejava.day19_net;

import java.io.PrintStream;
import java.util.Scanner;

public class WriteThread extends Thread {

	private PrintStream ps;
	
	public WriteThread(PrintStream ps) {
		this.ps = ps;
	}
	
	@Override
	public void run() {
		while(true) {
			Scanner sc = new Scanner(System.in); 
			String str = sc.nextLine();
			ps.println(str);
			ps.flush();
		}
	}
	
}
