package com.tatesuke.tatesuke_aoj.val0._0027;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0027
*/
/* 日数も少ないので1月1日からの日付を数える感じ */
public class Main {

	static final List<String> week;
	static final List<Integer> NUMBER_OF_MONTH;

	static {
		week = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Saturday", "Sunday");
		NUMBER_OF_MONTH = Arrays.asList(31, 29, 31, 30, 31, 30, 31, 31, 30, 31,
				30, 31);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			int month = scanner.nextInt();
			int day = scanner.nextInt();

			if ((month == 0) && (day == 0)) {
				break;
			}

			int weekIndex = 3; //1月1日はThursday
			OUTER_LOOP:
			for (int i = 1; i <= month; i++) {
				int numberOfMonth = NUMBER_OF_MONTH.get(i - 1);
				for (int j = 1; j <= numberOfMonth; j++) {
					if ((i == month) && (j == day)) {
						break OUTER_LOOP;
					}
					weekIndex = (weekIndex + 1) % week.size();
				}
			}

			System.out.println(week.get(weekIndex));
		}

	}

}
