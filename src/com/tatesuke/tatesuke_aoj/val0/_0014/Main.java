package com.tatesuke.tatesuke_aoj.val0._0014;

import java.util.Scanner;

//http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0014
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt()) {
			int d = scanner.nextInt();

			int s = 0;

			for (int i = 1; i < (600/d); i++) {
				s += f(i * d) * d;
			}

			System.out.println(s);
		}
	}

	static double f(double x) {
		return x * x;
	}

}
