package com.javaex.ex17;

public class Point implements Drawable{

	private int x;
	private int y;

	public Point() {
		
	}

	public Point() {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	public void Drawable() {
		
	}

}
