package com.tatesuke.tatesuke_aoj.val0._0028;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0028
*/
public class Main {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int maxCount = -1;
		List<Integer> modeNumberList = new LinkedList<Integer>();
		Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();

		while (scanner.hasNextInt()) {
			int input = scanner.nextInt();

			Integer count = countMap.get(input);
			if (count == null) {
				count = 0;
			}
			count++;
			countMap.put(input, count);

			if (maxCount == count) {
				modeNumberList.add(input);
			} else if (maxCount < count) {
				modeNumberList.clear();
				modeNumberList.add(input);
				maxCount = count;
			}
		}

		Collections.sort(modeNumberList);
		for (Integer modeNumber : modeNumberList) {
			System.out.println(modeNumber);
		}

	}

}
