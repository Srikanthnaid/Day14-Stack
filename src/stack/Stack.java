package stack;

import java.util.Scanner;

public class Stack {
	// Class based variables
	int top;
	int max_size = 4;
	int[] arr = new int[max_size];

	// Stack created
	public void stackCreated(int element) {
		// checking stack is empty or not
		if (top == -1) {
			System.out.println("stack is empty");
		} else {

			top++;
			arr[top] = element;
			System.out.println(element + " is inserted into the stack and top is: " + top);
		}

	}

	public void printStack() {
		System.out.println("stack elements");
		for (int i = 1; i <= top; i++) {
			System.out.println(arr[i]);
		}
	}

	// peek operation
	public void peek() {
		if(top == 0) {
			System.out.println("stack is empty");
		}else {
			System.out.println("peek of stack is "+top);
		}
	}
	
	public void pop(int element) {
		top--;
		System.out.println(element+" is deleted from stack now top is "+top);
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Stack stack = new Stack();
		stack.stackCreated(56);
		stack.stackCreated(30);
		stack.stackCreated(70);
		stack.peek();// calling peek method to fetch the first element.
		while(true) {
			System.out.println("Enter 1 to pop 70  \nEnter 2 to pop 30  \nenter 3 to pop 56  \nEnter 4 to dispaly  \nEnter 5 to exit");
			int input = s.nextInt();
			switch (input) {
			case 1 -> stack.pop(70);
			case 2 -> stack.pop(30);
			case 3 -> stack.pop(70);
			case 4 ->stack.printStack();
			case 5 ->System.exit(0);
			}
		stack.peek();
	
		}
	}
}
