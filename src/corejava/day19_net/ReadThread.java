package corejava.day19_net;

import java.io.BufferedReader;
import java.io.IOException;

public class ReadThread extends Thread{

	private BufferedReader br;

	public ReadThread(BufferedReader br) {
		this.br = br;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				String str = br.readLine();
				if(str!=null)
					System.out.println(str);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		}
	}
	
}
