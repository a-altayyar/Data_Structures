package ch3_LinkedList;

public class LinkedList<T> {

	public Node<T> head;
	public Node<T> current;

	public LinkedList() {
		head = current = null;
	}

	public boolean empty() {
		return (head == null);
	}

	public boolean last() {
		return current.next == null;
	}

	public boolean full() {
		return false;
	}

	public void findFirst() {
		current = head;
	}

	public void findNext() {
		current = current.next;
	}

	public T retrieve() {
		return current.data;
	}

	public void update(T val) {
		current.data = val;
	}

	public void insert(T val) {
		Node<T> tmp;
		if (empty()) {
			current = head = new Node<T>(val);
		} else {
			tmp = current.next;
			current.next = new Node<T>(val);
			current = current.next;
			current.next = tmp;
		}
	}

	public void remove() {
		if (current == head) {
			head = head.next;
		} else {
			Node<T> tmp = head;

			while (tmp.next != current)
				tmp = tmp.next;

			tmp.next = current.next;
		}

		if (current.next == null)
			current = head;
		else
			current = current.next;
	}

	public boolean find(T key) {
		Node<T> tmp = current;
		current = head;
		while (current != null) {
			if (current.data.equals(key))
				return true;
			current = current.next;
		}
		current = tmp;
		return false;

		// #2
//		Node<T> tmp = head;
//		while (tmp != null) {
//			if (tmp.data.equals(key)) {
//				current = tmp;
//				return true;
//			}
//			tmp = tmp.next;
//		}
//		return false;

		// #3
//		if (empty() == false) {
//			findFirst();
//			while (last() == false) {
//				if (retrieve().equals(key))
//					return true;
//				findNext();
//			}
//			if (retrieve().equals(key))
//				return true;
//		}
//		return false;
	}

	public void p() {
		Node<T> tmp = current;

		current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		current = tmp;
	}

}
