package java0510;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// 키보드로부터 값을 입력받기
		
		// 키보드 입력을 받을수 있는 스캐너 객체를 준비
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요: ");
		int a = scanner.nextInt();
		
		System.out.print("두번째 정수를 입력하세요: ");
		int b = scanner.nextInt();
		
		int c = a + b;
		
		System.out.println("입력한 두 정수의 합 : " + c);
	} // main

}
