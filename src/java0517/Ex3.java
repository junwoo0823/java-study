package java0517;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// do-while문 : 조건식에 관계없이 한번 수행이 보장되는 특징 있음
		
//		do {
//			반복실행될 문장;
//		} while (조건식);

		// 숫자 맞추기 게임
		// : 컴퓨터가 생각한 숫자를 사람이 맞추는 게임
		
		int input = 0, answer = 0;
		
		// 1~100 사이의 임의의 수를 저장
		answer = (int) (Math.random() * 100) + 1;
		System.out.println("answer = " + answer);
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1과 100사이의 정수를 입력하세요.> ");
			input = scanner.nextInt();
			
			if (input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while (input != answer); // input == answer
		
		
//		while (true) {
//			System.out.print("1과 100사이의 정수를 입력하세요.> ");
//			input = scanner.nextInt();
//			
//			if (input > answer) {
//				System.out.println("더 작은 수로 다시 시도해보세요.");
//			} else if (input < answer) {
//				System.out.println("더 큰 수로 다시 시도해보세요.");
//			} else { // input == answer
//				System.out.println("정답입니다.");
//				break;
//			}
//		}
		
		
		//System.out.println("정답입니다.");
		
	} // main

}



