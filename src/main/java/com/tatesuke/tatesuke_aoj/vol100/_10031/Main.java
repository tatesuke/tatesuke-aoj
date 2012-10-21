package com.tatesuke.tatesuke_aoj.vol100._10031;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = scanner.nextInt();
		}

		Arrays.sort(S); //ソートは前の問題でやっているのでライブラリ解禁

		int q = scanner.nextInt();
		int[] T = new int[q]; //別に配列作らずに入力して即検索でもいいんだけど、ここは問題に忠実に作ってみた。
		for (int i = 0; i < q; i++) {
			T[i] = scanner.nextInt();
		}

		int C = 0;
		for (int i = 0; i < q; i++) {
			if (contains(S, T[i])) {
				C++;
			}
		}

		System.out.println(C);
	}

	/**
	 * 二分サーチ
	 */
	private static boolean contains(int[] S, int t) {
		int left = 0;
		int right = S.length - 1;

		while (left <= right) {
			int center = (left + right) / 2;
			if (S[center] == t) {
				return true;
			} else if (S[center] < t) {
				left = center + 1;
			} else {
				right = center - 1;
			}
		}

		return false;
	}

}