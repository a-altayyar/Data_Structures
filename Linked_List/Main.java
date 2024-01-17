package ch3_LinkedList;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		LinkedList<Integer> A = new LinkedList<Integer>();
		System.out.println("Enter num: ");
		for (int i = 0; i < 3; i++) {
			int x = input.nextInt();
			A.insert(x);
		}
		A.remove();
		A.p();

		
	}
}
