package com.tatesuke.tatesuke_aoj.val0._0033;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0033
*/
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfDataset = scanner.nextInt();
		for (int i = 0; i < numberOfDataset; i++) {
			LinkedList<Integer> balls = new LinkedList<Integer>();
			for (int j = 0; j < 10; j++) {
				balls.add(scanner.nextInt());
			}

			boolean result = solve(balls, new Stack<Integer>(), new Stack<Integer>());
			System.out.println((result == true) ? "YES" : "NO");
		}
	}

	private static boolean solve(LinkedList<Integer> balls, Stack<Integer> left, Stack<Integer> right) {
		/* ボールが全て並べられたらtrue */
		if (balls.isEmpty()) {
			return true;
		}

		/* 一番下のボールを取り出す */
		int ball = balls.poll();

		/* まず、左の筒に入れられるようなら入れてみる */
		if (left.isEmpty() || left.peek() < ball) {
			left.push(ball);

			/* 再帰的に実行して並べられたらtrue */
			boolean result = solve(balls, left, right);
			if (result == true) {
				return true;
			}
			left.pop();
		}

		/* ダメなら右側の筒に入れてみる */
		if (right.isEmpty() || right.peek() < ball) {
			right.push(ball);

			/* 再帰的に実行して並べられたらtrue */
			boolean result = solve(balls, left, right);
			if (result == true) {
				return true;
			}
			right.pop();
		}

		balls.addFirst(ball);

		/* 左にも右にも入れられなかったらfalse */
		return false;
	}

}
