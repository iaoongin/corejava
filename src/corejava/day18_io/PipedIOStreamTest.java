package corejava.day18_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedIOStreamTest {

	
	public static void main(String[] args) {
		
		PipedOutputStream pos = null;
		PipedInputStream pis = null;
		try {
			pos = new PipedOutputStream();
			pis = new PipedInputStream(pos);
			
			WriteData wd = new WriteData(pos);
			wd.start();
			
			ReadData rd = new ReadData(pis);
			rd.start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
		}
		
	}
}

class WriteData extends Thread{
	
	private PipedOutputStream pos;
	
	
	public WriteData(PipedOutputStream pos) {
		this.pos = pos;
	}

	@Override
	public void run() {
		
		DataOutputStream dos = new DataOutputStream(pos);
		
		try {
			
			for(int i = 1;i<10;i++) {
				dos.writeInt(i);
			}
			dos.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(dos!=null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(pos!=null) {
				try {
					pos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}

class ReadData extends Thread{
	
	private PipedInputStream pis;

	public ReadData(PipedInputStream pis) {
		this.pis = pis;
	}
	
	@Override
	public void run() {
		
		DataInputStream dis = new DataInputStream(pis);
		
		try {
			
			for(int i = 1;i<10;i++) {
				System.out.println(dis.readInt());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			if(dis!=null) {
				try {
					dis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(pis!=null) {
				try {
					pis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}