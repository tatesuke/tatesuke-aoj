package com.tatesuke.tatesuke_aoj.val0._0023;

import java.awt.geom.Point2D;
import java.util.Scanner;

/*
http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0023
*/

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int iteration = scanner.nextInt();
		for (int i = 0; i < iteration; i++) {
			double xa = scanner.nextDouble();
			double ya = scanner.nextDouble();
			double ra = scanner.nextDouble();
			double xb = scanner.nextDouble();
			double yb = scanner.nextDouble();
			double rb = scanner.nextDouble();

			Circle a = new Circle(xa, ya, ra);
			Circle b = new Circle(xb, yb, rb);

			if (a.contains(b)) {
				System.out.println("2");
			} else if (b.contains(a)){
				System.out.println("-2");
			} else if (a.isCloss(b)){
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}

	public static class Circle {

		private final Point2D.Double p;
		private final double r;

		public Circle(double x, double y, double r) {
			this.p = new Point2D.Double(x, y);
			this.r = r;
		}

		public boolean contains(Circle b) {
			double distance = p.distance(b.p);
			return (distance + b.r) < r; //ちょっとでも重なってたらfalse
		}

		public boolean isCloss(Circle b) {
			double distance = p.distance(b.p);
			return distance <= (r + b.r);
		}

	}

}
