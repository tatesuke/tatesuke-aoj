package com.tatesuke.tatesuke_aoj.vol100._10029;

import java.util.Scanner;

/* バケツソートを使ってみたかった */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] array = new int[n];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
			max = Math.max(max, array[i]);
			min = Math.min(min, array[i]);
		}

		bucketSort(array, max, min);

		for (int i = 0; i < n; i++) {
			System.out.print(array[i]);
			if (i < (n - 1)) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	private static void bucketSort(int[] array, int max, int min) {
		int[] backet = new int[max - min + 1];
		int offset = -min;

		for (int i=0; i <array.length; i++) {
			backet[array[i] + offset]++;
		}

		int index = 0;
		for (int i = 0; i < backet.length; i++) {
			if (backet[i] == 0) {
				continue;
			}
			for (int j = 0; j < backet[i]; j++) {
				array[index] = i - offset;
				index++;
			}
		}
	}

}