package java0514;

public class Ex6 {

	public static void main(String[] args) {
		// 반복문(for, while, do-while)
		
		// for문 : 일정횟수만큼 반복을 목적으로 함
		// while문: 특정 조건을 만족하는 동안 반복이 주 목적일때
		
//		for (초기식; 조건식; 증감식) {
			// 조건식이 참인 동안 반복실행될 문장;
//		}
		
		// 3회 반복
		for (int i=1; i <= 3; i++) {
			System.out.println(i + ": Hello");
		}
		
		// 1 2 3 4 5 6 7 8 9 10
		for (int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 11 12 13 14 15 16 17 18 19 20
		for (int i=11; i <= 20; i=i+1) { // i+=1
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 0 1 2 3 4 5 6 7 8 9
		for (int i=0; i<10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 2 4 6 8 10 12 14 16 18 20
		for (int i=2; i<=20; i+=2) { // i=i+2
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 10 9 8 7 6 5 4 3 2 1
		for (int i=10; i>=1; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		for (;;) {
//			// 무한반복문
//		}
		
//		for (;true;) {
//			// 무한반복문
//		}
		
//		while (true) {
//			// 무한반복문
//		}
		
		System.out.println("======================");
		
		// for문으로 구구단 2단 출력
		// 출력형식
		// 2 * 1 = 2
		// 2 * 2 = 4
		// 2 * 3 = 6
		// ...
		// 2 * 9 = 18
		for (int i=1; i<=9; i++) {
			System.out.printf("2 * %d = %d%n", i, 2*i);
		}
		
	} // main

}











