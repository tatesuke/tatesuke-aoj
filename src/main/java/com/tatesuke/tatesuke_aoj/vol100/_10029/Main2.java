package com.tatesuke.tatesuke_aoj.vol100._10029;

import java.util.Scanner;

/* クイックソート版 */
public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}

		qSort(0, array.length - 1, array);
		showArray(array);
	}


	 private static void showArray(int[] array) {
		 for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
				if (i < (array.length - 1)) {
					System.out.print(" ");
				}
			}
			System.out.println();
	}


	private static void qSort(int left, int right, int[] array) {
		int l = left;
		int r = right;
		int pivot = array[(left+right) / 2];

		while (true) {
			while (array[l] < pivot) {
				l++;
			}
			while (pivot < array[r]) {
				r--;
			}

			if (r <= l) {
				break;
			}

			int temp = array[l];
			array[l] = array[r];
			array[r] = temp;
			l++;
			r--;
		}

		if (left < (l - 1)) {
			qSort(left, l - 1, array);
		}
		if ((r + 1) < right) {
			qSort(r + 1, right, array);
		}
	}

}