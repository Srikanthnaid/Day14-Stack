package stack;

class LNode {

	int data;
	LNode next;

	// constructor
	LNode(int d) {
		data = d;
	}
}

class Queue {
	// enqueue means added elements to the queue.
	public LNode enqueue(LNode head, int a) {
		LNode tmp = new LNode(a);
		if (head == null)
			head = tmp;
		else {
			LNode tmp1 = head;
			while (tmp1.next != null) {
				tmp1 = tmp1.next;
			}
			tmp1.next = tmp;
		}
		return head;
	}

	public void display(LNode head) {

		System.out.println("\nqueue elements is : ");
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