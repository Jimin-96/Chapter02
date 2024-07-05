package com.javaex.ex08;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods[] goodsArray = new Goods[2];
		
		Goods computer = new Goods("LG그램",1000000);
		Goods cup = new Goods("머그컵",2000);
		
		goodsArray[0] = computer;
		goodsArray[1] = cup;
		
		System.out.println(computer.toString());
		System.out.println(cup.toString());
		
	}

}
