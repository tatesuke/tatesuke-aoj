package com.tatesuke.tatesuke_aoj.val0._0004;

import java.util.Scanner;

/*
Write a program which solve a simultaneous equation:

        ax + by = c
        dx + ey = f
The program should print x and y for given a, b, c, d, e and f(-1000 ≤ a, b, c, d, e, f ≤ 1000). You can suppose that given equation has a unique solution.

Input
The input consists of several data sets, 1 line for each data set. In a data set, there will be a, b, c, d, e, f separated by a single space. The input terminates with EOF.

Output
For each data set, print x and y separated by a single space. Print the solution to three places of decimals. Round off the solution to three decimal places.

Sample Input
1 2 3 4 5 6
2 -1 -2 -1 -1 -5
Output for the Sample Input
-1.000 2.000
1.000 4.000
Hint
try it

2 -1 -3 1 -1 -3
2 -1 -3 -9 9 27
output should be

0.000 3.000
0.000 3.000
 */

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		while (scanner.hasNext()) {
			double a = scanner.nextDouble();
			double b = scanner.nextDouble();
			double c = scanner.nextDouble();
			double d = scanner.nextDouble();
			double e = scanner.nextDouble();
			double f = scanner.nextDouble();

			double x = (c * e - b * f) / (a * e - b * d);
			double y = (a * f - c * d) / (a * e - b * d);

			/* -0.000と表示されるのを防ぐ */
			if ((-0.0004) <= x) {
				x = Math.abs(x);
			}
			if ((-0.0004) <= y) {
				y = Math.abs(y);
			}

			System.out.printf("%.3f %.3f\n", x, y);
		}
	}

}
