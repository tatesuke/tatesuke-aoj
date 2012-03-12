package com.tatesuke.tatesuke_aoj.val0._0022;

import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0022
*/

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int n = scanner.nextInt();
			if (n == 0) {
				break;
			}

			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextInt();
			}

			System.out.println(solve(a));
		}
	}

	private static int solve(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			int sum = a[i];
			max = Math.max(max, sum);
			for (int j = i + 1; j < a.length; j++) {
				sum = Math.max(a[j], a[j] + sum);
				max = Math.max(max, sum);
			}
		}
		return max;
	}

}
