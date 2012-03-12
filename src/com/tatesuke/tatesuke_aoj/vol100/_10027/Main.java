package com.tatesuke.tatesuke_aoj.vol100._10027;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int taroPoint = 0;
		int hanakoPoint = 0;
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			String taro = scanner.next();
			String hanako = scanner.next();

			if (0 < taro.compareTo(hanako)) {
				taroPoint += 3;
			} else if (taro.compareTo(hanako) < 0) {
				hanakoPoint += 3;
			} else {
				taroPoint++;
				hanakoPoint++;
			}
		}

		System.out.println(taroPoint + " " + hanakoPoint);
	}
	
}