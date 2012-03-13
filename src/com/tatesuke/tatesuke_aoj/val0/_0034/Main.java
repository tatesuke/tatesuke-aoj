package com.tatesuke.tatesuke_aoj.val0._0034;

import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0034
*/
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] terms = line.split(",");
			assert terms.length == 12;

			int[] l = new int[10];
			int sum = 0;
			for (int i = 0; i < 10; i++) {
				l[i] = Integer.parseInt(terms[i]);
				sum += l[i];
			}

			int v1 = Integer.parseInt(terms[10]);
			int v2 = Integer.parseInt(terms[11]);

			System.out.println(getNumber(l, sum, v1, v2));
		}
	}
	/*
	 * 線路全体の長さをsumとした時、両者がすれちがう距離（左端起点）は
	 *   v1 * t = sum - (v2 * t)  --式1
	 * となるときである(tはすれちがう時間）
	 * ここで、v1, v2, sumは与えられるので式変形をすると
	 *   t = sum / (v1 - v2)      --式2
	 * が求まる。式2を式1に代入すればすれちがう距離が求まる。
	 */
	private static int getNumber(int[] l, int sum, int v1, int v2) {
		int result = 0;

		double t = (double)sum / (v1 + v2);
		double cross = v1 * t;

		int temp = 0;
		for (int i = 0; i < l.length; i++) {
			temp += l[i];
			if (cross <= temp) {
				result = i + 1;
				break;
			}
		}

		return result;
	}

}
