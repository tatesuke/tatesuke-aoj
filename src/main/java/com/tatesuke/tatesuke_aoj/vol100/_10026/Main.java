package com.tatesuke.tatesuke_aoj.vol100._10026;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int n = scanner.nextInt();

			if (n == 0) {
				break;
			}

			int[] s = new int[n];
			for (int i = 0; i < n; i++) {
				s[i] = scanner.nextInt();
			}

			System.out.printf("%.8f\n",solve(s));
		}
	}

	private static double solve(int[] s) {
		int n = s.length;

		double m = 0.0;
		for (int i=0; i < n; i++) {
			m += s[i];
		}
		m /= n;

		double a = 0.0;
		for (int i = 0; i < n; i++) {
			a += (s[i] - m) * (s[i] - m);
		}
		a /= n;

		return Math.sqrt(a);
	}

}