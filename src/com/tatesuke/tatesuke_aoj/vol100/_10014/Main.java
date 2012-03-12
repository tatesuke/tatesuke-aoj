package com.tatesuke.tatesuke_aoj.vol100._10014;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int h = scanner.nextInt();
			int w = scanner.nextInt();

			if ((w == 0) && (h == 0)) {
				break;
			}

			printRectangle(w, h);
		}
	}

	private static void printRectangle(int w, int h) {
		for (int i = 0; i < h; i++) {
			char c = ((i % 2) == 0) ? '#' : '.';
			for (int j = 0; j < w; j++) {
				System.out.print(c);
				c = (c == '#') ? '.' : '#';
			}
			System.out.println();
		}
		System.out.println();
	}

}