package com.xhx.lang;

public interface List<E>{
		// 在数组最后加入数据
		boolean add(E obj);
		// 在指定索引的位置加入数据
		void add(int index,E obj);
		// 清空所有元素
		void clear();
		// 集合中是否包含对象
		boolean contains(Object obj);
		// 根据索引查找对象
		E get(int index);
		// 根据对象查找对象所在的位置的索引
		int indexOf(Object obj);
		// 判断集合是否为空
		boolean isEmpty();
		// 根据索引删除对象
		E remove(int index);
		// 将对象从集合中删除
		boolean remove(Object obj);
		// 替换指定位置的对象,并返回原对象
		E set(int index,E obj);
		// 返回当前集合的元素个数
		int size();
		// 返回迭代器对象
		Iterator<E> iterator();
}
