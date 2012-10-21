package com.tatesuke.tatesuke_aoj.vol100._10004;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] inputs = new int[3];
		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = scanner.nextInt();
		}

		Arrays.sort(inputs);

		for (int i = 0; i < inputs.length; i++) {
			System.out.print(inputs[i]);
			if (i < inputs.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}
