package com.tatesuke.tatesuke_aoj.vol100._10018;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.nextLine();

		System.out.println(solve(input));
	}

	private static String solve(String input) {
		StringBuilder buffer = new StringBuilder(input.length());

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (('a' <= c) && (c <= 'z')) {
				buffer.append((char)(c - 'a' + 'A'));
			} else if (('A' <= c) && (c <= 'Z')) {
				buffer.append((char)(c - 'A' + 'a'));
			} else {
				buffer.append(c);
			}
		}

		return buffer.toString();
	}


}