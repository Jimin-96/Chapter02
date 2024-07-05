package com.javaex.ex09;

public class Goods {

	// 필드
	private String name;
	private int price;
	//static - 공용으로 사용하는 변수
	public static int count;

	
	// 생성자
	public Goods() {

	}

	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		
		this.count++;
	}

	
	// 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getCount() {
		return count;
	}


	//출력
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}

}
