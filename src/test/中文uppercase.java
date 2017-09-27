package test;

import java.io.UnsupportedEncodingException;

public class 中文uppercase {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "流芳百世";
		str = new String(str.getBytes(),"UTF-8");
		System.out.println(str.toUpperCase());
	}
	
}
