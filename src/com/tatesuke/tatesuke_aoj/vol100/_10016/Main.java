package com.tatesuke.tatesuke_aoj.vol100._10016;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int chukan = scanner.nextInt();
			int kimatu = scanner.nextInt();
			int saishi = scanner.nextInt();

			if (chukan == -1 && kimatu == -1 && saishi == -1) {
				break;
			}

			System.out.println(getLank(chukan, kimatu, saishi));
		}
	}

	private static char getLank(int chukan, int kimatu, int saishi) {
		if (chukan == -1 || kimatu == -1) { //欠席は-1で与えられるらしい
			return 'F';
		}
		if (80 <= (chukan + kimatu)) {
			return 'A';
		}
		if ((65 <= (chukan + kimatu)) && ((chukan + kimatu) < 80)) {
			return 'B';
		}
		if ((50 <= (chukan + kimatu)) && ((chukan + kimatu)) < 65) {
			return 'C';
		}
		if ((30 <= (chukan + kimatu)) && ((chukan + kimatu) < 50)) {
			if (50 <= saishi) {
				return 'C';
			} else {
				return 'D';
			}
		}
		assert (chukan + kimatu) < 30;
		return 'F';
	}

}