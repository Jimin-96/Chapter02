package com.javaex.ex19;

public class MyFileApp {
	
	public static void main(String[]args) {
		
		MyFile mf = new MyFile();
		String str = mf.read("c/school.txt");	
		
		System.out.println(str);
		
		String str2 = mf.read2("c/school.txt");
		}

}
