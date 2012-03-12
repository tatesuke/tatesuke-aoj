package com.tatesuke.tatesuke_aoj.val0._0031;

import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0031
*/
/* 貧浴法（だよね？） */
public class Main {

	private static int[] WEIGHTS = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt()) {
			int weightOfObject = scanner.nextInt();

			boolean[] useFlag = new boolean[WEIGHTS.length];

			int sumOfWeights = 0;
			for (int i =  WEIGHTS.length - 1; 0 <= i; i--) {
				if ((sumOfWeights + WEIGHTS[i]) <= weightOfObject) {
					sumOfWeights += WEIGHTS[i];
					useFlag[i] = true;
				}
			}

			StringBuilder buffer = new StringBuilder();
			for (int i = 0; i < useFlag.length; i++) {
				if (useFlag[i] == true) {
					buffer.append(WEIGHTS[i]).append(" ");
				}
			}
			buffer.delete(buffer.length() - 1, buffer.length());
			System.out.println(buffer.toString());
		}

	}

}
