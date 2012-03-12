package com.tatesuke.tatesuke_aoj.val0._0003;

import java.util.Arrays;
import java.util.Scanner;

/*
Is it a Right Triangle?
Write a program which judges wheather given length of three side form a right triangle. Print "YES" if the given sides (integers) form a right triangle, "NO" if not so.

Input
Input consists of several data sets. In the first line, the number of data set, N is given. Then, N lines follow, each line corresponds to a data set. A data set consists of three integers separated by a single space.

Output
For each data set, print "YES" or "NO".

Sample Input
3
4 3 5
4 3 6
8 8 8
Output for the Sample Input
YES
NO
NO
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int loop = scanner.nextInt();

		for (int i = 0; i < loop; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			boolean isRightTriangle = isRightTriangle(a, b, c);
			System.out.println((isRightTriangle) ? "YES" : "NO");
		}
	}

	private static boolean isRightTriangle(int a, int b, int c) {
		if (a <= 0 || b <= 0 || c <= 0) {
			return false;
		}

		int[] temp = {a, b, c};
		Arrays.sort(temp);
		return (temp[0] * temp[0] + temp[1] * temp[1]) == (temp[2] * temp[2]);
	}

}
