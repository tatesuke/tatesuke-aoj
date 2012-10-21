package com.tatesuke.tatesuke_aoj.val0._0019;

import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0019
*/
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		long n = scanner.nextLong();

		System.out.println(factorial(n));
	}

	private static long factorial(long n) { //longじゃないとn = 20 とかの時精度が足りない
		if (n == 0) {
			return 0;
		}
		if (n == 1){
			return 1;
		}

		return n * factorial(n - 1);
	}

}
