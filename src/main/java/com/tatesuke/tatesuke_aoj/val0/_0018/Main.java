package com.tatesuke.tatesuke_aoj.val0._0018;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0018
*/
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Integer[] numbers = new Integer[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]  = scanner.nextInt();
		}

		Arrays.sort(numbers, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return b - a;
			}
		});

		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < numbers.length; i++) {
			buffer.append(numbers[i]).append(" ");
		}
		buffer.delete(buffer.length() - 1, buffer.length());
		System.out.println(buffer.toString());
	}

}
