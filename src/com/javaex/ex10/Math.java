package com.javaex.ex10;

public class Math {
	
	//필드 없음
	private static double pi = 3.1415;
	
		//생성자
		//public Math() {}
		
		//메소드gs 필드 없으니까 없음
		
		//메소드 오버로딩 사용
		public static int plus(int a, int b) {
			int sum = a + b;
			return sum;
		}
		
		public static double plus(double a, int b) {
			double sum = a+b;
			return sum;
		}
		
		public static double plus(int a, double b) {
			double sum = a + b;
			return sum;
		}
		
		public static double plus(double a, double b) {
			double sum = a+b;
			return sum;
		}
		
		public static double cicle(int radius) {
			double area = pi*radius*radius;
			return area;
		}

}
