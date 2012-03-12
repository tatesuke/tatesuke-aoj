package com.tatesuke.tatesuke_aoj.vol100._10015;

import java.util.Scanner;

public class Main {

	static boolean[][] cards = new boolean[4][13];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int loop = scanner.nextInt();

		for (int i = 0; i < loop; i++) {
			String mark = scanner.next();
			int number = scanner.nextInt() - 1;

			int markNumber;
			if (mark.equals("S")) {
				markNumber = 0;
			} else if (mark.equals("H")) {
				markNumber = 1;
			} else if (mark.equals("C")) {
				markNumber = 2;
			} else {
				assert mark.equals("D");
				markNumber = 3;
			}

			cards[markNumber][number] = true;
		}

		printCards();
	}

	private static void printCards() {
		for (int i = 0; i < cards.length; i++) {
			for (int j = 0; j < cards[i].length; j++) {
				if (cards[i][j]) {
					continue;
				}

				String mark;
				switch (i) {
				case 0:
					mark = "S";
					break;
				case 1:
					mark = "H";
					break;
				case 2:
					mark = "C";
					break;
				default:
					assert i == 3;
					mark = "D";
					break;
				}

				System.out.println(mark + " " + (j + 1));
			}
		}

	}

}