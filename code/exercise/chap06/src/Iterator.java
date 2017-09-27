package com.xhx.lang;

public interface Iterator<E>{
	// 判断是否有下一个元素
	boolean hasNext();
	// 获取下一个元素
	E next();
	// 删除获取的元素
	void remove();
}

