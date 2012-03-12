package com.tatesuke.tatesuke_aoj.vol100._10010;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int a = scanner.nextInt();
			String op = scanner.next();
			int b = scanner.nextInt();

			if (op.equals("?")) {
				break;
			}

			System.out.println(calc(a, op, b));
		}
	}

	private static int calc(int a, String op, int b) {
		int result;
		if (op.equals("+")) {
			result = a + b;
		} else if (op.equals("-")) {
			result = a - b;
		} else if (op.equals("*")) {
			result = a * b;
		} else {
			assert op.equals("/");
			result = a / b;
		}

		return result;
	}

}