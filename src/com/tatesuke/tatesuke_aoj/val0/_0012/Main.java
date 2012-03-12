package com.tatesuke.tatesuke_aoj.val0._0012;

import java.awt.geom.Point2D;
import java.util.Scanner;

// http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0012

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNextDouble()) {
			double x1 = scanner.nextDouble();
			double y1 = scanner.nextDouble();
			double x2 = scanner.nextDouble();
			double y2 = scanner.nextDouble();
			double x3 = scanner.nextDouble();
			double y3 = scanner.nextDouble();
			double xp = scanner.nextDouble();
			double yp = scanner.nextDouble();

			Point2D.Double p1 = new Point2D.Double(x1, y1);
			Point2D.Double p2 = new Point2D.Double(x2, y2);
			Point2D.Double p3 = new Point2D.Double(x3, y3);
			Point2D.Double p = new Point2D.Double(xp, yp);

			/*
			 * p1→p2→p3で時計回りになるように並び替え
			 * p1を原点としてp2とp3の外積の大きさが負なら反時計回りなのでp2とp3を入れ替える。
			 */
			if (outerProduct(p1, p2, p3) <= 0.0) {
				Point2D.Double temp = p2;
				p2 = p3;
				p3 = temp;
			}

			/*
			 * pの内外判断
			 * p1→p2→p3→p1と時計回りに回って行く時、pが常に左側にあればその点はその経路の内側にある。
			 */
			if (0.0 <= outerProduct(p1, p2, p)
					&& 0.0 <= outerProduct(p2, p3, p)
					&& 0.0 <= outerProduct(p3, p1, p)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}

	}

	/**
	 * p0を原点としたp1とp2の外積の<b>大きさ<b>を返す
	 */
	private static double outerProduct(Point2D.Double p0, Point2D.Double p1, Point2D.Double p2) {
		return (p1.x - p0.x) * (p2.y - p0.y) - (p2.x - p0.x) * (p1.y - p0.y);
	}

}
