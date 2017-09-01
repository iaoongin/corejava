package corejava.day18_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOStreamTest {

	public static void main(String[] args) {

		String filePath = "C:\\Users\\XHX\\Desktop\\qaq.txt";
		
//		writeData(filePath);
		
		readData(filePath);
	}

	public static void writeData(String filePath) {

		int i =100;
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {

			fos = new FileOutputStream(filePath);

			dos = new DataOutputStream(fos);

			dos.writeInt(i);


		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			if(dos!=null) {
				try {
					dos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(fos!=null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void readData(String filePath) {
		DataInputStream dis = null;
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(filePath);
			dis = new DataInputStream(fis);
			int readInt = dis.readInt();
			
			System.out.println(readInt);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
