package com.tatesuke.tatesuke_aoj.val0._0029;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0029
*/
public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String maximumLengthWord = null;

		String mostFrequentlyWord = null;
		int maxCount = -1;
		Map<String, Integer> countMap = new HashMap<String, Integer>();

		while (scanner.hasNext()) {
			String word = scanner.next();

			if (maximumLengthWord == null ||
					maximumLengthWord.length() <= word.length()) {
				maximumLengthWord = word;
			}

			Integer count = countMap.get(word);
			if (count == null) {
				count = 0;
			}
			count++;
			countMap.put(word, count);

			if (maxCount < count) {
				maxCount = count;
				mostFrequentlyWord = word;
			}
		}

		System.out.println(mostFrequentlyWord + " " + maximumLengthWord);
	}

}
