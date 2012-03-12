package com.tatesuke.tatesuke_aoj.val0._0008;

import java.util.Scanner;

/*
Sum of 4 Integers
Write a program which reads an integer n (n ≤ 50) and identifies the number of combinations of a, b, c, and d (0 ≤ a, b, c, d ≤ 9) which meet the following equality:

        a + b + c + d = n
For example, for n = 35, we have 4 different combinations of (a, b, c, d): (8, 9, 9, 9), (9, 8, 9, 9), (9, 9, 8, 9), (9, 9, 9, 8).

Input
The input consists of several datasets. Each dataset consists of n in a line.

Output
Print the number of combination in a line.

Sample Input
35
1
Output for the Sample Input
4
4
*/

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt()) {
			int n = scanner.nextInt();

			//a, b c dは０～９なので組み合わせ数は10^4。愚直にループを回して問題ない。
			int numberOfCombination = 0;
			for (int a = 0; a <= 9; a++) {
				for (int b = 0; b <= 9; b++) {
					for (int c = 0; c <= 9; c++) {
						for (int d = 0; d <= 9; d++) {
							if ((a + b + c + d) == n) {
								numberOfCombination++;
							}
						}
					}
				}
			}

			System.out.println(numberOfCombination);
		}

	}


}
