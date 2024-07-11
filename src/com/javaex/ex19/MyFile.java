package com.javaex.ex19;

public class MyFile {

	// 필드

	// 셍성자

	// 메소드gs

	// 메소드일반
	// 파일읽기
	public String read(String path) {

		// path의 파일을 읽어서 문자열을 추출

		String result = "학교종이 땡땡땡 어서모이자";
		return result;

	}

	public String read2(String path) {

		String result = "";

		try {
			// path의 파일을 찾는다 (파일이 없다 예외 발생)
			// 파일의 내용을 읽는다
			throw new IOException();
		} catch (IOException e) {
			System.out.println("파일이 없습니다");
		}

		return result;

	}

}
