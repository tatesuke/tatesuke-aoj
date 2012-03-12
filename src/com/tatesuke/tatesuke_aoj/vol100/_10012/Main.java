package com.tatesuke.tatesuke_aoj.vol100._10012;

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
			for (int j = 0; j < w; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
	}

}