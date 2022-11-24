package stack;

public class QueueDemoLL {

	public static void main(String[] args) {
		Queue ob = new Queue();
		LNode head = null;

		head = ob.enqueue(head, 56);
		head = ob.enqueue(head, 30);
		head = ob.enqueue(head, 70);
		ob.display(head);
		
	}
}