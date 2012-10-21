package com.tatesuke.tatesuke_aoj.val0._0006;

import java.util.Scanner;

/*
Reverse Sequence
Write a program which reverses a given string str.

Input
str (the size of str ≤ 20)

Output
Reversed str

Sample Input
w32nimda
Output for the Sample Input
admin23w
*/

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String input = scanner.next();
		for (int i = input.length() - 1; 0 <= i; i--) {
			char c = input.charAt(i);
			System.out.print(c);
		}
		System.out.println();
	}

}
