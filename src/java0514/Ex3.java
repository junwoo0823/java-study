package java0514;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// switch 조건문
		// switch문은 if문으로 항상 표현가능
		// if문은 switch문으로 표현 불가능할 수도 있음!
		
		// 사용자가 입력한 월에 해당하는 계절 이름을 출력하기
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("현재 월을 입력하세요.> ");
		int month = scanner.nextInt();
		
		// break문: 자신을 감싸는 가장 가까운 switch문 또는 반복문을 빠져나옴
		
		switch (month) {
		case 3: // month == 3 || month == 4 || month == 5
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		//case 12: case 1: case 2:
		default:
			System.out.println("현재의 계절은 겨울입니다.");
		}
		
	} // main

}






