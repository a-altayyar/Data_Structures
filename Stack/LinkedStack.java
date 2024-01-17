package Lab_4_Stack;

public class LinkedStack<T> {

	public Node<T> top;

	public LinkedStack() {
		top = null;
	}

	public boolean empty() {
		return top == null;
	}

	public boolean full() {
		return false;
	}

	public void push(T e) {
		Node<T> tmp = new Node<T>(e);

		tmp.next = top;
		top = tmp;
	}

	public T pop() {
		if (!empty()) {
			T e = top.data;
			top = top.next;
			return e;
		} else
			return null;
	}

	public T PrintTop() { // - Retrieve the element int from the top of the stack, without removing.
		if (!empty())
			return top.data;

		return null;
	}

	public boolean Find(T e) { // - Find out if there is any element int in the stack.
		Node<T> tmp = top;

		while (tmp != null) {
			if (tmp.data == e)
				return true;
			tmp = tmp.next;
		}
		return false;
	}

	public int Length() { // - Return the number of element int in the stack.
		Node<T> tmp = top;
		int size = 0;

		while (tmp != null) {
			size++;
			tmp = tmp.next;
		}
		return size;
	}

	// WorkSpace
	public void printAll() {
		Node<T> tmp = top;
		while (tmp != null) {
			System.out.print(tmp.data + " ");
			tmp = tmp.next;
		}
	}

}
