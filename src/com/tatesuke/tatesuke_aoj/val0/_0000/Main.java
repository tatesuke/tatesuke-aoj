package com.tatesuke.tatesuke_aoj.val0._0000;

/**
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0000
Write a program which prints multiplication tables in the following format:
1x1=1
1x2=2
.
.
9x8=72
9x9=81
Input
No input.

Output
1x1=1
1x2=2
.
.
9x8=72
9x9=81
 */
public class Main{

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(String.format("%dx%d=%d", i, j, i * j));
			}
		}
	}

}
