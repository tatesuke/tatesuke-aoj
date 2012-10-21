package com.tatesuke.tatesuke_aoj.val0._0001;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/*
List of Top 3 Hills
There is a data which provides heights (in meter) of mountains. The data is only for ten mountains.

Write a program which prints heights of the top three mountains in descending order.

Input
height of mountain 1 (integer)
height of mountain 2 (integer)
height of mountain 3 (integer)
 .
 .
 .
height of mountain 10 (integer)
Output
height of the 1st mountain
height of the 2nd mountain
height of the 3rd mountain
Sample Input
1819
2003
876
2840
1723
1673
3776
2848
1592
922
Output for the Sample Input
3776
2848
2840

 * */
public class Main {

	public static void main(String[] args) {
		List<Integer> inputs = new ArrayList<Integer>();

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int input = scanner.nextInt();
			inputs.add(input);
		}

		Collections.sort(inputs, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}

		});

		for (int i = 0; i < 3; i++) {
			System.out.println(inputs.get(i));
		}
	}

}
