package com.tatesuke.tatesuke_aoj.val0._0009;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/*
Prime Number
Write a program which reads an integer n (n ≤ 999999) and prints the number of prime numbers which are less than or equal to n. A prime number is a natural number which has exactly two distinct natural number divisors: 1 and itself. For example, the first four prime numbers are: 2, 3, 5, 7.

Input
Input consists of several datasets. Each dataset has an integer n in a line.

Output
For each dataset, prints the number of prime numbers.

Sample Input
10
Output for the Sample Input
4
*/
/* エラトステネスのふるいであらかじめ素数リストを作っておく。（でないと時間制限でアウト） */
public class Main {

	private static LinkedList<Integer> primeNumberList;

	public static void main(String[] args) {
		init();

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int n = scanner.nextInt();

			int count = 0;
			for (Integer prime : primeNumberList) {
				if (prime <= n) {
					count++;
				} else {
					break;
				}
			}
			System.out.println(count);
		}
	}

	private static void init() {
		// あらかじめ偶数は弾いておく（ちょっとした差だけどこの問題は時間がシビアなので）
		primeNumberList = new LinkedList<Integer>();
		primeNumberList.add(2);

		LinkedList<Integer> coordinateList = new LinkedList<Integer>();
		for (int i = 3; i <= 999999; i+=2) {
			coordinateList.add(i);
		}

		int prime;
		do {
			prime = coordinateList.poll();
			primeNumberList.add(prime);

			Iterator<Integer> itr = coordinateList.iterator();
			while (itr.hasNext()) {
				int coordinate = itr.next();
				if ((coordinate % prime) == 0) {
					itr.remove();
				}
			}
		} while (!coordinateList.isEmpty() && prime <= Math.sqrt(coordinateList.getLast()));
		primeNumberList.addAll(coordinateList);
	}

}
