package Lab_3_Queue;

public class Queue {

	private Node head, tail;
	private int size;

	/** Creates a new instance of Queue */
	public Queue() {
		head = tail = null;
		size = 0;
	}

	public boolean full() {
		return false;
	}

	public int length() {
		return size;
	}

	public void enqueue(int e) {
		if (tail == null) {
			head = tail = new Node(e);
		} else {
			tail.next = new Node(e);
			tail = tail.next;
		}
		size++;
	}

	public int serve() {
		int x = head.data;
		head = head.next;
		size--;
		if (size == 0)
			tail = null;

		return x;
	}

	public void display() {
		Node tmp = head;

		while (tmp != tail.next) {
			System.out.print(tmp.data + " , ");
			tmp = tmp.next;
		}
	}

	public void reverse() {
		int[] ss = new int[size];
		Node tmp2 = head;

		for (int i = 0; i < size; i++) { // الى المصفوفة "Queue" اسناد ال
			ss[i] = tmp2.data;
			tmp2 = tmp2.next;
		}

		for (int j = 0, b = size - 1; j < size; j++, b--) { // "Queue" عكس ال
			if (b == size - 1) {
				head.data = ss[b];
				tmp2 = head;
				head = head.next;
			} else {
				head.data = ss[b];
				head = head.next;
			}
		}
		head = tmp2;
	}

}