package com.tatesuke.tatesuke_aoj.vol100._10008;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.printf("%d %d %.5f\n", (a / b), (a % b), ((double)a / b));
	}

}