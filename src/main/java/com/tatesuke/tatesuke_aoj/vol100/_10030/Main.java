package com.tatesuke.tatesuke_aoj.vol100._10030;

import java.util.Scanner;

/* 数が少ないので愚直に数える */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[] S = new int[n];
		for (int i = 0; i < n; i++) {
			S[i] = scanner.nextInt();
		}

		int q = scanner.nextInt();
		int[] T = new int[q];
		for (int i = 0; i < q; i++) {
			T[i] = scanner.nextInt();
		}

		int C = 0;
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < n; j++) {
				if (T[i] == S[j]) {
					C++;
					break; //Sには重複する要素が含まれる可能性があるので一致した時点でbreakする。
				}
			}
		}

		System.out.println(C);
	}

}