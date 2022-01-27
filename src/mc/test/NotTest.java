package mc.test;

import java.util.*;

import mc.ys.lesson10.IntQueue.OverflowIntQueueException;

public class NotTest {

	public static void main(String[] args) {
//		System.out.println(factorial(3));
		int[] a = {5, 8, 3, 6, 5, 4, 2};
		
		insertionSort(a, 7);
		for(int e: a) {
			System.out.println(e);
		}
		

	}

	static int factorial(int n) {
		if (n > 0)
			return n * factorial(n - 1);
		else
			return 1;
	}

	static void insertionSort(int[] a, int n) {
		for (int i = 1; i < n; i++) {
			int j;
			int tmp = a[i];

			for (j = i; j > 0 && a[j - 1] > tmp; j--)
				a[j] = a[j - 1];
			
			a[j] = tmp;
		}
	}
	


}
