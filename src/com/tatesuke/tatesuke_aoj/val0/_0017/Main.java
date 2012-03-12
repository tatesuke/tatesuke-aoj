package com.tatesuke.tatesuke_aoj.val0._0017;

import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0017
*/
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			String cipher = scanner.nextLine();
			String plain = "";
			for (int i = 0; i <= 25; i++) { //もともと暗号化されていない文も入力されるらしいのでゼロから
				plain = encrypt(cipher, i);
				if (isPlain(plain)) {
					System.out.println(plain);
					break;
				}
			}
		}
	}

	private static String encrypt(String cipher, int shift) {
		StringBuilder buffer = new StringBuilder(cipher.length());

		for (int i = 0; i < cipher.length(); i++) {
			char c = cipher.charAt(i);
			if (('a' <= c) && (c <= 'z')) {
				c = (char)(((c - 'a' + shift) % 26) + 'a');
			}
			buffer.append(c);
		}

		return buffer.toString();
	}

	private static boolean isPlain(String string) {
		return string.matches(".*the.*|.*this.*|.*that.*");
	}
}
