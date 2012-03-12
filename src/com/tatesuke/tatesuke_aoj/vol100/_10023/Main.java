package com.tatesuke.tatesuke_aoj.vol100._10023;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String input = scanner.next();

			if (input.equals("-")) {
				break;
			}

			StringBuilder buffer = new StringBuilder(input);
			int count = scanner.nextInt();
			for (int i = 0; i < count; i++) {
				int h = scanner.nextInt();

				buffer.append(buffer.subSequence(0, h));
				buffer.delete(0, h);
			}

			System.out.println(buffer.toString());
		}
	}

}