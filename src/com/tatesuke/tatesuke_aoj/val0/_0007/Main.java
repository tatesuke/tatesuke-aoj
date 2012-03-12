package com.tatesuke.tatesuke_aoj.val0._0007;

import java.util.Scanner;

/*
 Debt Hell
Your friend who lives in undisclosed country is involved in debt. He is borrowing 10-man yen from a loan shark. The loan shark adds 5% interest of the debt and rounds it to the nearest sen above week by week.

Write a program which computes the amount of the debt in n weeks. ( n ≤ 100)

Input
integer n

Output
amout of the debt

Sample Input
5
Output for the Sample Input
130000
 * */

public class Main {

	public static void main(String[] args) {
		int week = new Scanner(System.in).nextInt();

		int money = 100000;
		for (int i = 0; i < week; i++) {
			money = (int) (money * 1.05); //1000円未満切り上げだから1.05倍してもdoubleの精度は不要
			money = round1000(money);
		}

		System.out.println(money);
	}

	private static int round1000(int money) {
		if (1 <= (money % 1000)) {
			money = money + 1000 - (money % 1000);
		}
		return money;
	}


}
