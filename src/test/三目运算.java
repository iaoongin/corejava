package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class 三目运算 {

	@Test
	public void test1() throws Exception {
		int a = 0;
		int b = 0;
		b = true?3:++a;
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test
	public void test2() throws Exception {
		int a = 0;
		int b = 0;
		b = a!=b?++a:3;
		System.out.println(a);
		System.out.println(b);
	}
	
	@Test
	public void addadd() throws Exception {
		
		int i = 12;
		i=i+=--i;
		
		System.out.println(i);
	}
}
