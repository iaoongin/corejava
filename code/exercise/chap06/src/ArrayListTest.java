package com.xhx.lang;

public class ArrayListTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		for(int i=0;i<10;i++){
			list.add("string"+i);
		}
		System.out.println("contains (\"string5\") :"+list.contains("string5"));
		list.remove("string9");
		list.add(3,"string9");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
	}
}
