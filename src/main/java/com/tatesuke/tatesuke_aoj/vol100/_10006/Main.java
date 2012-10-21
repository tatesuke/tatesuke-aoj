package com.tatesuke.tatesuke_aoj.vol100._10006;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt()) {
			int input = scanner.nextInt();
			if (input == 0) {
				break;
			}
			System.out.println(input);
		}
	}

}
