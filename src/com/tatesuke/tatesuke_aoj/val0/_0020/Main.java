package com.tatesuke.tatesuke_aoj.val0._0020;

import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0020
*/
// String#toUpperCaseは使わずにね。
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String text = scanner.nextLine();

		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (('a' <= c) && (c <= 'z')) {
				c = (char)(c - 'a' + 'A');
			}
			buffer.append(c);
		}

		System.out.println(buffer.toString());
	}

}
