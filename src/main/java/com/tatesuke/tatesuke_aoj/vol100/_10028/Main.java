package com.tatesuke.tatesuke_aoj.vol100._10028;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		sort(array);

		for (int i = 0; i < n; i++) {
			System.out.print(array[i]);
			if (i < (n - 1)) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	/* バブルソートで */
	private static void sort(int[] array) {
		for (int i = 0; i < (array.length - 1); i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}

}