package com.tatesuke.tatesuke_aoj.vol100._10022;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String w = scanner.next().toLowerCase();

		int count = 0;
		while (true) {
			String input = scanner.next();

			if (input.equals("END_OF_TEXT")) {
				break;
			}

			if (w.equals(input.toLowerCase())) {
				count++;
			}
		}

		System.out.println(count);
	}

}