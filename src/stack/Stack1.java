package stack;

import java.util.LinkedList;

public class Stack1 {
	/** created object of LinkedList class **/
	LinkedList linkedList = new LinkedList();
	
	/** add element to the stack. **/
	public void push(int data) {
		if()
	}
	
	/** print method to print stack elements. **/
	public void printStack() {
		System.out.println(linkedList.toString());
	}
	public static void main(String[] args) {
		
		Stack stack = new Stack();
		stack.push(70); // 70 is adding first
		stack.push(30); // 30 is adding second
		stack.push(56); // 56 is adding last
		stack.printStack();
	}
}
