package nsb;

import java.util.Scanner;

class EquilateralTriangle {
	double findArea(double a) {
		return a * a * Math.sqrt(3) / 4.0;
	}
}
class Square {
	double findArea(double a) {
		return a * a;
	}
}
class Circle {
	double findArea(double r) {
		return Math.PI * r * r;
	}
}
public class NSB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String shape = sc.next();
			if (shape.equals("E")) {
				double a = sc.nextDouble();
				EquilateralTriangle e = new EquilateralTriangle();
				System.out.printf("%.2f\n", e.findArea(a));
			} else if (shape.equals("S")) {
				double a = sc.nextDouble();
				Square s = new Square();
				System.out.printf("%.2f\n", s.findArea(a));
			} else if (shape.equals("C")) {
				double r = sc.nextDouble();
				Circle c = new Circle();
				System.out.printf("%.2f\n", c.findArea(r));
			} else {
				System.out.printf("-1\n");
			}
		}
	}
}
