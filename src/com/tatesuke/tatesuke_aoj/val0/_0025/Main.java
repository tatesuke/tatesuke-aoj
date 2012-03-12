package com.tatesuke.tatesuke_aoj.val0._0025;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0025
*/

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int[] a = new int[4];
			int[] b = new int[4];
			for (int i = 0; i < a.length; i++) {
				a[i] = scanner.nextInt();
			}
			for (int i = 0; i < b.length; i++) {
				b[i] = scanner.nextInt();
			}

			hitAndBlow(a, b);
		}

	}

	private static void hitAndBlow(int[] a, int[] b) {
		List<Integer> list = new ArrayList<Integer>();

		int hit = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b[i]) {
				hit++;
			} else {
				list.add(b[i]);
			}
		}

		int blow = 0;
		for (Integer b2 : list) {
			for (Integer a2 : a) {
				if (a2 == b2) {
					blow++;
				}
			}
		}
		System.out.println(hit + " " + blow);
	}

}
