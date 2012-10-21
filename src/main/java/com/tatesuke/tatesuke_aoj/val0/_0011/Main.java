package com.tatesuke.tatesuke_aoj.val0._0011;

import java.util.Scanner;

// http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0011

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int vertical = scanner.nextInt();
		int horizontal = scanner.nextInt();

		int[] result = new int[vertical];
		for (int i = 0; i < vertical; i++) {
			result[i] = i + 1;
		}

		for (int i = 0; i < horizontal; i++) {
			String[] term = scanner.next().split(",");
			int a = Integer.parseInt(term[0]);
			int b = Integer.parseInt(term[1]);

			swap(result, a, b);
		}

		for (Integer i : result) {
			System.out.println(i);
		}
	}

	private static void swap(int[] result, int a, int b) {
		int temp = result[a - 1];
		result[a - 1] = result[b - 1];
		result[b - 1] = temp;
	}

}
