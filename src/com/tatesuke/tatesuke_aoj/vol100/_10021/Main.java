package com.tatesuke.tatesuke_aoj.vol100._10021;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		String[] inputs = new String[n];

		for (int i = 0; i < n; i++) {
			inputs[i] = scanner.next();
		}

		Arrays.sort(inputs);

		System.out.println(inputs[0]);
	}


}