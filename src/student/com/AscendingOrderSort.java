package student.com;

import java.util.Scanner;

public class AscendingOrderSort {
	public static void main() {
		int n, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of elements");
		n = sc.nextInt();
		int[] ab = new int[n];
		System.out.println("enter all elements");
		for (int i = 0; i < n; i++) {
			ab[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				temp = ab[i];
				ab[i] = ab[j];
				ab[j] = temp;
			}
		}
		System.out.println("Ascending Order:");
		for (int i = 0; i < n - 1; i++) {
			System.out.println(ab[i] + " ");
		}
		System.out.println(ab[n - 1]);
	}
}
