package com.tatesuke.tatesuke_aoj.val0._0026;

import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0026
*/

public class Main {

	static final int[][][] PATTERN = {
		{
			{0,1,0},
			{1,1,1},
			{0,1,0}
		},
		{
			{1,1,1},
			{1,1,1},
			{1,1,1}
		},
		{
			{0,0,1,0,0},
			{0,1,1,1,0},
			{1,1,1,1,1},
			{0,1,1,1,0},
			{0,0,1,0,0}
		}

	};

	static int[][] paper = new int[10 + 4][10 + 4]; //10*10+番兵
	static int zeroCount = 0;
	static int maxDensity = Integer.MIN_VALUE;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String line = scanner.nextLine();
			String[] terms = line.split(",");
			int x = Integer.parseInt(terms[0]);
			int y = Integer.parseInt(terms[1]);
			int size = Integer.parseInt(terms[2]);

			drop(x, y, size);
		}

		countParameter();

		System.out.println(zeroCount);
		System.out.println(maxDensity);
	}


	private static void countParameter() {
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				int density = paper[x + 2][y + 2];
				if (density == 0) {
					zeroCount++;
				}
				maxDensity = Math.max(maxDensity, density);
			}
		}
	}


	private static void drop(int x, int y, int size) {
		int[][] pattern = PATTERN[size - 1];

		int baseX = x - (pattern.length - 1) / 2 + 2;
		int baseY = y - (pattern.length - 1) / 2 + 2;

		for (int i = 0; i < pattern.length; i++) {
			for (int j = 0; j < pattern[i].length; j++) {
				if (pattern[i][j] == 1) {
					paper[baseY + i][baseX + j]++;
				}
			}
		}
	}


}
