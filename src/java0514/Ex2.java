package java0514;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// 중첩 if문 예제
		
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("점수를 입력하세요> ");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		// 학점 판별
		// 90점대 A         90 <= score  &&  score <= 100
		// 80점대 B         80 <= score  &&  score < 90
		// 70점대 C         70 <= score  &&  score < 80
		
		// if문에서 조건식은 위에서부터 한개씩 따지고 내려오는 방식이다.
		
//		if (score >= 98) {
//			
//		} else if (score >= 94) { // score < 98
//			
//		} else if (score >= 90) {
//			
//		}
		
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) { // score < 98
				opt = '-';
			}
		} else if (score >= 80) { // score < 90
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score < 84) { // score < 98
				opt = '-';
			}
		} else { // score < 80
			grade = 'C';
		}
		
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
		
	} // main

}
