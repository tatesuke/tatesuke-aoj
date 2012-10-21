package com.tatesuke.tatesuke_aoj.vol100._10032;

import java.util.Scanner;

public class Main {

	static char[] stack = new char[1000];
	static int pointer = -1;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			String command = scanner.next();
			if (command.equals("quit")) {
				break;
			} else if (command.equals("push")) {
				String color = scanner.next();
				pointer++;
				stack[pointer] = color.charAt(0);
			} else {
				assert command.equals("pop");
				System.out.println(stack[pointer]);
				pointer--;
			}
		}

	}

}