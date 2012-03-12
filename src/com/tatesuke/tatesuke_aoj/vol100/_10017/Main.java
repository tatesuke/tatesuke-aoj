package com.tatesuke.tatesuke_aoj.vol100._10017;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int n = scanner.nextInt();
			int x = scanner.nextInt();

			if (n == 0 && x == 0) {
				break;
			}

			System.out.println(solve(n, x));
		}
	}

	private static int solve(int n, int x) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				for (int k = j + 1; k <= n; k++) {
					if ((i + j + k) == x) {
						count++;
					}
				}
			}
		}

		return count;
	}


}