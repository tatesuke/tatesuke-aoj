package com.tatesuke.tatesuke_aoj.vol100._10009;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double r = scanner.nextDouble();

		double area = r * r * Math.PI;
		double circumference = 2 * r * Math.PI;

		System.out.printf("%.6f %.6f\n", area, circumference);
	}

}