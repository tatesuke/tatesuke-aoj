package com.tatesuke.tatesuke_aoj.vol100._10025;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double degree = scanner.nextDouble();

		double xa = a;
		double ya = 0.0;
		double xb = b * Math.cos(Math.toRadians(degree));
		double yb = b * Math.sin(Math.toRadians(degree));

		double h = yb;
		double s = a * h / 2.0;
		double l = a + b + Math.sqrt((xb - xa) * (xb - xa) + (yb - ya) * (yb - ya));

		System.out.printf("%.8f\n", s);
		System.out.printf("%.8f\n", l);
		System.out.printf("%.8f\n", h);
	}

}