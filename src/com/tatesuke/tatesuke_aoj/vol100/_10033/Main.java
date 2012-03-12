package com.tatesuke.tatesuke_aoj.vol100._10033;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {


	static List<Stack<String>> stackList = new ArrayList<Stack<String>>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			stackList.add(new Stack<String>());
		}

		while (true) {
			String command = scanner.next();
			if (command.equals("quit")) {
				break;
			} else if (command.equals("push")) {
				int p = scanner.nextInt() - 1;
				String color = scanner.next();
				stackList.get(p).push(color);
			} else if (command.equals("pop")) {
				int p = scanner.nextInt() - 1;
				System.out.println(stackList.get(p).pop());
			} else {
				assert command.equals("move");
				int p1 = scanner.nextInt() - 1;
				int p2 = scanner.nextInt() - 1;

				Stack<String> p1Stack = stackList.get(p1);
				Stack<String> p2Stack = stackList.get(p2);

				p2Stack.push(p1Stack.pop());
			}
		}

	}

}