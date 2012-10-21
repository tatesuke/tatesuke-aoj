package com.tatesuke.tatesuke_aoj.vol100._10019;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String input = scanner.nextLine();

			if (input.equals("0")) {
				break;
			}

			System.out.println(solve(input));
		}
	}

	private static int solve(String input) {
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (('0' <= c) && (c <= '9')) {
				int integer = (int)c - '0';
				sum += integer;
			}
		}
		return sum;
	}

}