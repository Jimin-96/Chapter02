package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {

		Drawable[] draw = new Drawable[4];

		Drawable p01 = new Point(3, 6);
		Drawable r01 = new Rectangle(2, 4, "빨강", "노랑");
		Drawable c01 = new Circle(10, "빨강", "검정");
		Drawable t01 = new Triangle(30, 30, "빨강", "검정");
		
		draw[0] = p01;
		draw[1] = r01;
		draw[2] = c01;
		draw[3] = t01;

	}

}
