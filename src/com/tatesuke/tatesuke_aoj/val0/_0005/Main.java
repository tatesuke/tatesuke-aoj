package com.tatesuke.tatesuke_aoj.val0._0005;

import java.util.Scanner;

/*
GCD and LCM
Write a program which computes the greatest common divisor (GCD) and the least common multiple (LCM) of given a and b (0 < a, b ≤ 2,000,000,000). You can supporse that LCM(a, b) ≤ 2,000,000,000.

Input
Input consists of several data sets. Each data set contains a and b separated by a single space in a line. The input terminates with EOF.

Output
For each data set, print GCD and LCM separated by a single space in a line.

Sample Input
8 6
50000000 30000000
Output for the Sample Input
2 24
10000000 150000000
 */

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			long a = scanner.nextInt();
			long b = scanner.nextInt();


			long gcd = getGCD(a, b);
			long lcm = getLCM(a, b);
			System.out.println(gcd + " " + lcm);
		}
	}

	private static long getGCD(long a, long b) {
		if (b == 0) {
			return a;
		} else {
			return getGCD(b, a % b);
		}
	}

	private static long getLCM(long a, long b) {
		return (a * b) / getGCD(a, b);
	}

}
