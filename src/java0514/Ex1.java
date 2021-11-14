package java0514;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// if - else if문 예제
		
		int score = 0;
		char grade = ' ';
		
		System.out.print("점수를 입력하세요> ");
		
		Scanner scanner = new Scanner(System.in);
		
		score = scanner.nextInt();
		
		// 학점 판별
		// 90점대 A         90 <= score  &&  score <= 100
		// 80점대 B         80 <= score  &&  score < 90
		// 70점대 C         70 <= score  &&  score < 80
		// 70점 미만 D      score < 70
		
		// if문에서 조건식은 위에서부터 한개씩 따지고 내려오는 방식이다.
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) { // score < 90
			grade = 'B';
		} else if (score >= 70) { // score < 80
			grade = 'C';
		} else {
			grade = 'D';
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
		
	} // main

}
