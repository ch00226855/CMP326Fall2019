import java.util.ArrayList;

public class FibonacciNumber {

	public static int fib(int n) {
		/*
		 * Return the n-th Fibonacci number.
		 */
		if (n < 2) {
			return n;
		} else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static long fib2(int n) {
		/*
		 * Calculate the first n Fibonacci numbers,
		 * return the last one.
		 */
		long[] fibList = new long[n+1];
		for (int i = 0; i <= n; i++) {
			if (i == 0) {
				fibList[i] = 0;
			} else if (i == 1) {
				fibList[i] = 1;
			} else {
				fibList[i] = fibList[i - 1] + fibList[i - 2];
			}
		}
		return fibList[n];
	}
	
	public static void addNthFibNum(ArrayList<Long> list, int n) {
		if (n == 0) {
			list.add((long) 0);
		} else if (n == 1) {
			addNthFibNum(list, 0);
			list.add((long) 1);
		} else {
			addNthFibNum(list, n-1);
			list.add(list.get(n-1) + list.get(n-2));
		}
	}
	
	public static void main(String[] args) {
//		System.out.println(fib(0));
//		System.out.println(fib(1));
//		System.out.println(fib(5));
		System.out.println(fib2(100));
		
		ArrayList<Long> fibList = new ArrayList<Long>();
		int n = 100;
		addNthFibNum(fibList, n);
		System.out.println(fibList.get(n));
	}

}
