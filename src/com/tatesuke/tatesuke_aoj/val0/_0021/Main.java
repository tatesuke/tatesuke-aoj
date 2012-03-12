package com.tatesuke.tatesuke_aoj.val0._0021;

import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0021
*/

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int iterate = scanner.nextInt();
		for (int i = 0; i <iterate; i++) {
			double x1 = scanner.nextDouble();
			double y1 = scanner.nextDouble();
			double x2 = scanner.nextDouble();
			double y2 = scanner.nextDouble();
			double x3 = scanner.nextDouble();
			double y3 = scanner.nextDouble();
			double x4 = scanner.nextDouble();
			double y4 = scanner.nextDouble();

			if (isParallel(x1, y1, x2, y2, x3, y3, x4, y4)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	private static boolean isParallel(double x1, double y1, double x2,
			double y2, double x3, double y3, double x4, double y4) {

		double gradient1 = getGradient(x1, y1, x2, y2);
		double gradient2 = getGradient(x3, y3, x4, y4);

		return gradient1 == gradient2;
	}

	private static double getGradient(double x1, double y1, double x2, double y2) {
		return (y2 - y1) / (x2 - x1);
	}

}
