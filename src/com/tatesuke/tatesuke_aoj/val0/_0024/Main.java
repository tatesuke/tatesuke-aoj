package com.tatesuke.tatesuke_aoj.val0._0024;

import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0024
*/

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			double minimumVelocity = scanner.nextDouble();
			System.out.println(getMinimumFloor(minimumVelocity));
		}

	}

	private static int getMinimumFloor(double v) {
		double minimumY = 4.9 * (v / 9.8) * (v / 9.8);
		return (int)((minimumY + 5) / 5) + 1;
	}

}
