package com.tatesuke.tatesuke_aoj.val0._0015;

import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0015
 */
//あえてBigIntなんぞ使わずに書く
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int dataSetNumber = scanner.nextInt();
		for (int i = 0; i < dataSetNumber; i++) {
			String input1 = scanner.next();
			String input2 = scanner.next();

			try {
				BigInt bigInt1 = new BigInt(input1);
				BigInt bigInt2 = new BigInt(input2);

				BigInt result = bigInt1.add(bigInt2);
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	/** 80桁の足し算ができる整数 */
	public static class BigInt {
		private static final int MAX_DIGITS = 80;
		private final int[] digits;

		/**
		 * 文字列からBigIntを構築する。最初から桁数をオーバーした入力もあるらしいので、ここでも例外を投げる。
		 * @param bigInt
		 */
		public BigInt(String bigInt) {
			if (MAX_DIGITS < bigInt.length()) {
				throw new ArithmeticException("overflow");
			}

			digits = new int[MAX_DIGITS];
			for (int i = 0; i < bigInt.length(); i++) {
				digits[i] = bigInt.charAt(bigInt.length() - i - 1) - '0';
			}
		}

		private BigInt(int[] digit) {
			this.digits = digit;
		}

		public BigInt add(BigInt bigInt2) {
			int[] result = new int[MAX_DIGITS];

			int carry = add(bigInt2, result, digits.length - 1);
			if (0 < carry) {
				throw new ArithmeticException("overflow");
			}

			return new BigInt(result);
		}

		private int add(BigInt bigInt2, int[] result, int digitNumber) {
			assert 0 <= digitNumber;

			int carryFromLower = (digitNumber == 0) ? 0 : add(bigInt2, result, digitNumber - 1);
			int sum = digits[digitNumber] + bigInt2.digits[digitNumber] + carryFromLower;

			int carry = 0;
			if (10 <= sum) {
				carry = 1;
				sum -= 10;
			}
			result[digitNumber] = sum;

			return carry;
		}

		@Override
		public String toString() {
			StringBuilder buffer = new StringBuilder(digits.length);

			int i = digits.length - 1;
			while ((0 <= i) && (digits[i] == 0)) {
				i--;
			}
			while (0 <= i) {
				buffer.append(digits[i]);
				i--;
			}
			if (buffer.length() == 0) {
				buffer.append(0);
			}

			return buffer.toString();
		}
	}
}
