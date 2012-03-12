package com.tatesuke.tatesuke_aoj.vol100._10011;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}

		for (int i = a.length - 1; 0 <= i; i--) {
			System.out.print(a[i]);
			if (0 < i) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}


}