package com.tatesuke.tatesuke_aoj.val0._0036;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0036
*/
public class Main {

	private static final List<Integer[][]> PATTERNS;
	
	static {
		List<Integer[][]> patterns = new ArrayList<Integer[][]>();
		patterns.add(new Integer[][]{
				{1, 1},
				{1, 1}
		});
		patterns.add(new Integer[][] {
				{1},
				{1},
				{1},
				{1}
		});
		patterns.add(new Integer[][] {
				{1, 1, 1, 1}	
		});
		patterns.add(new Integer[][] {
				{0, 1},
				{1, 1},
				{1, 0}
		});
		patterns.add(new Integer[][] {
				{1, 1, 0},
				{0, 1, 1}
		});
		patterns.add(new Integer[][] {
				{1, 0},
				{1, 1},
				{0, 1}
		});
		patterns.add(new Integer[][] {
				{0, 1, 1},
				{1, 1, 0}
		});
		PATTERNS = Collections.unmodifiableList(patterns);
	}
	
	private static final Scanner scanner = new Scanner(System.in);
	private static int[][] input;
	
	public static void main(String[] args) {
		
		while (scanner.hasNext()) {
			input();
			solve();
		}
	}

	private static void input() {
		input = new int[8][8];
		for (int row = 0; row < input.length; row++) {
			String line = scanner.nextLine();
			if (line.trim().equals("")) {
				line = scanner.nextLine();
			}
			assert line.length() == 8;
			
			for (int column = 0; column < input[row].length; column++) {
				int i = line.charAt(column) - '0';
				input[row][column] = i;
				assert (i == 1) || (i ==0);
			}
		}
	}

	private static void solve() {
		for (int row = 0; row < input.length; row++) {
			for (int column = 0; column < input[row].length; column++) {
				for (int i = 0; i < PATTERNS.size(); i++) {
					Integer[][] pattern = PATTERNS.get(i);
					if (matches(row, column, pattern)) {
						System.out.println((char)(i + 'A'));
						return;
					}
				}
			}
		}
	}

	private static boolean matches(int row, int column, Integer[][] pattern) {
		for (int i = 0; i < pattern.length; i++) {
			for (int j = 0; j < pattern[i].length; j++) {
				if ((input.length == row + i)
						|| (input[row + i].length == column + j)
						|| (pattern[i][j] != input[row + i][column + j])) {
					return false;
				}
			}
		}
		
		return true;
	}
	
}
