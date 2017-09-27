package com.xhx.exercise.chap06;

public class StackQueueTest {
	public static void main(String[] args) {

        System.out.println("Stack......");
		MyStack stack = new MyStack();
		stack.push(new Integer(1));
		stack.push(new Integer(2));
		stack.push(new Integer(3));
		System.out.println(stack.pop());
		stack.push(new Integer(4));
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		stack.push(new Integer(5));
		System.out.println(stack.pop());
		System.out.println(stack.pop());

        System.out.println("Queue........");
		MyQueue queue = new MyQueue();
		queue.in(new Integer(1));
		queue.in(new Integer(2));
		queue.in(new Integer(3));
		System.out.println(queue.out());
		queue.in(new Integer(4));
		System.out.println(queue.out());
		System.out.println(queue.out());
		System.out.println(queue.out());
		System.out.println(queue.out());
		queue.in(new Integer(5));
		System.out.println(queue.out());
		System.out.println(queue.out());

	}
}

