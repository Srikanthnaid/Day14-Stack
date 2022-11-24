package stack;

public class Stack {
	// Class based variables
	int top;
	int max_size = 4;
	int[] arr = new int[max_size];

	//Stack created
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
		for(int i=1;i<=top;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.stackCreated(56);
		stack.stackCreated(30);
		stack.stackCreated(70);
		stack.printStack();
	}
}
