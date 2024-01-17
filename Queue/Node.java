
package Lab_3_Queue;

public class Node {

	public int data;
	public Node next;

	public Node() {
		data = 0;
		next = null;
	}

	public Node(int val) {
		data = val;
		next = null;
	}

// setter && Getter
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
