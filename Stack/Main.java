package Lab_4_Stack;

public class Main {
	public static void main(String[] args) {
		LinkedStack<Integer> o1=new LinkedStack<Integer>();
		
		o1.push(1);
		o1.push(2);
		o1.push(3);
		o1.push(4);
		
		o1.pop();
		
		System.out.println("top of the stack: "+ o1.PrintTop());
		System.out.println("Find element '4': "+ o1.Find(4));
		System.out.println("number of element: "+o1.Length());
		
		o1.printAll();// print All element in the stack
	}
}
