package com.tatesuke.tatesuke_aoj.val0._0002;

import java.util.Scanner;

/*
Digit Number
Write a program which computes the digit number of sum of two integers a and b

Input
There are several test cases. Each test case consists of two non-negative integers a and b which are separeted by a space in a line. The input terminates with EOF.

Output
Print the number of digits of a + b for each data set.

Sample Input
5 7
1 99
1000 999
Output for the Sample Input
2
3
4

 */
public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextInt()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int digitNumber = getDigitNumber(a, b);
			System.out.println(digitNumber);
		}

	}

	private static int getDigitNumber(int a, int b) {
		int temp = a + b;

		int digitNumber = 0;
		while (0 < temp) {
			digitNumber++;
			temp /= 10;
		}

		return digitNumber;
	}

}
