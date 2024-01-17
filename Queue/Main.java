package Lab_3_Queue;

public class Main {
	public static void main(String[] args) {

		Queue o1 = new Queue();
		
		o1.enqueue(1);
		o1.enqueue(2);		
		o1.enqueue(3);
		o1.enqueue(4);
		o1.enqueue(5);
		
		o1.serve();
		o1.serve();
		
		o1.enqueue(6);		
		o1.enqueue(7);
		o1.enqueue(8);
		o1.enqueue(9);
		
		o1.reverse();

		o1.display();
	}
}
