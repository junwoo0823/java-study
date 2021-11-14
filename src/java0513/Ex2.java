package java0513;

public class Ex2 {

	public static void main(String[] args) {
		// 제어문(조건문, 반복문)
		// 조건문 : if while do-while

		// 코드 블럭에서 변수의 수명주기

		{
			int a = 5;
		}
		// a = a + 1; // 코드블럭 안에 선언된 변수는 코드블럭을 벗어나면 사용불가능.
		// System.out.println("a = " + a);

//		if (조건식) {
//			// 조건식이 참일때 실행문;
//		}

		int score = 50;

		if (score > 60) {
			System.out.println("합격입니다.");
			System.out.println("축하드립니다.");
		}

		int num = 7;
		// 조건문을 이용해서 a변수값이 음수면 양수로 만들기
		if (num < 0) { // 음수이면
			num = -num; // num = num * -1;
		}
		System.out.println("절대값: " + num);

		System.out.println("===========================");

		int a = 30;
		int b = 20;
		int max = 0; // 큰값을 저장할 변수

		if (a > b) {
			max = a;
		} else { // a <= b
			max = b;
		}
		System.out.println("최대값: " + max);

		System.out.println("====================");

		// 짝수
		// 홀수
		a = 6;
		if (a % 2 == 1) {
			System.out.println(a + "는 홀수입니다.");
		} else { // a % 2 == 0
			System.out.println(a + "는 짝수입니다.");
		}
		
		// 최소값 구하기
		a = 30;
		b = 20;
		int min = 0;
		
		if (a < b) {
			min = a;
		} else { // a >= b
			min = b;
		}
		System.out.println("최소값: " + min);
		
		System.out.println("====================");
		
		
		// 변수 a 값의 경우에 따라  "양수", "영", "음수" 출력하기
		// 다중 if문
		a = -2;
		
		// 중첩 if문
//		if (a > 0) {
//			System.out.println("양수");
//		} else { // a <= 0
//			if (a == 0) {
//				System.out.println("영");
//			} else { // a < 0
//				System.out.println("음수");
//			}
//		}
		
		// 다중 if문
		if (a > 0) {
			System.out.println("양수");
		} else if (a == 0) {
			System.out.println("영");
		} else { // a < 0
			System.out.println("음수");
		}
	} // main

}



