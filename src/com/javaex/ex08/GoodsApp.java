package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods("LG그램",1000000);
		Goods cup = new Goods("머그컵",2000);
		
		System.out.println(computer.toString());
		System.out.println(cup.toString());
		
	}

}
