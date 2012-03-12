package com.tatesuke.tatesuke_aoj.vol100._10020;

import java.util.Scanner;

public class Main {

	static int[] count = new int[26];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		while (scanner.hasNext()) {
			String input = scanner.next();
			count(input);
		}

		print();
	}

	private static void count(String str) {
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (('a' <= c) && (c <= 'z')) {
				int index = c - 'a';
				count[index]++;
			}
		}
	}

	private static void print() {
		for (char c = 'a'; c <= 'z'; c++) {
			int index = c - 'a';
			System.out.println(c + " : " + count[index]);
		}
	}

}