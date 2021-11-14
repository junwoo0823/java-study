package java0512;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// 문자 ch는 숫자('0' ~ '9')이다.

		Scanner scanner = new Scanner(System.in); // 키보드 입력객체 준비
		char ch = ' ';
		
		System.out.print("문자 한개를 입력하세요: ");
		// 사용자가 입력하고 엔터키를 치면(줄바꿈을 하면)
		// 줄바꿈 문자(\n) 이전까지를 문자열로 반환해줌 
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		// char형은 정수형에 속함 (자바는 아스키 코드가 확장된 유니코드를 사용함)
		System.out.println("입력값: " + ch);
		
		if ('0' <= ch  &&  ch <= '9') {
			System.out.println("입력하신 문자는 숫자입니다.");
		}
		
		if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("입력하신 문자는 영문자입니다.");
		}
	} // main

}







