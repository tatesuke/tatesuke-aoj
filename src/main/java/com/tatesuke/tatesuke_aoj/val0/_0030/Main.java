package com.tatesuke.tatesuke_aoj.val0._0030;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0030
*/
/* なんかこの問題はもっともっといい方法が有りそうだなぁ・・・ */
public class Main {

	private static Set<Set<Integer>> patternSet = new HashSet<Set<Integer>>(); //ここにすでにあるパターンを溜めておく
	private static int n;
	private static int s;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			n = scanner.nextInt();
			s = scanner.nextInt();

			if ((n == 0) && (s == 0)) {
				break;
			}

			int count = solve(0, 0, new TreeSet<Integer>());
			System.out.println(count);
		}

	}

	@SuppressWarnings("unchecked")
	private static int solve(int depth, int sum, TreeSet<Integer> pattern) {
		if (depth == n) {
			if (sum == s && !patternSet.contains(pattern)) {
				patternSet.add((Set<Integer>) pattern.clone());
				return 1;
			}
			return 0;
		}

		int count = 0;
		for (int i = depth; i <= 9; i++) {
			if (pattern.contains(i)) {
				continue;
			}
			if ((sum + i) <= s) {
				pattern.add(i);
				count += solve(depth + 1, sum + i, pattern);
				pattern.remove(i);
			}
		}

		return count;
	}

}
