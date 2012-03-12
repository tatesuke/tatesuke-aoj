package com.tatesuke.tatesuke_aoj.val0._0032;

import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0032
*/
public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfRectangles = 0;
		int numberOfLozenges = 0;
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] term = line.split(",");

			int s1 = Integer.parseInt(term[0]);
			int s2 = Integer.parseInt(term[1]);
			int d = Integer.parseInt(term[2]);

			if (isLozenge(s1, s2, d)){
				numberOfLozenges++;
			} else if (isRectangle(s1, s2, d)) {
				numberOfRectangles++;
			}
		}

		System.out.println(numberOfRectangles);
		System.out.println(numberOfLozenges);
	}

	private static boolean isLozenge(int s1, int s2, int d) {
		if ((s1 <= 0) || (s2 <= 0) || (d <= 0)) {
			return false;
		}

		return  (s1 == s2) && (d < (s1 + s2));  //2辺が等しくて2辺の和よりもdが小さければひし形
	}

	private static boolean isRectangle(int s1, int s2, int d) {
		if ((s1 <= 0) || (s2 <= 0) || (d <= 0)) {
			return false;
		}

		return (s1 * s1 + s2 * s2) == (d * d); // 直角三角形なら長方形
	}

}
