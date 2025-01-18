package HackerRank.ProblemSolving;

import java.util.Arrays;

public class SecondLargest {
	int start = 1;

	public void Fibonacci(int n1, int n2, int len) {
		int nextN;
		System.out.print(n1 + " ");
		nextN = n1 + n2;
		n1 = n2;
		n2 = nextN;
		if (start < len) {
			start++;
			Fibonacci(n1, n2, len);

		}
	}

	public static int fib(int n) {
		
		if (n <= 1) { // Base case
			return n;
		} else { // Recursive case
			return fib(n - 1) + fib(n - 2);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Arr1[] = { 2, 3, 4, 5, 10, 37, 18, 36, 40, 17, 37, 40, 59 };
		Arrays.sort(Arr1);

		for (int i : Arr1) {
			System.out.print(i + " ");
		}
		System.out.println();

//		int SL=Arr1.length-2;
		System.out.println(Arr1[Arr1.length - 2]);

		System.out.println("Fibonacci Started...");

		int n = 10;
		int n1 = 0, n2 = 1, nextTerm;
		for (int i = 0; i < n; i++) {
			System.out.println(n1);
			nextTerm = n1 + n2;
			n1 = n2;
			n2 = nextTerm;
		}

		SecondLargest Sl = new SecondLargest();
		Sl.Fibonacci(0, 1, 10);
		
		
		
		 int F = 10; // Example: Find the 10th Fibonacci number
	     System.out.println("Fibonacci number at position " + F + " is: " + fib(F));

	}

}
