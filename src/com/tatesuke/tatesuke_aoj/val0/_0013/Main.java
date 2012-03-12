package com.tatesuke.tatesuke_aoj.val0._0013;

import java.util.Scanner;
import java.util.Stack;

//http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0013
public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scanner = new Scanner(System.in);

		do {
			int input = scanner.nextInt();

			if (input == 0) {
				System.out.println(stack.pop());
			} else {
				stack.push(input);
			}
		} while(scanner.hasNextInt());

	}

}
