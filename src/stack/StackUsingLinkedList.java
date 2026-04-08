package stack;

import java.util.Stack;

class StackUnderFlowException1 extends Exception {
	public StackUnderFlowException1() {
		super("Stack is empty");
	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class StackByLinkedList {
	Node top;
	int size;

	public StackByLinkedList() {
		this.size = 0;
	}

	void print() {
		Node curr = top;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println();
	}

	void push(int element) {
		Node temp = new Node(element);
		temp.next = top;
		top = temp;
		size++;

	}

	int pop() throws StackUnderFlowException1 {
		if (top == null) {
			throw new StackUnderFlowException1();
		}
		int ele = top.data;
		top = top.next;
		size--;
		return ele;

	}

	int size() {
		return size;
	}

	int peek() {
		return top.data;
	}

	boolean isEmpty() {
		return top == null;
	}
}

public class StackUsingLinkedList {

	public static void main(String[] args) throws Exception {
		StackByLinkedList st = new StackByLinkedList();

//		System.out.println(st.size());
//		System.out.println(st.isEmpty());
//		st.push(10);
//		st.push(20);
//		st.push(30);
//		st.push(40);
//		st.push(50);
//		st.print();
//		st.pop();
//		st.pop();
//		System.out.println(st.size());
//		System.out.println(st.peek());
//		System.out.println(st.isEmpty());



	}

}
