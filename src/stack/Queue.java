package stack;

class LNode {

	int data;
	LNode next;

	LNode(int d) {
		data = d;
	}
}

public class Queue {
	
	// enqueue
	public LNode enqueue(LNode head, int a) {
		LNode tmp = new LNode(a);
		if (head == null)
			head = tmp;
		else {
			LNode tmp1 = head;
			while (tmp1.next != null)
				tmp1 = tmp1.next;

			tmp1.next = tmp;
		}
		return head;
	}

	// Dequeue
	public LNode dequeue(LNode head) {
		if (head == null)
			System.out.println("underflow");
		else
			head = head.next;
		return head;
	}

	// display queue
	public void display(LNode head) {

		System.out.println("\n list is : ");
		if (head == null) {

			System.out.println("no LNodes");

			return;
		}

		LNode tmp = head;

		while (tmp != null) {

			System.out.print(tmp.data + " ");

			tmp = tmp.next;

		}
	}

}