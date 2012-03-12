package com.tatesuke.tatesuke_aoj.val0._0016;

import java.util.Scanner;

//http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0016
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double x = 0;
		double y = 0;
		int angle = 90;
		while (true) {
			String line = scanner.next();
			String[] term = line.split(",");

			int step = Integer.parseInt(term[0]);
			int angle2 = Integer.parseInt(term[1]);

			if ((step == 0) && (angle2 == 0)) {
				break;
			}

			x += step * cos(angle);
			y += step * sin(angle);

			angle -= angle2;
		}
		System.out.println((int)x);
		System.out.println((int)y);
	}

	private static double sin(int angle) {
		return Math.sin(Math.toRadians(angle));
	}

	private static double cos(int angle) {
		return Math.cos(Math.toRadians(angle));
	}

}
